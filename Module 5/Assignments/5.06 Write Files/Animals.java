
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

class Animals {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(new File("animal_data.txt"));
    String format = "%1$-20s%2$20s\n";

    int trials = 3;

    for (int i = 1; i <= trials; i++) {
      int foxSquirrelsSeenInTrial = 0;
      int graySquirrelsSeenInTrial = 0;
      int redSquirrelsSeenInTrial = 0;
      int totalSquirrelsSeenInTrial = 0;

      while (foxSquirrelsSeenInTrial < 10) {
        int num = (int) (Math.random() * 10) + 1;
        if (num >= 1 && num <= 5) {
          graySquirrelsSeenInTrial++;
        } else if (num <= 9) {
          redSquirrelsSeenInTrial++;
        } else {
          foxSquirrelsSeenInTrial++;
        }

        totalSquirrelsSeenInTrial++;
      }

      outFile.println("Trial " + i);
      outFile.format(format, "Gray Squirrels: ", graySquirrelsSeenInTrial);
      outFile.format(format, "Red Squirrels: ", redSquirrelsSeenInTrial);
      outFile.format(format, "Fox Squirrels: ", foxSquirrelsSeenInTrial);
      outFile.format(format, "", "Total: " + totalSquirrelsSeenInTrial);
      outFile.println();
    }
    outFile.close();

    String nextLineToken = "";
    String nextToken = "";
    File fileName = new File("animal_data.txt");
    Scanner inFile = new Scanner(fileName);

    int totalFoxSquirrels = 0;
    int totalGraySquirrels = 0;
    int totalRedSquirrels = 0;

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
      } else if (nextLineToken.contains("Gray Squirrels")) {
        for (int i = 0; i < nextLineToken.length(); i++) {
          if (i != nextLineToken.length() - 1 && Character.isDigit(nextLineToken.charAt(i))
              && Character.isDigit(nextLineToken.charAt(i + 1))) {
            String firstDigit = String.valueOf(nextLineToken.charAt(i));
            String secondDigit = String.valueOf(nextLineToken.charAt(i + 1));
            int finalDigit = Integer.parseInt(firstDigit + secondDigit);

            totalGraySquirrels += finalDigit;
          }
        }
      } else if (nextLineToken.contains("Red Squirrels")) {
        for (int i = 0; i < nextLineToken.length(); i++) {
          if (i != nextLineToken.length() - 1 && Character.isDigit(nextLineToken.charAt(i))
              && Character.isDigit(nextLineToken.charAt(i + 1))) {
            String firstDigit = String.valueOf(nextLineToken.charAt(i));
            String secondDigit = String.valueOf(nextLineToken.charAt(i + 1));
            int finalDigit = Integer.parseInt(firstDigit + secondDigit);

            totalRedSquirrels += finalDigit;
          }
        }
      }

      if (containsWhitespace) {
        System.out.println(nextLineToken);
      } else {
        System.out.print(nextLineToken);
      }
    } // end while

    int totalSquirrels = totalFoxSquirrels + totalGraySquirrels + totalRedSquirrels;

    System.out.println();
    System.out.format(format, "Fox Squirrels: ", totalFoxSquirrels);
    System.out.format(format, "Gray Squirrels: ", totalGraySquirrels);
    System.out.format(format, "Red Squirrels: ", totalRedSquirrels);
    System.out.format(format, "Total Squirrels: ", totalRedSquirrels + totalFoxSquirrels + totalGraySquirrels);
    System.out.println();
    System.out.println(
        "The total percentage of fox squirrels compared to all others is " + totalSquirrels / totalFoxSquirrels + "%");

    inFile.close();
  }// end of main method
}// end of class
