
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

  public static int getUserWeight() {
    Scanner in = new Scanner(System.in);

    System.out.println("What is your weight in pounds (rounded to the nearest whole number)?");
    int userWeight = in.nextInt();

    return userWeight;
  }

  public static double[] calculateWeights(String[] planets, double[] gravities, int userWeight) {
    double mass = (double) userWeight * 453.59237;
    double[] weights = new double[gravities.length];

    for (int i = 0; i < planets.length; i++) {
      double newWeight = mass * (gravities[i] / 9.8) / 453.59237;
      weights[i] = newWeight;
    }

    return weights;
  }

  public static void printData(String[] planets, double[] gravities, double[] weights) {
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println();
    System.out.printf("%-10s%10s%18s\n", "Planet", "Gravity", "Your Weight");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    for (int i = 0; i < weights.length; i++) {
      System.out.printf("%-10s%10s%18s\n", planets[i], df.format(gravities[i]), df.format(weights[i]));
    }
  }

  // Main method
  public static void main(String[] args) throws IOException {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };

    double[] gravities = readGravities(planets.length);

    int userWeight = getUserWeight();

    double[] weights = calculateWeights(planets, gravities, userWeight);

    printData(planets, gravities, weights);
  }
}
