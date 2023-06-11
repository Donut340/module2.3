package src;

public enum Rank {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private int value;

    /**
     * Constructs a Rank with the given value.
     *
     * @param value the numerical value of the rank
     */
    Rank(int value) {
        this.value = value;
    }

    /**
     * Gets the numerical value of the rank.
     *
     * @return the numerical value of the rank
     */
    public int getValue() {
        return value;
    }
}
