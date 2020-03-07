
/**
 * This program enables the user to decrypt and encrypt a message using the Ceaser shift
 * 
 * @author Jarod Peachey
 * @version 1.0.0
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PrimeTester {
  static Boolean encryptAnotherMessage = false;
  static int mode = 1;

  public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);

    getUserModeSelection(in,
        "Welcome to the Prime Number program. Select an option and recieve all prime numbers in a given range.");
  }// end main

  public static void getUserModeSelection(Scanner in, String message) {
    int userModeInput;
    Boolean firstLoopMode = true;
    System.out.println(message);
    System.out.println("[1]: Enter your own range");
    System.out.println("[2]: Get random range");
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
      customRange(in);
    } else {
      randomRange(in);
    }
  }

  public static void customRange(Scanner in) {
    int userLowerLimit;
    int userUpperLimit;
    Boolean lowerLimitFirstLoop = true;
    Boolean upperLimitFirstLoop = true;

    System.out.println();
    System.out.print("Enter the lower limit for your range:  ");
    do {
      if (!lowerLimitFirstLoop) {
        System.out.print("Please enter a number:  ");
      }
      userLowerLimit = in.nextInt();

      lowerLimitFirstLoop = false;
    } while (userLowerLimit < Integer.MIN_VALUE || userLowerLimit > Integer.MAX_VALUE);

    int lowerLimit = userLowerLimit;

    System.out.println();
    System.out.print("Now enter the upper limit for your range:  ");
    do {
      if (!upperLimitFirstLoop) {
        System.out.print("Please enter a number:  ");
      }
      userUpperLimit = in.nextInt();

      upperLimitFirstLoop = false;
    } while (userUpperLimit < Integer.MIN_VALUE || userUpperLimit > Integer.MAX_VALUE
        || userLowerLimit > userUpperLimit);

    int upperLimit = userUpperLimit;

    int[] range = { lowerLimit, upperLimit };

    PrimeNumbers primeNumberFinder = new PrimeNumbers(range);

    ArrayList<Integer> primeNumbersArray = primeNumberFinder.getPrimeNumbers();

    System.out.println("Here are your prime numbers: ");
    for (int i = 0; i < primeNumbersArray.size(); i++) {
      System.out.println();
      System.out.print(primeNumbersArray.get(i) + ", ");
    }

    checkAddAnother(in);
  }

  public static void randomRange(Scanner in) {
    int low = 0;
    int high = 5000;

    int lowerLimit = (int)(Math.random() * (high - low)) + low;
    int upperLimit;

    int newUpperLimit;

    do {
      newUpperLimit = (int)(Math.random() * (high - lowerLimit)) + lowerLimit;
    } while (newUpperLimit < lowerLimit);

    upperLimit = newUpperLimit;

    System.out.println(lowerLimit);
    System.out.println(upperLimit);

    int[] range = { lowerLimit, upperLimit };

    PrimeNumbers primeNumberFinder = new PrimeNumbers(range);

    ArrayList<Integer> primeNumbersArray = primeNumberFinder.getPrimeNumbers();

    System.out.println("Here are your prime numbers: ");
    for (int i = 0; i < primeNumbersArray.size(); i++) {
      System.out.println();
      System.out.print(primeNumbersArray.get(i) + ", ");
    }

    checkAddAnother(in);
  }

  public static void checkAddAnother(Scanner in) {
    System.out.println();
    System.out.print("Would you like to get more prime numbers? (Y/N)  ");

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
