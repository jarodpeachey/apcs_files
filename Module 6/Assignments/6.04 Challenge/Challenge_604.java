
/**
 * APCS Team
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Challenge {
  static Hurricane[] hurricanesInYearRange = new Hurricane[0];

  public static void main(String[] args) throws IOException {
    // read data from text file & put in an array
    File fileName = new File("hurricane_data.txt");
    Scanner inFile = new Scanner(fileName);
    int numValues = 0;

    // count number of lines in text file
    while (inFile.hasNextLine()) {
      inFile.nextLine();
      numValues++;
    }
    inFile.close();

    // initialize arrays based on lines counted in text file
    int[] years = new int[numValues];
    String[] months = new String[numValues];
    int[] pressures = new int[numValues];
    double[] windSpeeds = new double[numValues];
    String[] names = new String[numValues];
    int[] categories = new int[numValues];

    // read and assign data from text file to the arrays
    inFile = new Scanner(fileName);
    int index = 0;
    while (inFile.hasNext()) {
      years[index] = inFile.nextInt();
      months[index] = inFile.next();
      pressures[index] = inFile.nextInt();
      windSpeeds[index] = inFile.nextDouble();
      names[index] = inFile.next();
      index++;
    }
    inFile.close();

    // Convert wind speeds
    for (int i = 0; i < windSpeeds.length; i++) {
      windSpeeds[i] *= 1.151;
    }

    // Calculate Category of storm
    for (int i = 0; i < windSpeeds.length; i++) {
      if (windSpeeds[i] >= 74 && windSpeeds[i] <= 95) {
        categories[i] = 1;
      } else if (windSpeeds[i] >= 96 && windSpeeds[i] <= 110) {
        categories[i] = 2;
      } else if (windSpeeds[i] >= 111 && windSpeeds[i] <= 129) {
        categories[i] = 3;
      } else if (windSpeeds[i] >= 130 && windSpeeds[i] <= 156) {
        categories[i] = 4;
      } else if (windSpeeds[i] >= 157) {
        categories[i] = 5;
      }
    }

    Scanner in = new Scanner(System.in);

    // Ask user for year inputs
    int userYearInputOne = 0;
    int userYearInputTwo = 0;
    Boolean firstLoopTemp = true;
    System.out.println();
    System.out.print("What years would you like to see data from? (Enter two years, seperated by a space):  ");
    do {
      // Check if this if the first loop
      if (!firstLoopTemp) {
        if (userYearInputTwo == 0 || userYearInputOne == 0) {
          // This means there was an error in the formatting
          System.out.println();
          System.out.print("Please format your dates (eg #### ####):  ");
        } else {
          // This means the years were out of range
          System.out.println();
          System.out.print("Please enter years between 1995 and 2015:  ");
        }
      }
      userYearInputOne = in.nextInt();
      userYearInputTwo = in.nextInt();

      firstLoopTemp = false;
    } while (userYearInputOne == 0 || userYearInputTwo == 0 || userYearInputOne <= 1994 || userYearInputTwo >= 2016
        || userYearInputTwo <= 1994 || userYearInputTwo >= 2016);

    int userSelectionYearOne = userYearInputOne;
    int userSelectionYearTwo = userYearInputTwo;

    // Create an object for each hurricane and assign to array
    for (int i = 0; i < years.length; i++) {
      if (years[i] >= userSelectionYearOne && years[i] <= userSelectionYearTwo) {
        // Create new Hurricane object
        Hurricane newItem = new Hurricane(years[i], months[i], pressures[i], windSpeeds[i], names[i], categories[i]);

        // Assign a temporary array
        ArrayList<Hurricane> temp = new ArrayList<Hurricane>();

        // Add current hurricanes in array
        for (int k = 0; k < hurricanesInYearRange.length; k++) {
          temp.add(hurricanesInYearRange[k]);
        }

        // Add the new hurricane
        temp.add(newItem);

        // Convert back to an array
        hurricanesInYearRange = temp.toArray(new Hurricane[hurricanesInYearRange.length]);
      }
    }

    // Declare min and max variables
    double minWindSpeed = Integer.MAX_VALUE;
    double maxWindSpeed = Integer.MIN_VALUE;
    int minCategory = Integer.MAX_VALUE;
    int maxCategory = Integer.MIN_VALUE;
    int minPressure = Integer.MAX_VALUE;
    int maxPressure = Integer.MIN_VALUE;

    // Declare total variables
    double totalWindSpeed = 0.0;
    double totalCategoryNumber = 0.0;
    double totalPressure = 0.0;
    int totalCat1 = 0;
    int totalCat2 = 0;
    int totalCat3 = 0;
    int totalCat4 = 0;
    int totalCat5 = 0;

    // Calculate the min, max and totals
    for (int hurricane = 0; hurricane < hurricanesInYearRange.length; hurricane++) {
      if (hurricanesInYearRange[hurricane].windSpeed < minWindSpeed) {
        minWindSpeed = hurricanesInYearRange[hurricane].windSpeed;
      }
      if (hurricanesInYearRange[hurricane].windSpeed > maxWindSpeed) {
        maxWindSpeed = hurricanesInYearRange[hurricane].windSpeed;
      }
      if (hurricanesInYearRange[hurricane].category < minCategory) {
        minCategory = hurricanesInYearRange[hurricane].category;
      }
      if (hurricanesInYearRange[hurricane].category > maxCategory) {
        maxCategory = hurricanesInYearRange[hurricane].category;
      }
      if (hurricanesInYearRange[hurricane].pressure < minPressure) {
        minPressure = hurricanesInYearRange[hurricane].pressure;
      }
      if (hurricanesInYearRange[hurricane].pressure > maxPressure) {
        maxPressure = hurricanesInYearRange[hurricane].pressure;
      }

      switch (hurricanesInYearRange[hurricane].category) {
      case 1:
        totalCat1++;
        break;
      case 2:
        totalCat2++;
        break;
      case 3:
        totalCat3++;
        break;
      case 4:
        totalCat4++;
        break;
      case 5:
        totalCat5++;
        break;
      }

      totalWindSpeed += hurricanesInYearRange[hurricane].windSpeed;
      totalCategoryNumber += hurricanesInYearRange[hurricane].category;
      totalPressure += hurricanesInYearRange[hurricane].pressure;
    }

    // Calculate the averages
    double averageWindSpeed = totalWindSpeed / hurricanesInYearRange.length;
    double averageCategory = totalCategoryNumber / hurricanesInYearRange.length;
    double averagePressure = totalPressure / hurricanesInYearRange.length;

    // Print out data
    System.out.println("Hurricanes during " + userSelectionYearOne + " - " + userSelectionYearTwo);
    System.out.println();

    DecimalFormat df = new DecimalFormat("#.00");

    String format = "%-15d%-10s%12d%20s%20s";
    System.out.printf("%-15s%-10s%12s%20s%20s\n", "YEAR", "HURRICANE", "CATEGORY", "PRESSURE (mb)", "WIND SPEED (mph)");
    System.out.println("_____________________________________________________________________________");
    System.out.println();
    for (Hurricane hurricane : hurricanesInYearRange) {
      System.out.printf(format, hurricane.year, hurricane.name, hurricane.category,
          Integer.toString(hurricane.pressure) + " mb", df.format(hurricane.windSpeed) + " mph");
      System.out.println();
    }
    System.out.println("_____________________________________________________________________________");
    System.out.println();
    System.out.printf("%-15s%-10s%12s%20s%20s\n", "Averages:", "", df.format(averageCategory),
        df.format(averagePressure) + " mb", df.format(averageWindSpeed) + " mph");
    System.out.printf("%-15s%-10s%12d%20s%20s\n", "Minimum:", "", minCategory, Integer.toString(minPressure) + " mb",
        df.format(minWindSpeed) + " mph");
    System.out.printf("%-15s%-10s%12d%20s%20s\n", "Maximum:", "", maxCategory, Integer.toString(maxPressure) + " mb",
        df.format(maxWindSpeed) + " mph");
    System.out.println();
    System.out.println("CATEGORY TOTALS:");
    System.out.println("----------------------");
    System.out.println("Total Category 1: " + totalCat1);
    System.out.println("Total Category 2: " + totalCat2);
    System.out.println("Total Category 3: " + totalCat3);
    System.out.println("Total Category 4: " + totalCat4);
    System.out.println("Total Category 5: " + totalCat5);

    // Write to new file
    File newOutFile = new File("hurricane_date_formatted.txt");
    PrintWriter outFile = new PrintWriter(newOutFile);

    outFile.println("Hurricane data from " + userSelectionYearOne + " to " + userSelectionYearTwo);
    outFile.println();

    for (Hurricane hurricane : hurricanesInYearRange) {
      outFile.printf(format, hurricane.year, hurricane.name, hurricane.category,
          Integer.toString(hurricane.pressure), df.format(hurricane.windSpeed));
      outFile.println();
    }
    outFile.println("_____________________________________________________________________________");
    outFile.println();
    outFile.printf("%-15s%-10s%12s%20s%20s\n", "Averages:", "", df.format(averageCategory),
        df.format(averagePressure), df.format(averageWindSpeed));
    outFile.printf("%-15s%-10s%12d%20s%20s\n", "Minimum:", "", minCategory, Integer.toString(minPressure),
        df.format(minWindSpeed));
    outFile.printf("%-15s%-10s%12d%20s%20s\n", "Maximum:", "", maxCategory, Integer.toString(maxPressure),
        df.format(maxWindSpeed));
    outFile.println();
    outFile.println();
    outFile.println("Total Category 1: " + totalCat1);
    outFile.println("Total Category 2: " + totalCat2);
    outFile.println("Total Category 3: " + totalCat3);
    outFile.println("Total Category 4: " + totalCat4);
    outFile.println("Total Category 5: " + totalCat5);

    outFile.close();
  }
}
