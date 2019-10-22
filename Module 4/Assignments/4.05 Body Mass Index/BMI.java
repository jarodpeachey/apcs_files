
/**
 * The purpose of this program is to calculate the BMI of the user
 * 
 * @author Jarod Peachey
 * @version 10/22/19
 */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.lang.Math;
import java.text.DecimalFormat;

public class BMI {
  static double userBMI = 0.0;
  static double userWeight = 0.0;
  static double userHeight = 0.0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your first and last name:  ");
    String fullName = in.next();
    fullName += in.nextLine();
    System.out.println("");

    System.out.print("What is your height? (FEET INCHES)  ");
    String height = in.next();
    String inches = in.nextLine();
    System.out.println("");

    System.out.print("What is your weight in pounds?  ");
    int weight = in.nextInt();
    System.out.println("");

    calculateBMI(height, inches, weight);

    DecimalFormat formatDecimal = new DecimalFormat("#.00");

    String finalBMI = formatDecimal.format(userBMI);
    String finalHeight = formatDecimal.format(userHeight);
    String finalWeight = formatDecimal.format(userWeight);

    String userWeightStatus = getUserWeightStatus(Double.parseDouble(finalBMI));

    System.out.println("~~~~~~~~ BMI Calculator Results ~~~~~~~~~~~");
    System.out.println();
    System.out.println("Name: " + fullName);
    System.out.println("Height: " + finalHeight + " (meters)");
    System.out.println("Weight: " + finalWeight + " (kilograms)");
    System.out.println("BMI: " + finalBMI);
    System.out.println("Weight Status: " + userWeightStatus);
  }// end of main method

  static void calculateBMI(String height, String inches, int weight) {
    double wholeFeet = Double.parseDouble(height) + (Double.parseDouble(inches) / 12);
    double calculatedUserHeight = wholeFeet / 3.28;
    double calculatedUserWeight = (double) (weight) / 2.2046;
    double calculatedUserBMI = calculatedUserWeight / (double) Math.pow(calculatedUserHeight, 2);

    userBMI = calculatedUserBMI;
    userWeight = calculatedUserWeight;
    userHeight = calculatedUserHeight;
  }

  static String getUserWeightStatus (double BMI) {
    String weightStatus = "";

    if (BMI < 18.5)
      weightStatus = "Underweight";
    else if (BMI < 24.5)
      weightStatus = "Normal";
    else if (BMI < 30)
      weightStatus = "Overweight";
    else
      weightStatus = "Obese";

    return weightStatus;
  }
}// end of class
