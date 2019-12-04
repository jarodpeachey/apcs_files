
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

public class Gravity {
  // Calculate the gravities of each planet
  public static double[] calculateGravities(double[] diameters, double[] masses) {
    double[] gravities = new double[diameters.length];

    for (int i = 0; i < diameters.length; i++) {
      double gravity = (((6.67e-11) * (masses[i])) / (Math.pow(diameters[i] / 2 * 1000, 2)));
      gravities[i] = gravity;
    }

    return gravities;
  }

  // Print out all the data
  public static void printData(String[] planets, double[] diameters, double[] masses, double[] gravities) {
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println();
    System.out.printf("%-10s%-15s%15s%20s\n", "Planet", "Mass (kg)", "Diameter (m)", "Gravity (m/s^2)");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    for (int i = 0; i < gravities.length; i++) {
      System.out.printf("%-10s%-15s%15s%20s\n", planets[i], String.format("%7.2e", masses[i]),
          String.format("%7.2e", diameters[i]), df.format(gravities[i]));
    }
  }

  public static void writeData(double[] gravities) throws IOException {
    File newOutFile = new File("gravity.txt");
    PrintWriter outFile = new PrintWriter(newOutFile);

    for (int i = 0; i < gravities.length; i++) {
      outFile.println(gravities[i]);
    }

    outFile.close();
  }

  // Main method
  public static void main(String[] args) throws IOException {
    String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
    double[] diameters = { 4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532 };
    double[] masses = { 3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26 };

    double[] gravities = calculateGravities(diameters, masses);

    printData(planets, diameters, masses, gravities);

    writeData(gravities);
  }
}
