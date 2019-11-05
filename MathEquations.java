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
for(int t = 0; t < 10; t++)
     for(int f = 0; f < 1000; f++)
        System.out.format("%20%20", "T: " + t, "F: " + f);
    } //end main
}//end class Lottery

/*
javac MathEquations.java 
java MathEquations
 */
