
/**
  The purpose of this program is to grade a True-False test.
  @author Jarod Peachey
  @version 06/07/17
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Weight {
  // Calculate the gravities of each planet
  public static double[] readGravities(int length) throws IOException {
    double[] gravities = new double[length];

    // read data from text file & put in an array
    File fileName = new File("gravity.txt");
    Scanner inFile = new Scanner(fileName);
    int i = 0;

    // count number of lines in text file
    while (inFile.hasNextDouble()) {
      gravities[i] = inFile.nextDouble();
      i++;
    }
    inFile.close();

    return gravities;
  }

  // Main method
  public static void main(String[] args) throws IOException {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

    double[] gravities = readGravities(planets.length);

    for (int i = 0; i < gravities.length; i++){
      System.out.println(gravities[i]);
    }
  }
}
