
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

class AnimalsV2 {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(new File("animal_data.txt"));
    String format = "%1$-20s%2$20s\n";

    int trials = 3;

    for (int i = 1; i <= trials; i++) {
      int foxSquirrelsSeenInTrial = 0;
      int totalAttempts = 0;

      while (foxSquirrelsSeenInTrial < 10) {
        int num = (int) (Math.random() * 10) + 1;
        if (num == 5) {
          foxSquirrelsSeenInTrial++;
        }

        totalAttempts++;
      }

      outFile.println(" ");
      outFile.println("Trial " + i + " --------------------------------");
      outFile.format(format, "", "Total Attempts: " + totalAttempts);
      outFile.format(format, "", "Fox Squirrels: " + foxSquirrelsSeenInTrial);
    }
    outFile.close();

    String nextLineToken = "";
    File fileName = new File("animal_data.txt");
    Scanner inFile = new Scanner(fileName);

    int totalFoxSquirrels = 0;
    int totalAttempts = 0;

    // while loop will continue while inFile has a next token to read
    while (inFile.hasNext()) {
      // nextToken = inFile.next();
      nextLineToken = inFile.nextLine();
      boolean containsWhitespace = false;
      for (int i = 0; i < nextLineToken.length() && !containsWhitespace; i++) {
        if (Character.isWhitespace(nextLineToken.charAt(i))) {
          containsWhitespace = true;
        }
      }

      if (nextLineToken.contains("Fox Squirrels")) {
        for (int i = 0; i < nextLineToken.length(); i++) {
          if (i != nextLineToken.length() - 1 && Character.isDigit(nextLineToken.charAt(i))
              && Character.isDigit(nextLineToken.charAt(i + 1))) {
            String firstDigit = String.valueOf(nextLineToken.charAt(i));
            String secondDigit = String.valueOf(nextLineToken.charAt(i + 1));
            int finalDigit = Integer.parseInt(firstDigit + secondDigit);

            totalFoxSquirrels += finalDigit;
          }
        }
      } else if (nextLineToken.contains("Attempts")) {
        for (int i = 0; i < nextLineToken.length(); i++) {
          if (i != nextLineToken.length() - 1 && Character.isDigit(nextLineToken.charAt(i))
              && Character.isDigit(nextLineToken.charAt(i + 1))) {
            String firstDigit = String.valueOf(nextLineToken.charAt(i));
            String secondDigit = String.valueOf(nextLineToken.charAt(i + 1));
            int finalDigit = Integer.parseInt(firstDigit + secondDigit);

            totalAttempts += finalDigit;
          }
        }
      }
      System.out.println(nextLineToken);
    } // end while

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println();
    System.out.format(format, "Total Attempts: ", totalAttempts);
    System.out.format(format, "Fox Squirrels: ", totalFoxSquirrels);
    System.out.format(format,
    "Percentage:", df.format((double)((double)totalFoxSquirrels / (double)totalAttempts) * 100.0)
     + "%");

    inFile.close();
  }// end of main method
}// end of class
