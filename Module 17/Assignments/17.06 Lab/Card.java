/**
 * Card.java Card represents a playing card.
 *
 * < Your Name > < Today's Date >
 */

public class Card {

  private String suit; // the suit of the card
  private String rank; // the rank of the card
  private int pointValue; // the point value of the card

  /**
   * Creates a new Card instance.
   *
   * @param cardRank       a String value containing the rank of the card
   * @param cardSuit       a String value containing the suit of the card
   * @param cardPointValue an int value containing the point value of the card
   */
  public Card(String rank, String suit, int pointValue) {
    this.rank = rank;
    this.suit = suit;
    this.pointValue = pointValue;
  }

  /**
   * Accesses this Card's suit.
   * 
   * @return this Card's suit.
   */
  public String getSuit() {
    return suit;
  }

  /**
   * Accesses this Card's rank.
   * 
   * @return this Card's rank.
   */
  public String getRank() {
    return rank;
  }

  /**
   * Accesses this Card's point value.
   * 
   * @return this Card's point value.
   */
  public int getPointValue() {
    return pointValue;
  }

  /**
   * Compare this card with the argument.
   * 
   * @param otherCard the other card to compare to this
   * @return true if the rank, suit, and point value of this card are equal to
   *         those of the argument; false otherwise.
   */
  public boolean matches(Card otherCard) {
    if (otherCard.getRank() == rank && otherCard.getSuit() == suit && otherCard.getPointValue() == pointValue)
      return true;

    return false;
  }

  /**
   * Converts the rank, suit, and point value into a string in the format "[Rank]
   * of [Suit] (point value = [PointValue])". This provides a useful way of
   * printing the contents of a Deck in an easily readable format or performing
   * other similar functions.
   *
   * @return a String containing the rank, suit, and point value of the card.
   */
  @Override
  public String toString() {
    return rank + " of " + suit + " (point value: " + pointValue + ") ";
  }
}
