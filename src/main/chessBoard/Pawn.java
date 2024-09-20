package chessBoard;

public class Pawn extends ChessPiece {
    private boolean hasMoved = false;

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public Coordinates[] getValidMoves() {
        int numOfPossibleMoves = hasMoved ? 3 : 4;
        Coordinates[] validMoves = new Coordinates[numOfPossibleMoves];

        Coordinates forwardOne = getCoordinates().withOffset(0, calcYWithDirFactor(1)); // -1 because we're using array notation, so to move up we need to do -1
        validMoves[0] = forwardOne;

        Coordinates diagonallyRightOne = getCoordinates().withOffset(1, calcYWithDirFactor(1));
        validMoves[1] = diagonallyRightOne;

        Coordinates diagonallyLeftOne = getCoordinates().withOffset(-1, calcYWithDirFactor(1));
        validMoves[2] = diagonallyLeftOne;

        if (!hasMoved) {
            Coordinates forwardTwo = getCoordinates().withOffset(0, calcYWithDirFactor(2));
            validMoves[3] = forwardTwo;
        }
        return validMoves;
    }

    @Override
    public void setCoordinates(Coordinates coordinates) {
        if (this.coordinates != null) {
            hasMoved = true;
        }
        super.setCoordinates(coordinates);
    }
}