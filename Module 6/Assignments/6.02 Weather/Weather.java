
/**
 * This program displays the weather data for an area and formats it.
 * 
 * @author Jarod Peachey
 * @version 11/19/19
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Weather {
  public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);
    String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };

    // Location One
    // String city = "Apalachicola";
    // String state = "Florida";
    // double[] temperature = { 52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9, 81.7,
    // 79.1, 70.2, 62.0, 55.2 };
    // double[] precipitation = { 4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2,
    // 3.6, 3.5 };

    // Location Two
    String city = "Vero Beach";
    String state = "Florida";
    double[] temperature = { 63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.1, 76.4, 70.5, 64.7 };
    double[] precipitation = { 2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2 };

    String userTempInput;
    Boolean firstLoopTemp = true;
    System.out.println();
    System.out.print("Choose your temperature format (F = Fahrenheit, C = Celsius): ");
    do {
      if (!firstLoopTemp) {
        System.out.print("Please enter a C or and F:  ");
      }
      userTempInput = in.nextLine();

      firstLoopTemp = false;
    } while (!userTempInput.replace(" ", "").equalsIgnoreCase("f")
        && !userTempInput.replace(" ", "").equalsIgnoreCase("c"));

    String tempLabel = userTempInput.replace(" ", "");

    String userPrecipInput;
    Boolean firstLoopPrecip = true;
    System.out.println();
    System.out.print("Choose your precipitation format (i = inches, c = centimeters): ");
    do {
      if (!firstLoopPrecip) {
        System.out.print("Please enter a c or an i:  ");
      }
      userPrecipInput = in.nextLine();

      firstLoopPrecip = false;
    } while (!userPrecipInput.replace(" ", "").equalsIgnoreCase("i")
        && !userPrecipInput.replace(" ", "").equalsIgnoreCase("c"));

    String precipLabel = userPrecipInput.replace(" ", "");

    if (tempLabel.equalsIgnoreCase("c")) {
      for (int i = 0; i < temperature.length; i++) {
        temperature[i] = (temperature[i] - 32) * (5.0 / 9.0);
      }
    }

    if (precipLabel.equalsIgnoreCase("c")) {
      for (int i = 0; i < precipitation.length; i++) {
        precipitation[i] = precipitation[i] * 2.54;
      }
      precipLabel = "cm";
    } else {
      precipLabel = "in";
    }

    // Processing - calculate average temperature and total precipitation
    int totalArrayItems = 0;
    int totalTemp = 0;
    for (int i = 0; i < temperature.length; i++) {
      totalTemp += temperature[i];
      totalArrayItems++;
    }

    int averageTemp = totalTemp / totalArrayItems;

    int totalPrecipitation = 0;
    for (int i = 0; i < precipitation.length; i++) {
      totalPrecipitation += precipitation[i];
    }

    // Output: display table of weather data including average and total
    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println();
    System.out.println("WEATHER DATA");
    System.out.println("Location: " + city + ", " + state);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.printf("%-10s", "MONTH");
    System.out.printf("%15s", "TEMPERATURE (" + tempLabel + ")");
    System.out.printf("%20s", "  PRECIPITATION (" + precipLabel + ")");
    System.out.println();
    for (int i = 0; i < month.length; i++) {
      System.out.printf("%-10s", month[i]);
      System.out.printf("%15s", df.format(temperature[i]) + " " + tempLabel);
      System.out.printf("%20s", df.format(precipitation[i]) + " " + precipLabel);
      System.out.println();
    }
    System.out.println();
    System.out.println("Average temp: " + averageTemp);
    System.out.println("Total precipitation: " + totalPrecipitation + " " + precipLabel);
  }// end main
}// end class
