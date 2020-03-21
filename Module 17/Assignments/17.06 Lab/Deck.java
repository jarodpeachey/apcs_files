import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 *
 *
 * < Your Name > < Today's Date >
 */
public class Deck {
  private ArrayList<Card> cards; // contains all the cards in the deck

  private int size; // size is the number of not-yet-dealt cards.
                    // Cards are dealt from the top (highest index) down.
                    // The next card to be dealt is at size - 1.

  /**
   * Creates a new Deck instance.<BR>
   * It pairs each element of ranks with each element of suits, and produces one
   * of the corresponding card.
   * 
   * @param ranks  is an array containing all of the card ranks.
   * @param suits  is an array containing all of the card suits.
   * @param values is an array containing all of the card point values.
   */
  public Deck(String[] ranks, String[] suits, int[] values) {
    // initialize cards as a new ArrayList
    ArrayList<Card> cards = new ArrayList<Card>();

    // loop through the parameter arrays to add new cards
    for (String rank : ranks) {
      for (String suit : suits) {
        for (int value : values) {
          cards.add(new Card(rank, suit, value));
        }
      }
    }

    // Assign to cards and size
    this.cards = cards;
    this.size = cards.size();

    // shuffle cards
    shuffle();
  }

  public ArrayList<Card> getCards() {
    return cards;
  }

  /**
   * Determines if this deck is empty (no undealt cards).
   * 
   * @return true if this deck is empty, false otherwise.
   */
  public boolean isEmpty() {
    if (size == 0)
      return true;

    return false;
  }

  /**
   * Accesses the number of undealt cards in this deck.
   * 
   * @return the number of undealt cards in this deck.
   */
  public int size() {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
    return size;
  }

  /**
   * Randomly permute the given collection of cards and reset the size to
   * represent the entire deck.
   */
  public void shuffle() {
    /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    /* For Activity 2, this method will do nothing. */
  }

  /**
   * Deals a card from this deck.
   * 
   * @return the card just dealt, or null if all the cards have been previously
   *         dealt.
   */
  public Card deal() {
    size -= 1;

    if (size > 0)
      return cards.get(size);
    
    return null;
  }

  /**
   * Generates and returns a string representation of this deck.
   * 
   * @return a string representation of this deck.
   */
  // @Override
  // public String toString() {
  // String rtn = "size = " + size + "\nUndealt cards: \n";

  // for (int k = size - 1; k >= 0; k--) {
  // rtn = rtn + cards.get(k);
  // if (k != 0) {
  // rtn = rtn + ", ";
  // }
  // if ((size - k) % 2 == 0) {
  // // Insert carriage returns so entire deck is visible on console.
  // rtn = rtn + "\n";
  // }
  // }

  // rtn = rtn + "\nDealt cards: \n";
  // for (int k = cards.size() - 1; k >= size; k--) {
  // rtn = rtn + cards.get(k);
  // if (k != size) {
  // rtn = rtn + ", ";
  // }
  // if ((k - cards.size()) % 2 == 0) {
  // // Insert carriage returns so entire deck is visible on console.
  // rtn = rtn + "\n";
  // }
  // }
  // rtn = rtn + "\n";
  // return rtn;
  // }
}
