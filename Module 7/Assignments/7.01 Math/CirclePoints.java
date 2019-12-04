
/**
@author Jarod Peachey
@version 1.0.0
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CirclePoints {
  public static void main(String[] args) {
    // Adjust these
    double radius = 2.5;
    double increment = 0.25;

    // Variables
    DecimalFormat df = new DecimalFormat("#.00");
    double x = radius;

    System.out.printf("%10s%10s%10s%10s\n", "X1", "Y1", "X1", "Y2");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    do {
      double y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(x, 2));
      double y2 = y1 * -1;
      System.out.printf("%10s%10s%10s%10s\n", df.format(x), df.format(y1), df.format(x), df.format(y2));
      x -= increment;
    } while (Math.abs(x) <= Math.abs(radius));
  } // end main
}// end class CirclePoints
