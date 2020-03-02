
/**
 * This class defines a Circle for inheritance
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

import java.util.ArrayList;

public class Encryption {
  // instance variables
  private final Character[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
      'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
  private int shift = 0;

  // Constructor for objects of class Circle
  public Encryption(int newShift) {
    // initialize instance variables
    shift = newShift;
  }

  public String encryptMessage(String message) {
    ArrayList<Character> oldMessageArray = new ArrayList<Character>();
    ArrayList<Character> newMessageArray = new ArrayList<Character>();

    for (int k = 0; k < message.length(); k++) {
      oldMessageArray.add(message.charAt(k));
    }

    for (int i = 0; i < oldMessageArray.size(); i++) {
      Character oldChar = oldMessageArray.get(i);

      int oldCharIndex = 0;

      for (int j = 0; j < alphabet.length; j++) {
        if (oldChar != ' ') {
          if (alphabet[j] == oldChar) {
            oldCharIndex = j;
          } else {

          }
        } else {
          newMessageArray.add(oldChar);
        }
      }

      int newCharIndex = oldCharIndex + shift;

      Character newChar = alphabet[newCharIndex];

      newMessageArray.add(newChar);
    }

    StringBuilder builder = new StringBuilder(newMessageArray.size());

    for (Character c : newMessageArray) {
      builder.append(c);
    }

    return builder.toString();
  }
}
