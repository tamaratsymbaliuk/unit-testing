package chessBoard;

public class Main {
    public static void main(String[] args) {
        // Create a new chessboard
        ChessBoard chessBoard = new ChessBoard();

        // Add white knight at position g1
        ChessPiece whiteKnight = new Knight(ChessPiece.Color.WHITE);
        chessBoard.add(whiteKnight, "g1");
        System.out.println("Added White Knight at g1");

        // Add black pawn at position f3
        ChessPiece blackPawn = new Pawn(ChessPiece.Color.BLACK);
        chessBoard.add(blackPawn, "f3");
        System.out.println("Added Black Pawn at f3");

        // Move the white knight to capture the black pawn at f3
        chessBoard.move(whiteKnight, "f3");
        System.out.println("White Knight moved to f3 and captured Black Pawn");

        // Display the captured pieces
        System.out.println("White Captured Pieces: " + chessBoard.getWhiteCapturedPieces().size());
        System.out.println("Black Captured Pieces: " + chessBoard.getBlackCapturedPieces().size());

        // Attempt to move the white knight to an invalid position
        chessBoard.move(whiteKnight, "h5");
        System.out.println("Attempted to move White Knight to h5 (Invalid Move)");

        // Add white pawn at position e2
        ChessPiece whitePawn = new Pawn(ChessPiece.Color.WHITE);
        chessBoard.add(whitePawn, "e2");
        System.out.println("Added White Pawn at e2");

        // Move white pawn to e4 (two squares forward from starting position)
        chessBoard.move(whitePawn, "e4");
        System.out.println("White Pawn moved to e4");

        // Output the current state of the board
        printBoardState(chessBoard);
    }

    private static void printBoardState(ChessBoard chessBoard) {
        System.out.println("Current Board State:");
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                ChessPiece piece = chessBoard.getPieceAtCoords(String.format("%c%d", 'a' + x, 8 - y));
                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(getPieceSymbol(piece) + " ");
                }
            }
            System.out.println();
        }
    }

    private static String getPieceSymbol(ChessPiece piece) {
        // Simple symbols for visualization: K for Knight, P for Pawn, etc.
        if (piece instanceof Knight) {
            return piece.color == ChessPiece.Color.WHITE ? "N" : "n";
        } else if (piece instanceof Pawn) {
            return piece.color == ChessPiece.Color.WHITE ? "P" : "p";
        }
        return "?"; // For any other piece types
    }
}
