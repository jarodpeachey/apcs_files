
/**
 * The purpose of this program is to calculate the average of four grades
 * 
 * @author Jarod Peachey
 * @version 06/11/17
*/

// Import needed packages
import java.util.ArrayList;
import java.util.Scanner;

public class Grades_307 {
  // Set variables
  static Boolean addNumberBool = false;

  // Start scanner
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println();
    System.out.println("Welcome to TestKeeper 3000!! To get started and add a test, press enter.");
    String readString = in.nextLine();

    if (readString.isEmpty()) {
      // Call add new test function
      addNewTest();        
    }
  }

  public static void addNewTest() {
    // Collect test info
    System.out.print("What subject is the test on? (History, Science or Math)");
    String subject = in.next();
    subject += in.nextLine();
    System.out.println();

    // Ask if the user wants to add another test
    System.out.println("Would you like to add another test? (Y/N) ");
    String answer = in.next().trim().toLowerCase();
    if (answer.equals("y")) {
      addNumberBool = true;
    } else if (answer.equals("n")) {
      addNumberBool = false;
    } else {
      System.out.println("Please answer Y/N");
    }

    // Call the function to check whether or not to add a new test
    checkdNumberBool();
  }

  public static void checkdNumberBool() {
    if (addNumberBool) {
      // Add a new test
      addNewTest();
    } else {
      // Print the results!!
      System.out.println("Thanks for using this app!");
    }
  }
}// end of class

