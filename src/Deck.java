package src;

import java.util.*;

public class Deck {
    private LinkedList<Card> cards;

    /**
     * Constructs a Deck object with a standard deck of 52 cards.
     */
    public Deck() {
        cards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    /**
     * Shuffles the cards in the deck randomly.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Draws a card from the top of the deck.
     *
     * @return the drawn card
     */
    public Card draw() {
        return cards.poll();
    }
}
