package chessBoard;

public class Knight extends ChessPiece {
    public Knight(Color color) {
        super(color);
    }
    @Override
    Coordinates[] getValidMoves() {
        Coordinates[] validMoves = new Coordinates[8];

        validMoves[0] = getCoordinates().withOffset(1, calcYWithDirFactor(-2)); // north-east
        validMoves[1] = getCoordinates().withOffset(-1, calcYWithDirFactor(-2)); // north-west
        validMoves[2] = getCoordinates().withOffset(2, calcYWithDirFactor(-1)); // east-north
        validMoves[3] = getCoordinates().withOffset(2, calcYWithDirFactor(1)); // east-south
        validMoves[4] = getCoordinates().withOffset(-2, calcYWithDirFactor(-1)); // west-north
        validMoves[5] = getCoordinates().withOffset(-2, calcYWithDirFactor(1)); // west-south
        validMoves[6] = getCoordinates().withOffset(1, calcYWithDirFactor(2)); // south-east
        validMoves[7] = getCoordinates().withOffset(-1, calcYWithDirFactor(2)); // south-west
        return validMoves;
    }
}
