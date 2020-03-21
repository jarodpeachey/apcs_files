
/**
 * This is a class that tests the Deck class.
 *
 * < Your Name > < Today's Date >
 */

import java.util.ArrayList;

public class DeckTester {
  /**
   * The main method in this class checks the Deck operations for consistency.
   * 
   * @param args is not usedeck.
   */

  private static Deck deck;

  public static void main(String[] args) {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    /* Uncomment blocks of code to test the Deck class */

    String[] ranks = { "ace", "ten", "nine", "eight", "seven", "six", "five", "four", "three", "two" };
    String[] suits = { "spades", "hearts", "diamonds", "clubs" };
    int[] points = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    deck = new Deck(ranks, suits, points);

    printItems();

    System.out.println("Dealt Card: " + deck.deal());

    printItems();

    System.out.println("Dealt Card: " + deck.deal());

    printItems();

    // System.out.println("**** Original Deck Methods ****");
    // System.out.println(" toString: \n" + deck.toString());
    // System.out.println(" isEmpty: " + deck.isEmpty());
    // System.out.println(" size: " + deck.size());
    // System.out.println();
    // System.out.println();

    // System.out.println("**** Deal a Card ****");
    // System.out.println(" deal: " + deck.deal());
    // System.out.println();
    // System.out.println();

    // System.out.println("**** Deck Methods After 1 Card Dealt ****");
    // System.out.println(" toString:\n");
    // System.out.println(" isEmpty: ");
    // System.out.println(" size: ");
    // System.out.println();
    // System.out.println();

    // System.out.println("**** Deal Remaining 5 Cards ****");

    // System.out.println();
    // System.out.println();

    // System.out.println("**** Deck Methods After All Cards Dealt ****");
    // System.out.println(" toString:\n");
    // System.out.println(" isEmpty: ");
    // System.out.println(" size: ");
    // System.out.println();
    // System.out.println();

    // System.out.println("**** Deal a Card From Empty Deck ****");
    // System.out.println(" deal: ");
    // System.out.println();
    // System.out.println();

    /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

    // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
    // String[] ranks52 = {"ace"};
    // String[] suits52 = {"spades"};
    // int[] pointValues52 = {1};

    // System.out.println(" The Starting Deck ");

    // System.out.println(" The Deck After Dealing a Card" );

    // System.out.println(" Shuffleing the Deck ");

  }

  public static void printItems() {
    ArrayList<Card> cards = deck.getCards();

    System.out.println();
    System.out.println("__ Cards __________");
    for (int i = 0; i < cards.size(); i++) {
      if (i < deck.size()) {
        System.out.println(
            "Not Dealt: " + cards.get(i).getRank() + " " + cards.get(i).getSuit() + " " + cards.get(i).getPointValue());
      } else {
        System.out.println(
            "Dealt: " + cards.get(i).getRank() + " " + cards.get(i).getSuit() + " " + cards.get(i).getPointValue());
      }
    }
    System.out.println();
  }
}
