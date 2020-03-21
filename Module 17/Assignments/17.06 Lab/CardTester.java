/**
 * This is a class that tests the Card class.
 *
 * < Your Name > < Today's Date >
 */

public class CardTester {
  /**
   * The main method in this class checks the Card operations for consistency.
   * 
   * @param args is not used.
   */
  public static void main(String[] args) {

    /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

    // Establish new cards
    Card aceHearts = new Card("ace", "hearts", 1);
    Card tenClubs = new Card("ten", "clubs", 10);
    Card fourDiamonds = new Card("four", "diamonds", 4);

    // Test card 1 and methods
    System.out.println("**** Tests Card 1: Ace of Hearts ****");
    System.out.println("  rank: " + aceHearts.getRank());
    System.out.println("  suit: " + aceHearts.getSuit());
    System.out.println("  pointValue: " + aceHearts.getPointValue());
    System.out.println("  toString: " + aceHearts.toString());
    System.out.println();

    // Test card 2
    System.out.println("**** Tests Card 2: Ten of Clubs ****");
    System.out.println("  rank: " + tenClubs.getRank());
    System.out.println("  suit: " + tenClubs.getSuit());
    System.out.println("  pointValue: " + tenClubs.getPointValue());
    System.out.println("  toString: " + tenClubs.toString());
    System.out.println();

    // Test card 3
    System.out.println("**** Tests Card 3: Four of Diamonds ****");
    System.out.println("  rank: " + fourDiamonds.getRank());
    System.out.println("  suit: " + fourDiamonds.getSuit());
    System.out.println("  pointValue: " + fourDiamonds.getPointValue());
    System.out.println("  toString: " + fourDiamonds.toString());
    System.out.println();

    // Test matches() method
    System.out.println("**** Matches Test: Four of Diamonds and Ace of Hearts ****");
    System.out.println(fourDiamonds.matches(aceHearts));
  }
}
