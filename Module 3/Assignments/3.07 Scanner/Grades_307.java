
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
  static Boolean addTestBool = false;
  static int numTests = 0;
  static Test[] testsArray = new Test[0];

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

    // Get and set how many students took the test
    System.out.print("How many students took the test? ");
    int totalStudents = in.nextInt();
    System.out.println();

    // Initiate a new array of Student objects
    Student[] studentsArray = new Student[totalStudents];

    // For each student, ask their name and their score.
    for (int i = 0; i < totalStudents; i++) {
      // Add a suffix to the student numbers
      String[] suffixes = new String[] { "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
      String numberWithSuffix;
      switch (i % 100) {
      case 11:
      case 12:
      case 13:
        numberWithSuffix = (int) (i + 1) + "th";
      default:
        numberWithSuffix = (int) (i + 1) + suffixes[i % 10];
      }

      // Ask the students name
      System.out.print("What is the " + numberWithSuffix + " student\'s name? ");
      String studentName = in.next();
      studentName += in.nextLine();
      System.out.println();

      // Ask the students grade
      System.out.print("What did the " + numberWithSuffix + " student score on this test? ");
      double studentScore = in.nextDouble();
      System.out.println();

      // Add the student to the studentsArray
      studentsArray[i] = new Student(studentName, studentScore, i + 1);
    }

    // Set total points for the test equal to the sum of all students scores
    double totalPoints = 0.0;
    for (int j=0; j < studentsArray.length; j++) {
      totalPoints += studentsArray[j].grade; 
    }

    // Calculate the average score for this test
    double average = totalPoints / totalStudents;

    // Create a new Test object with subject, totalStudents, studentsArray and average (for printing results later on)
    Test newTest = new Test(subject, totalStudents, studentsArray, average);

    // Since Java arrays have fixed length, we create an ArrayList
    ArrayList<Test> temp = new ArrayList<Test>();

    // Loop through the current tests, if any, in the testsArray and add to the ArrayList
    for(int k=0; k < testsArray.length; k++) {
      temp.add(testsArray[k]);
    }

    // Add the new test to the array
    temp.add(newTest);

    // Set the ArrayList back to an array
    testsArray = temp.toArray(new Test[testsArray.length]);
    
    // Ask if the user wants to add another test
    System.out.println("Would you like to add another test? (Y/N) ");
    String answer = in.next().trim().toLowerCase();
    if (answer.equals("y")) {
      addTestBool = true;
    } else if (answer.equals("n")) {
      addTestBool = false;
    } else {
      System.out.println("Please answer Y/N");
    }

    // Call the function to check whether or not to add a new test
    checkTestBool();
  }

  public static void checkTestBool() {
    if (addTestBool) {
      // Add a new test
      addNewTest();
    } else {
      // Print the results!!
      int totalStudentsThroughAllTests = 0;
      double totalAverageThroughAllTests = 0.0;

      // Loop through each test
      for (int j = 0; j < testsArray.length; j++) {
        numTests++; // Increment the number of tests

        // Print test data
        System.out.println();
        System.out.println("Test #" + numTests);
        System.out.println("  - Subject: " + testsArray[j].subject);
        System.out.println("  - Total Students: " + testsArray[j].totalStudents);
        System.out.println("  - Test scores:");

        // Loop through the students that took the test and print data
        for (int k=0; k < testsArray[j].studentsArray.length; k++) {
          totalStudentsThroughAllTests++;
          System.out.println("      Student #" + testsArray[j].studentsArray[k].id);
          System.out.println("        - Name: " + testsArray[j].studentsArray[k].name);
          System.out.println("        - Score: " + testsArray[j].studentsArray[k].grade);
        }

        // Calculate the average score for this test
        System.out.println("  - Average score: " + testsArray[j].average);
        System.out.println();

        // Add average score for the test to the total average score
        totalAverageThroughAllTests += testsArray[j].average;
      }

      // Calculate the average through all the tests
      double averageFromAllTests = totalAverageThroughAllTests / numTests;

      // After finished looping through tests, calculate the average score test-wide
      System.out.println("The average score for all " + numTests + " tests (from " + totalStudentsThroughAllTests + " students) is " + averageFromAllTests);
    }
  }
}// end of class

