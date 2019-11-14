
/**
 * The purpose of this program is to generate a random password for any user.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.util.Scanner;

public class Challenge

{
  public static void main(String[] args) {
    // initialize scanner
    Scanner in = new Scanner(System.in);

    // declare and initialize variables
    int userSelection = 0;
    int passwordLength = 0;
    String password = "";
    double randomVal = 0;

    // password generator menu
    System.out.println("Password Generator");
    System.out.println("==============================================================");
    System.out.println("  [1] Only lowercase Letters    ");
    System.out.println("  [2] Lowercase + Uppercase letters    ");
    System.out.println("  [3] All letters and numbers    ");
    System.out.println("  [4] Letters, numbers and symbols   ");
    System.out.println("  [5] Quit                      ");
    System.out.println("==============================================================");

    // Prompt for a menu selection Scanner in = new Scanner(System.in);
    do {
      System.out.print("Enter your password selection:  ");
      do {
        System.out.println("Please enter a number between from 1 to 5:  ");
        userSelection = in.nextInt();
      } while (userSelection != 1 && userSelection != 2 && userSelection != 3 && userSelection != 4
          && userSelection != 5);

      if (userSelection != 5) {
        int userPassLength;
        System.out.print("Enter your password length (6 or more): ");
        do {
          System.out.println("Please enter a number greater than 6:  ");
          userPassLength = in.nextInt();
        } while (userPassLength <= 6);
        System.out.println();

        passwordLength = userPassLength;
      } else {
        // Print passwords
      }

      if (userSelection == 1) {
        while (password.length() < passwordLength) {
          randomVal = Math.random() * 26 + 97;
          password += (char) (randomVal);
        }
      }
    } while (userSelection != 5);

    // When it is 5, loop ends and passwords are printed back from text file

    // Ask for password length

    // Read passwords back from text file
  }
}
