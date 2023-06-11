package src;

public class Card {
    private Rank rank;
    private Suit suit;

    /**
     * Constructs a Card with the given rank and suit.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Gets the rank of the card.
     *
     * @return the rank of the card
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Gets the suit of the card.
     *
     * @return the suit of the card
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the numerical value of the card.
     *
     * @return the numerical value of the card
     */
    public int getValue() {
        return rank.getValue();
    }

    /**
     * Returns a string representation of the card.
     *
     * @return a string representation of the card
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
