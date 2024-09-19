package chessBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChessBoard {
    private ChessPiece[][] internalBoard = new ChessPiece[8][8];
    private List<ChessPiece> whiteCapturedPieces = new ArrayList<>();
    private List<ChessPiece> blackCapturedPieces = new ArrayList<>();

    public void add(ChessPiece piece, String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        piece.setCoordinates(coords);
        internalBoard[coords.getX()][coords.getY()] = piece;
    }

    public ChessPiece getPieceAtCoords(String chessCoords) {
        Coordinates coords = new Coordinates(chessCoords);
        return internalBoard[coords.getX()][coords.getY()];
    }

    public void move(ChessPiece piece, String destCoords) {
        Coordinates origin = piece.getCoordinates();
        Coordinates destination = new Coordinates(destCoords);

        if (destinationIsOccupiedByFriendly(piece, destination)) {
            return;
        } else if (destinationIsOccupiedByEnemy(piece, destination)) {
            ChessPiece capturedPiece = getPieceAtCoords(destCoords);
            capturedPiece.setCoordinates(null);
            if (piece.color == ChessPiece.Color.WHITE) {
                whiteCapturedPieces.add(capturedPiece);
            } else {
                blackCapturedPieces.add(capturedPiece);
            }
        }

        // Check if the move is within the valid moves of the piece
        if (existsAmongValidMoves(piece.getValidMoves(), destination)) {
            performActualMove(piece, destCoords, origin, destination);
        }
    }

    private boolean existsAmongValidMoves(Coordinates[] validMoves, Coordinates destination) {
        if (validMoves == null) return false;
        for (Coordinates move : validMoves) {
            if (move.equals(destination)) return true;
        }
        return false;
    }

    private void performActualMove(ChessPiece piece, String destCoords, Coordinates origin, Coordinates destination) {
        internalBoard[origin.getX()][origin.getY()] = null; // Remove from original square
        add(piece, destCoords);
    }

    private boolean destinationIsOccupiedByFriendly(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color == piece.color;
    }

    private boolean destinationIsOccupiedByEnemy(ChessPiece piece, Coordinates destination) {
        ChessPiece destinationPiece = internalBoard[destination.getX()][destination.getY()];
        return destinationPiece != null && destinationPiece.color != piece.color;
    }

    public List<ChessPiece> getWhiteCapturedPieces() {
        return whiteCapturedPieces;
    }

    public List<ChessPiece> getBlackCapturedPieces() {
        return blackCapturedPieces;
    }
}