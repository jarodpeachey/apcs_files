
/**
 * The purpose of this program is to calculate the TDEE of the user
 * 
 * @author Jarod Peachey
 * @version 10/27/19
 */

import java.util.Scanner;

import java.lang.Math;
import java.text.DecimalFormat;

public class TDEE {
  static double userBMR = 0.0;
  static double userTDEE = 0.0;
  static double userActivityFactor = 0.0;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your first and last name:  ");
    String fullName = in.next();
    fullName += in.nextLine();
    System.out.println("");

    System.out.print("What is your gender (m/f)");
    String gender = in.next();

    System.out.print("What is your height? (FEET INCHES)  ");
    String feet = in.next();
    String inches = in.nextLine();
    System.out.println("");

    System.out.print("What is your weight in pounds?  ");
    int weight = in.nextInt();
    System.out.println("");

    System.out.print("What is your age?  ");
    int age = in.nextInt();
    System.out.println("");

    System.out.println("Select your activity level");
    System.out.println("[A] Resting (Sleeping, Reclining)");
    System.out.println("[B] Sedentary (Minimal Movement");
    System.out.println("[C] Light (Sitting, Standing)");
    System.out.println("[D] Moderate (Light Manual Labor, Dancing, Biking)");
    System.out.println("[E] Very Active (Hard Manual Labor, Sports)");
    System.out.println("[F] Extremely Active (Full-Time Athlete, Heavy Manual Labor)");
    System.out.println();

    TDEE demo = new TDEE();
    String activityLevel = demo.validateCharacter();

    if (in.next().toLowerCase() == "a" || in.next().toLowerCase() == "b" || in.next().toLowerCase() == "c"
        || in.next().toLowerCase() == "d" || in.next().toLowerCase() == "e" || in.next().toLowerCase() == "f") {
      activityLevel = in.next();
    }

    calculateActivityFactor(gender, activityLevel);

    calculateBMR(gender, feet, inches, weight, age);

    DecimalFormat formatDecimal = new DecimalFormat("#.00");

    String finalBMR = formatDecimal.format(userBMR);

    System.out.println("BMR: " + finalBMR);
    System.out.println("Activity Factor: " + userActivityFactor);
  }// end of main method

  public String validateCharacter() {
    Scanner in = new Scanner(System.in);

    String activityLevel = "";

    do {
      System.out.print("Please enter the letter corresponding to your activity level:  ");
      activityLevel = in.next();
    } while (activityLevel.toLowerCase() != "a" && activityLevel.toLowerCase() != "b" && activityLevel.toLowerCase() != "c" && activityLevel.toLowerCase() != "d" && activityLevel.toLowerCase() != "e" && activityLevel.toLowerCase() != "f");

    System.out.print("SUCCESS");

    return activityLevel;
  }

  static void calculateBMR(String gender, String feet, String inches, int weight, int age) {
    double totalInches = Double.parseDouble(feet) / 12 + (Double.parseDouble(inches));
    int endNumber;

    if (gender == "f") {
      endNumber = -161;
    } else {
      endNumber = 5;
    }

    double calculatedBMR = (4.536 * weight) + (15.88 * totalInches) - (5 * age) + endNumber;

    userBMR = calculatedBMR;
  }

  static void calculateActivityFactor(String gender, String activityLevel) {
    double calculatedActivityFactor = 0.0;
    if (gender.toLowerCase() == "f") {
      switch (activityLevel.toLowerCase()) {
      case "a":
        calculatedActivityFactor = 1.0;
        break;
      case "b":
        calculatedActivityFactor = 1.3;
        break;
      case "c":
        calculatedActivityFactor = 1.5;
        break;
      case "d":
        calculatedActivityFactor = 1.6;
        break;
      case "e":
        calculatedActivityFactor = 1.9;
        break;
      case "f":
        calculatedActivityFactor = 2.2;
        break;
      }
    } else {
      switch (activityLevel.toLowerCase()) {
      case "a":
        calculatedActivityFactor = 1.0;
        break;
      case "b":
        calculatedActivityFactor = 1.3;
        break;
      case "c":
        calculatedActivityFactor = 1.6;
        break;
      case "d":
        calculatedActivityFactor = 1.7;
        break;
      case "e":
        calculatedActivityFactor = 2.1;
        break;
      case "f":
        calculatedActivityFactor = 2.4;
        break;
      }
    }

    userActivityFactor = calculatedActivityFactor;
  }

  static String getUserWeightStatus(double BMI) {
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
