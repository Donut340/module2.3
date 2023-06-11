package src;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            hand.add(deck.draw());
        }

        // Sort the hand of cards by suits and numerical value
        Comparator<Card> suitComparator = new SuitComparator().thenComparing(new NumericalValueComparator());
        hand.sort(suitComparator);

        // Print the sorted hand of cards
        System.out.println("Sorted Hand of Cards:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}

class SuitComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        Suit suit1 = card1.getSuit();
        Suit suit2 = card2.getSuit();

        // Compare the suits based on their order: Spades > Hearts > Clubs > Diamonds
        if (suit1.ordinal() < suit2.ordinal()) {
            return -1;
        } else if (suit1.ordinal() > suit2.ordinal()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class NumericalValueComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int value1 = card1.getValue();
        int value2 = card2.getValue();

        // Compare the numerical values of the cards
        return Integer.compare(value1, value2);
    }
}
