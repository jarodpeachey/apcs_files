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
      int number = 0;
      while (number < 100){
        int digit = (int) (Math.random()*10) + 1;
        System.out.println(digit);
        number++;
      }

      String phoneNum1 = "1234567890";
      String areaCode1 = phoneNum1.substring(3);

      System.out.println(areaCode1);
    } //end main
}//end class Lottery

/*
javac MathEquations.java 
java MathEquations
 */
