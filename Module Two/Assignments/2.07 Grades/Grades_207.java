/**
 * The purpose of this program is to calculate the average of four grades
 * 
 * @author Jarod Peachey
 * @version 06/11/17
 */
public class Grades_207 {
  public static void main(String[] args) {
    // local variables
    int[] tests = { 95, 73, 91, 82, 98, 67, 93, 88, 74, 100 }; // Array of test scores
    int numTests = 0; // counts number of tests
    int totalPoints = 0; // total points for all tests
    double average = 0.0; // average grade

    System.out.println(""); // Print line to add spacing on top of output
    
    // For each loop to make it possible to calculate the average for a larger number of tests without writing more code each time.
    for (int testScore : tests) {
      numTests++; // Increment the number of tests
      totalPoints += testScore; // Update the total score
      average = (double)totalPoints / numTests; // Calculate the average 
      System.out.println("Test #" + numTests + ": Test grade - " + testScore + "  Total Points - " + totalPoints + "  Average score - " + average); // Print out the test results
    }

    System.out.println(""); // Print empty line above output
    System.out.print("The average score of all " + numTests + " tests was " + average); // Print average score and number of tests
  }// end of main method
}// end of class