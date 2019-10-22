
/**
 * The purpose of this program is to calculate the BMI of the user
 * 
 * @author Jarod Peachey
 * @version 9/12/19
 */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.lang.Math;
import java.text.DecimalFormat;

public class BMI {
  static double userBMI = 0.0;
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("What is your height? (FEET INCHES)  ");
    String height = in.next();
    String inches = in.nextLine();
    System.out.println("");

    System.out.print("What is your weight in pounds?  ");
    int weight = in.nextInt();
    System.out.println("");

    calculateBMI(height, inches, weight);

    DecimalFormat formatUserBMI = new DecimalFormat("#.00");

    String finalBMI = formatUserBMI.format(userBMI);

    System.out.println("Your BMI is " + formatUserBMI.format(userBMI));
    System.out.println("");

    String weightStatus = "";

    if (Double.parseDouble(finalBMI) < 18.5)
      weightStatus = "Underweight";
    else if (Double.parseDouble(finalBMI) < 24.5)
      weightStatus = "Normal";
    else if (Double.parseDouble(finalBMI) < 30)
      weightStatus = "Overweight";
    else
      weightStatus = "Obese";

    System.out.println("Your weight status is: \"" + weightStatus + "\"");
  }// end of main method

  static void calculateBMI(String height, String inches, int weight) {
    double wholeFeet = Double.parseDouble(height) +  ( Double.parseDouble(inches) / 12);
    double heightInMeters = wholeFeet / 3.28;
    double weightInKilos =  (double)(weight) / 2.2046;
    double calculatedUserBMI = weightInKilos / (double)Math.pow(heightInMeters, 2);

    userBMI = calculatedUserBMI;
  }
}// end of class
