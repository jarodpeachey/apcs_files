
/**
 * This program displays the weather data for an area and formats it.
 * 
 * @author Jarod Peachey
 * @version 11/19/19
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ceaser {
  static Boolean encryptAnotherMessage = false;
  static int mode = 1;

  public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);

    getUserModeSelection(in, "Welcome to the Ceaser Code program. Here are the options you can do.");
  }// end main

  public static void getUserModeSelection(Scanner in, String message) {
    int userModeInput;
    Boolean firstLoopMode = true;
    System.out.println(message);
    System.out.println("[1]: Encrypt a message");
    System.out.println("[2]: Decrypt a message");
    System.out.println();
    System.out.print("Select your option:  ");

    do {
      if (!firstLoopMode) {
        System.out.print("Please enter a valid option:  ");
      }
      userModeInput = in.nextInt();

      firstLoopMode = false;
    } while (userModeInput != 2 && userModeInput != 1);

    mode = userModeInput;

    if (mode == 1) {
      encryptNewMessage(in);
    } else {
      decryptNewMessage(in);
    }
  }

  public static void encryptNewMessage(Scanner in) {
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

    Decryption decrypter = new Decryption(shiftValue);
    System.out.println();
    System.out.print("Enter your message to encrypt:  ");

    String message = in.next();
    message += in.nextLine();

    String encryptedMessage = encrypter.encryptMessage(message);

    System.out.println();
    System.out.println("Your encrypted message: " + encryptedMessage);

    checkEncryptAnother(in);
  }

  public static void decryptNewMessage(Scanner in) {
    int userShiftInput;
    Boolean firstLoopTemp = true;
    System.out.println();
    System.out.print("What is the shift of the code (from 0 to 25)?  ");
    do {
      if (!firstLoopTemp) {
        System.out.print("Please enter a number between 0 and 25:  ");
      }
      userShiftInput = in.nextInt();

      firstLoopTemp = false;
    } while (userShiftInput >= 26 || userShiftInput <= -1);

    int shiftValue = userShiftInput;

    Decryption decrypter = new Decryption(shiftValue);
    System.out.println();
    System.out.print("Enter your message to decrypt:  ");

    String message = in.next();
    message += in.nextLine();

    String decryptedMessage = decrypter.decryptMessage(message);

    System.out.println();
    System.out.println("Your decrypted message: " + decryptedMessage);

    checkEncryptAnother(in);
  }

  public static void checkEncryptAnother(Scanner in) {
    System.out.println();
    System.out.print("Would you like to decrypt/encrypt another message? (Y/N)  ");

    String answer = in.next().trim().toLowerCase();

    if (answer.equals("y")) {
      encryptAnotherMessage = true;
    } else if (answer.equals("n")) {
      encryptAnotherMessage = false;
    } else {
      System.out.println("Please answer Y/N");
    }

    if (encryptAnotherMessage) {
      getUserModeSelection(in, "Here are the options you can do.");
    } else {
      System.out.println();
      System.out.println("Thanks for using our app!");
    }
  }
}
// end class
