
/**
@author Jarod Peachey
@version 1.0.0
*/

import java.util.Scanner;

public class Numbers {
  // Set variables
  static Boolean addNumberBool = false;

  // Start scanner
  static Scanner in = new Scanner(System.in);

  public static void main(String args[]) {
    addNewNumber();
  }

  public static void addNewNumber() {
    System.out.println();
    System.out.print("Enter a number to get the Fibonacci Number for that number: ");
    int number = in.nextInt();
    System.out.println();

    System.out.println("The Fibonacci number for " + number + " is " + fibonacciRecursion(number));
    System.out.println();

    System.out.print("Would you like to calculate another number? (Y/N) ");
    String answer = in.next().trim().toLowerCase();
    if (answer.equals("y")) {
      addNumberBool = true;
    } else if (answer.equals("n")) {
      addNumberBool = false;
    } else {
      System.out.println("Please answer Y/N");
    }

    // Call the function to check whether or not to add a new test
    checkNumberBool();
  }

  public static void checkNumberBool() {
    if (addNumberBool) {
      // Add a new test
      addNewNumber();
    } else {
      // Print the results!!
      System.out.println();
      System.out.println("Thanks for using this app!");
    }
  }

  public static int fibonacciRecursion(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return 1;
    }
    return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
  }
}// end class CirclePoints
