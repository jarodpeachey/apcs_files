
/**
 * This program displays the weather data for an area and formats it.
 * 
 * @author Jarod Peachey
 * @version 11/19/19
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class EncryptionTester {
    static Boolean encryptAnotherMessage = false;
  public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);

    int userShiftInput;
    Boolean firstLoopTemp = true;
    System.out.println();
    System.out.print("Pick a number between 0 and 25 (number of letters to shift by): ");
    do {
      if (!firstLoopTemp) {
        System.out.print("Please enter a number between 0 and 25:  ");
      }
      userShiftInput = in.nextInt();

      firstLoopTemp = false;
    } while (userShiftInput >= 26 || userShiftInput <= -1);

    int shiftValue = userShiftInput;

    Encryption encrypter = new Encryption(shiftValue);

    encryptNewMessage(in, encrypter);
  }// end main

  public static void encryptNewMessage(Scanner in, Encryption encrypter) {
    System.out.println();
    System.out.print("Enter your message to encrypt:  ");

    String message = in.next();
    message += in.nextLine();

    String encryptedMessage = encrypter.encryptMessage(message);

    System.out.println();
    System.out.println("Your encrypted message: " + encryptedMessage);

    // Ask if the user wants to add another item
    System.out.println();
    System.out.print("Would you like to encrypt another message? (Y/N)  ");
    String answer = in.next().trim().toLowerCase();
    if (answer.equals("y")) {
      encryptAnotherMessage = true;
    } else if (answer.equals("n")) {
      encryptAnotherMessage = false;
    } else {
      System.out.println("Please answer Y/N");
    }

    // Call the function to check whether or not to add a new item
    checkEncryptAnother(in, encrypter);
  }

  public static void checkEncryptAnother(Scanner in, Encryption encrypter) {
    if (encryptAnotherMessage) {
      // Add a new item
      encryptNewMessage(in, encrypter);
    } else {
      System.out.println("Thanks for using our app!");
    }
  }
}
// end class
