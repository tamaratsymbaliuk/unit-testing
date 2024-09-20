package chessBoard;

public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove) {
        for (Coordinates curCoords : moves) {
            if (curCoords.equals(expectedMove)) return true;
        }
        return false;
    }
}
