
/**
 * This program enables the user to decrypt and encrypt a message using the Ceaser shift
 * 
 * @author Jarod Peachey
 * @version 1.0.0
 *
 */

import java.util.ArrayList;

public class Decryption {
  // instance variables
  private final Character[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
      'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
      'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
  private int shift = 0;

  // Constructor for objects of class Circle
  public Decryption(int newShift) {
    // initialize instance variables
    shift = newShift;
  }

  public String decryptMessage(String message) {
    ArrayList<Character> oldMessageArray = new ArrayList<Character>();
    ArrayList<Character> newMessageArray = new ArrayList<Character>();

    for (int k = 0; k < message.length(); k++) {
      oldMessageArray.add(message.charAt(k));
    }

    for (int i = 0; i < oldMessageArray.size(); i++) {
      Character oldChar = oldMessageArray.get(i);

      if (oldChar != ' ') {
        for (int j = 0; j < alphabet.length / 2; j++) {
          if (alphabet[j] == oldChar) {
            newMessageArray.add(alphabet[j - shift]);
          } else if (alphabet[j] == Character.toLowerCase(oldChar)) {
            newMessageArray.add(Character.toUpperCase(alphabet[j - shift]));
          }
        }
      } else {
        newMessageArray.add(oldChar);
      }
    }

    StringBuilder builder = new StringBuilder(newMessageArray.size());

    for (Character c : newMessageArray) {
      builder.append(c);
    }

    return builder.toString();
  }
}
