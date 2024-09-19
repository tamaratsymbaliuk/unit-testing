package chessBoard;

import jdk.jshell.Snippet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    @Test
    // canAddPawn(), write code to allow an instance of the Pawn class to be added to an
        // instance of the ChessBoard at a square on the board using chess notation (a1, c3, etc.).
        //Then, assert that the pawn is actually at that location on the board by calling a method
        //on the board to retrieve a piece by location.
    void canAddPawn() {
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(ChessPiece.Color.WHITE);

        // Add the pawn to position a2
        board.add(pawn, "a2");
        // Retrieve the pawn from the position and assert it is the same pawn
        Pawn foundPawn = (Pawn) board.getPieceAtCoords("a2");
        assertEquals(pawn, foundPawn);
    }
    @Test
    // Do the same as but for a Knight, to get canAddKnight() working. The method
    // to add a pawn should also be able to accept a knight.
    public void canAddKnight() {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(ChessPiece.Color.BLACK);

        board.add(knight, "c1");

        ChessPiece foundKnight = board.getPieceAtCoords("c1");
        assertEquals(knight, foundKnight);
    }


    @Test
    void getPieceAtCoords() {
        // Create a new chessboard and add a piece
        ChessBoard board = new ChessBoard();
        Pawn pawn = new Pawn(ChessPiece.Color.WHITE);
        board.add(pawn, "b4");

        // Retrieve the piece and assert it matches
        ChessPiece piece = board.getPieceAtCoords("b4");
        assertEquals(pawn, piece, "The piece at b4 should be the white pawn.");
        assertNull(board.getPieceAtCoords("c3"), "No piece should be at c3.");
    }

    @Test
    void move() {
        ChessBoard board = new ChessBoard();
        Knight knight = new Knight(ChessPiece.Color.WHITE);
        Pawn pawn = new Pawn(ChessPiece.Color.BLACK);
        board.add(knight, "g1");
        board.add(pawn, "f3");
        board.move(knight, "f3");
        assertEquals(knight, board.getPieceAtCoords("f3"), "The knight should have moved to f3.");
        assertNull(board.getPieceAtCoords("g1"), "The knight should no longer be at g1.");
        assertEquals(1, board.getWhiteCapturedPieces().size(), "White should have captured 1 piece.");
        assertEquals(pawn, board.getWhiteCapturedPieces().get(0), "The captured piece should be the black pawn.");
    }

    @Test
    void getWhiteCapturedPieces() {
        ChessBoard board = new ChessBoard();
        Pawn whitePawn = new Pawn(ChessPiece.Color.WHITE);
        Pawn blackPawn = new Pawn(ChessPiece.Color.BLACK);
        board.add(whitePawn, "e2");
        board.add(blackPawn, "d4");
        board.move(whitePawn, "d4");
        assertEquals(1, board.getWhiteCapturedPieces().size(), "White captured pieces count should be 1.");
        assertEquals(blackPawn, board.getWhiteCapturedPieces().get(0), "Captured piece should be the black pawn.");
    }

    @Test
    void getBlackCapturedPieces() {
        ChessBoard board = new ChessBoard();
        Pawn whitePawn = new Pawn(ChessPiece.Color.WHITE);
        Pawn blackPawn = new Pawn(ChessPiece.Color.BLACK);
        board.add(blackPawn, "e7");
        board.add(whitePawn, "d5");
        board.move(blackPawn, "d5");
        assertEquals(1, board.getBlackCapturedPieces().size(), "Black captured pieces count should be 1.");
        assertEquals(whitePawn, board.getBlackCapturedPieces().get(0), "Captured piece should be the white pawn.");
    }
}