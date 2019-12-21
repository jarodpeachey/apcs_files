
/**
 * This program displays the weather data for an area and formats it.
 * 
 * @author Jarod Peachey
 * @version 11/19/19
 *
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Weather {
  public static void main(String[] args) {
    // Declare and initialize variables
    Scanner in = new Scanner(System.in);
    String[] month = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sept", "Oct", "Nov", "Dec" };

    ArrayList<City> cities = new ArrayList<City>();

    // City One
    double[] temperatureOne = { 63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.1, 76.4, 70.5, 64.7 };
    double[] precipitationOne = { 2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2 };
    cities.add(new City("Vero Beach", "Florida", temperatureOne, precipitationOne));

    // City Two
    double[] temperatureTwo = { 40.0, 43.1, 51.4, 56.4, 68.4, 73.4, 80.1, 79.4, 72.5, 68.5, 61.1, 54.1 };
    double[] precipitationTwo = { 1.4, 4.2, 4.2, 4.8, 2.5, 6.0, 2.9, 6.5, 6.8, 2.9, 3.0, 2.5 };
    cities.add(new City("Dallas", "Texas", temperatureTwo, precipitationTwo));

    // City Three
    double[] temperatureThree = { 40.9, 44.2, 49.4, 53.6, 65.3, 74.1, 78.0, 83.4, 78.3, 65.2, 56.7, 48.5 };
    double[] precipitationThree = { 1.5, 4.2, 3.2, 2.8, 2.3, 2.0, 5.9, 3.5, 2.5, 2.2, 4.0, 3.5 };
    cities.add(new City("Annapolis", "Maryland", temperatureThree, precipitationThree));

    // City Four
    double[] temperatureFour = { 63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.1, 76.4, 70.5, 64.7 };
    double[] precipitationFour = { 1.4, 4.2, 4.2, 4.8, 2.5, 6.0, 2.9, 6.5, 6.8, 2.9, 3.0, 2.5 };
    cities.add(new City("Chester", "Virginia", temperatureFour, precipitationFour));

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

    if (tempLabel.equalsIgnoreCase("c")) {
      tempLabel = " C";
    } else {
      tempLabel = " F";
    }

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

    if (precipLabel.equalsIgnoreCase("c")) {
      precipLabel = " cm";
    } else {
      precipLabel = " in";
    }

    DecimalFormat df = new DecimalFormat("#.00");

    for (City city : cities) {
      System.out.println();
      System.out.println("Precipitation data for " + city.getCity() + ", " + city.getState());
      System.out.println("+---------+---------------+-----------------+");
      System.out.printf("|  %-5s  |%13s  |%15s  |\n", "Month", "Temperature", "Precipitation");
      System.out.println("+---------+---------------+-----------------+");
      for (int i = 0; i < month.length; i++) {
        System.out.printf("|  %-5s  |%11s    |%12s     |\n", month[i],
            df.format(city.getTemperature(i, userTempInput)) + tempLabel, df.format(city.getPrecipitation(i, userPrecipInput)) + precipLabel);
      }
      System.out.println("+---------+---------------+-----------------+");
    }
  }// end main
}// end class
