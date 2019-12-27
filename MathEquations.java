import java.util.Scanner;
import java.util.ArrayList;

public class MathEquations {
  public static void main(String[] args) {
    ArrayList<Integer> aList = new ArrayList<Integer>();

    aList.add(3);
    aList.add(5);
    aList.add(9);
    aList.add(7);
    aList.add(4);
    aList.add(2);
    aList.add(41);

    System.out.println();
    for (Integer person : aList) {
      System.out.println(person);
    }

    aList.add(3, -100);

    System.out.println();
    for (Integer person : aList) {
      System.out.println(person);
    }
  } // end main
}// end class Lottery

/*
javac MathEquations.java
java MathEquations
 */
