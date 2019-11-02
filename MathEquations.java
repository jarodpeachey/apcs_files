/**
 * The Lottery program generates a 3-digit random lottery number ranging
 * from 000 to 999 (inclusive). The user takes a guess and the program
 * provides feedback if the front pair, back pair, all three, or none
 * of the digits match.
 *
 * @author Ada Lovelace
 * @version 7/1/2019
 */

import java.util.Scanner;
public class MathEquations
{
    public static void main(String[] args)
    {
      String phoneNum1 = "407-555-2207";
      String phoneNum2 = "407-555-2207";

      System.out.println(phoneNum1.compareTo(phoneNum2) > 0);
      System.out.println(phoneNum1.compareTo(phoneNum2) == 0);
      System.out.println(phoneNum1.compareTo(phoneNum2) > 0);
    } //end main
}//end class Lottery

/*
javac MathEquations.java 
java MathEquations
 */
