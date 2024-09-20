package chessBoard;

public abstract class ChessPiece {
    protected Coordinates coordinates;
    protected Color color;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    protected int calcYWithDirFactor(int yOffset) {
        int dirFactor = color == Color.WHITE ? -1 : 1; // if pawn is black -1 * -1 will result in positive offset
        return yOffset * dirFactor;
    }

    abstract Coordinates[] getValidMoves();

    public enum Color {
        BLACK, WHITE
    }
}
