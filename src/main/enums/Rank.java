package enums;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10); // equivalent to Rank KING = new Rank("KING");

    private int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        /*return switch (this) {
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
        };
         */
        return value;
    }
}
