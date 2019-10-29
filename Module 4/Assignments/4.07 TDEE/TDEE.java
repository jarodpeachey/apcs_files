
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
  static String userName = "";
  static int userAge = 0;
  static String userGender = "";

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your first and last name:  ");
    String fullName = in.next();
    fullName += in.nextLine();
    System.out.println("");
    userName = fullName;

    System.out.print("What is your gender? (M/F) ");
    while (!in.hasNext("[mfMF]")) {
      System.out.print("Try again. Please enter your gender:  ");
      in.next();
    }
    String gender = in.next();
    userGender = gender;
    System.out.println();

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
    userAge = age;

    System.out.println("Select your activity level:");
    System.out.println("[A] Resting (Sleeping, Reclining)");
    System.out.println("[B] Sedentary (Minimal Movement");
    System.out.println("[C] Light (Sitting, Standing)");
    System.out.println("[D] Moderate (Light Manual Labor, Dancing, Biking)");
    System.out.println("[E] Very Active (Hard Manual Labor, Sports)");
    System.out.println("[F] Extremely Active (Full-Time Athlete, Heavy Manual Labor)");
    System.out.println();

    System.out.print("Enter the letter corresponding to your activity level:  ");
    while (!in.hasNext("[abcdef]")) {
      System.out.print("Try again. Please enter the letter corresponding to your activity level:  ");
      in.next();
    }
    String activityLevel = in.next();

    calculateActivityFactor(gender, activityLevel);
    calculateBMR(gender, feet, inches, weight, age);
    calculateTDEE(userBMR, userActivityFactor);
    DecimalFormat df = new DecimalFormat("#.00");

    String format = "%1$-30s%2$-2s\n";

    System.out.println();
    System.out.println("Your test is complete!! Here are your results:");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("");
    // System.out.format("%1$2s %2$30s", "Name: " + userName.trim(), "Gender: " + userGender.trim());
    // System.out.println();
    // System.out.format("%1$2s %2$30s", "BMR: " + df.format(userBMR), "ActivityFactor: " + userActivityFactor);
    String userNameString = "Name: " + userName;
    String userGenderString = "Gender: " + userGender;
    String userBMRString = "BMR: " + df.format(userBMR);
    String userActivityFactorString = "BMR: " + userActivityFactor;
    System.out.format(format, userNameString, userGenderString);
    System.out.format(format, userBMRString, userActivityFactorString);
    System.out.println("TDEE: " + df.format(userTDEE));
  }// end of main method

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

      userGender = "Female";
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
      userGender = "Male";
    }

    userActivityFactor = calculatedActivityFactor;
  }

  static void calculateTDEE(double BMR, double activityLevel) {
    double TDEE = BMR * activityLevel;

    userTDEE = TDEE;
  }
}// end of class
