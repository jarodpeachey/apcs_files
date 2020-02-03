import java.util.Scanner;
import java.util.ArrayList;

public class MathEquations {
  public static void main(String[] args) {
    System.out.println(recur("mouse", 1));
    
  } // end main

public static String recur(String str, int n)
{
     if(n >= str.length())
     {
          return str;
     }

     return str + recur(str.substring(n + 1), n);
}
}// end class Lottery

/*
javac MathEquations.java
java MathEquations
 */
