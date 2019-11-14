
/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

class AnimalsV3 {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(new File("animal_data.txt"));

    Scanner in = new Scanner(System.in);
    int trials;
    System.out.print("Enter number of trials: ");
    do {
      System.out.println("Please enter a number above 1000:  ");
      trials = in.nextInt();
    } while (trials < 1000);
    System.out.println();

    for (int i = 1; i <= trials; i++) {
      int foxSquirrelsSeenInTrial = 0;
      int totalAttempts = 0;

      double percentageComplete = (double)i / (double)trials * 100.00;

      if (percentageComplete == 10.0 || percentageComplete == 20.0 || percentageComplete == 30.0 || percentageComplete == 40.0
          || percentageComplete == 50.0 || percentageComplete == 60.0 || percentageComplete == 70.0
          || percentageComplete == 80.0 || percentageComplete == 90.0 || percentageComplete == 100.0) {
            System.out.println("Running trials - " + percentageComplete + "%");
          }

        while (foxSquirrelsSeenInTrial < 10) {
          int num = (int) (Math.random() * 10) + 1;

          if (num == 10) {
            foxSquirrelsSeenInTrial++;
          }

          totalAttempts++;
        }

      outFile.println(totalAttempts);
    }
    outFile.close();

    File fileName = new File("animal_data.txt");
    Scanner inFile = new Scanner(fileName);

    int totalAttemptsForAllTrials = 0;
    int totalTrials = 0;

    while (inFile.hasNextInt()) {
      totalAttemptsForAllTrials += inFile.nextInt();
      totalTrials++;
    }

    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println();
    System.out.println("Here are your results!!");
    System.out.println();

    System.out.println("The average number of squirrels seen before spotting a fox squirrel is:  "
        + df.format((double) ((double) totalAttemptsForAllTrials / (double) totalTrials) / 10));

    inFile.close();
  }// end of main method
}// end of class
