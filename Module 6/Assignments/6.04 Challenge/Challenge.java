
/**
 * APCS Team
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Challenge {
  static Hurricane[] hurricaneObjectArray = new Hurricane[0];

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

    int userYearInputOne = 0;
    int userYearInputTwo = 0;
    Boolean firstLoopTemp = true;
    System.out.println();
    System.out.print("What years would you like to see data from? (Enter two years, seperated by a space):  ");
    do {
      if (!firstLoopTemp) {
        if (userYearInputTwo == 0 || userYearInputOne == 0) {
          System.out.println();
          System.out.print("Please format your dates (eg #### ####):  ");
        } else {
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

    System.out.println(userSelectionYearOne);
    System.out.println(userSelectionYearTwo);

    for (int i = 0; i < years.length; i++) {
      if (years[i] >= userSelectionYearOne && years[i] <= userSelectionYearTwo) {
        Hurricane newItem = new Hurricane(years[i], months[i], pressures[i], windSpeeds[i], names[i], categories[i]);

        ArrayList<Hurricane> temp = new ArrayList<Hurricane>();

        for (int k = 0; k < hurricaneObjectArray.length; k++) {
          temp.add(hurricaneObjectArray[k]);
        }

        temp.add(newItem);

        hurricaneObjectArray = temp.toArray(new Hurricane[hurricaneObjectArray.length]);
      }
    }
    
    for (int j = 0; j < hurricaneObjectArray.length; j++) {
      System.out.println(hurricaneObjectArray[j].name);
    }
    
    
  }
}
