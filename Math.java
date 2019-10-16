
/**
 * The purpose of this program is to do math
 * 
 * @author Jarod Peachey
 * @version 9/12/19
 */

import java.util.Scanner;

public class Math {
  public static void main(String[] args) {
    System.out.println("Weight (kg): " + (int) (10 * 135) / 10.0);
    System.out.println("Height (cm): " + (int) (10 * 200) / 10.0);
    System.out.println("Basal Metabolic Rate: " + (int) (10 * 12) / 10.0);

    String genderString = "female";
    String ageString = "12";
    char gender = genderString.indexOf('0');
    boolean isFemale = gender == "F";
    int age = Integer.parseInt(ageString);

    System.out.println("Is female: " + isFemale);
    System.out.println("Age:" + age);
  }// end of main method
}// end of class

/*
 javac Math.java
 java Math
 */
