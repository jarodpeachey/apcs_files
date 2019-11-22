
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

public class MathEquations {
    public static void main(String[] args) {
        double [] numList = {4.17, 3.11, 2.46, 1.57};
        int x = 0;
        for(double n : numList)
        {
            x += (int)n - 1;
        }

        System.out.println(x);
    } // end main
}// end class Lottery

/*
javac MathEquations.java
java MathEquations
 */
