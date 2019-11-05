
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

class Animals {
  public static void main(String[] args) throws IOException {
    PrintWriter outFile = new PrintWriter(new File("animal_data.txt"));

    int trials = 3;

    for (int i = 1; i <= trials; i++) {
      int foxSquirrelsSeen = 0;
      int graySquirrelsSeen = 0;
      int redSquirrelsSeen = 0;
      int totalSquirrelsSeen = 0;

      while (foxSquirrelsSeen < 10) {
        int num = (int) (Math.random() * 10) + 1;
        System.out.println(num);
        String animal = "";

        if (num >= 1 && num <= 5) {
          animal = "Gray Squirrel";
          graySquirrelsSeen++;
        } else if (num <= 9) {
          animal = "Red Squirrel";
          redSquirrelsSeen++;
        } else {
          animal = "Fox Squirrel";
          foxSquirrelsSeen++;
        }

        totalSquirrelsSeen++;
      }

      String format = "%1$-20s%2$20s\n";

      outFile.println("Trial " + i);
      outFile.format(format, "Gray Squirrels: ", graySquirrelsSeen);
      outFile.format(format, "Red Squirrels: ", redSquirrelsSeen);
      outFile.format(format, "Fox Squirrels: ", foxSquirrelsSeen);
      outFile.format(format, "", "Total: " + totalSquirrelsSeen);
      outFile.println();
    }
    outFile.close();
  }// end of main method
}// end of class
