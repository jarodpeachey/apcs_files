
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
        String[] strings = new String[3];
        strings[0] = "Jarod";
        strings[1] = "William";
        strings[2] = "Peachey";

        double averageLength = returnAverageLength(strings);

        System.out.println("The average length is: " + averageLength);
    } // end main

    public static double returnAverageLength(String[] strings) {
        int totalLength = 0;
        for (int i = 0; i < strings.length; i++) {
            totalLength += strings[i].length();
        }

        double average = (double)totalLength / (double)strings.length;

        return average;
    }
}// end class Lottery

/*
javac MathEquations.java
java MathEquations
 */
