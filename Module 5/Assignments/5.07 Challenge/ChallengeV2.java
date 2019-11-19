
/**
 * The purpose of this program is to generate a random password for any user.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Challenge {
  public static void main(String[] args) throws IOException {
    // initialize scanner
    Scanner in = new Scanner(System.in);
    File newFile = new File("passwords.txt");
    PrintWriter outFile = new PrintWriter(newFile);

    // declare and initialize variables
    int userSelection = 0;
    int passwordLength = 0;

    // password generator menu
    System.out.println();
    System.out.println("Welcome to Password Generator! Read the list below, and then select a password type.");
    System.out.println();
    System.out.println("==============================================================");
    System.out.println("  [1] Only lowercase Letters    ");
    System.out.println("  [2] Lowercase + Uppercase letters    ");
    System.out.println("  [3] All letters and numbers    ");
    System.out.println("  [4] Letters, numbers and symbols   ");
    System.out.println("  [5] Quit                      ");
    System.out.println("==============================================================");
    System.out.println();

    // Prompt for a menu selection Scanner in = new Scanner(System.in);
    do {
      Boolean firstLoop = true;
      System.out.print("Enter your password selection (1-5):  ");
      do {
        if (!firstLoop) {
          System.out.print("Try again. Enter a number between 1 and 5:  ");
        }

        firstLoop = false;
        userSelection = in.nextInt();
      } while (userSelection != 1 && userSelection != 2 && userSelection != 3 && userSelection != 4
          && userSelection != 5);
      ;

      System.out.println();
      if (userSelection != 5) {
        int userPassLength;
        Boolean firstLoopLength = true;
        System.out.print("Enter your password length (6 or more): ");
        do {
          if (!firstLoopLength) {
            System.out.print("Please enter a number greater than 5:  ");
          }
          userPassLength = in.nextInt();

          firstLoopLength = false;
        } while (userPassLength < 6);

        passwordLength = userPassLength;
      } else {
        // Print passwords
      }

      if (userSelection == 1) {
        Ranges ranges = new Ranges(97, 122);
        String password = "";
        while (password.length() < passwordLength) {
          double randomVal = ranges.getRandom();
          password += (char) (randomVal);
        }

        outFile.println(password);
        System.out.println();
      } else if (userSelection == 2) {
        Ranges ranges = new Ranges(97, 122);
        ranges.addRange(65, 90);
        String password = "";
        while (password.length() < passwordLength) {
          double randomVal = ranges.getRandom();
          password += (char) (randomVal);
        }

        outFile.println(password);
        System.out.println();
      } else if (userSelection == 3) {
        Ranges ranges = new Ranges(97, 122);
        ranges.addRange(65, 90);
        ranges.addRange(48, 57);
        String password = "";
        while (password.length() < passwordLength) {
          double randomVal = ranges.getRandom();
          password += (char) (randomVal);
        }

        outFile.println(password);
        System.out.println();
      } else if (userSelection == 4) {
        Ranges ranges = new Ranges(33, 126);
        String password = "";
        while (password.length() < passwordLength) {
          double randomVal = ranges.getRandom();
          password += (char) (randomVal);
        }

        outFile.println(password);
        System.out.println();
      }
    } while (userSelection != 5);

    outFile.close();

    File fileName = new File("passwords.txt");
    Scanner inFile = new Scanner(fileName);

    System.out.println();
    System.out.println("Thank you for using Password Generator!");
    System.out.println();
    System.out.println("Here are your randomly generated passcodes:");
    System.out.println();

    int passwordNum = 1;
    while (inFile.hasNextLine()) {
      System.out.println(passwordNum + ":  " + inFile.nextLine());

      passwordNum++;
    }
  }
}
