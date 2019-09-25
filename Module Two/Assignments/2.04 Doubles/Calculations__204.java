/**
 * The Calculations class performs addition, subtraction, multiplication,
 * division, and modulus operations on integers and decimals.
 * 
 * @author Jarod Peachey
 * @version 9/10/19
 */

public class Calculations__204 {
  public static void main(String[] args) {
    int integer1 = 25;
    int integer2 = 9;
    int integer3 = 11;
    int integer4 = 4;
    int integer5 = 10;
    int integer6 = 15;

    double decimal1 = 43.21;
    double decimal2 = 3.14;
    double decimal3 = 10.0;
    double decimal4 = 5.5;
    double decimal5 = 10.5;
    double decimal6 = 27.5;

    // Addition
    System.out.println("//// Addition");
    System.out.println(integer1 + " + " + integer2 + " = " + (integer1 + integer2));
    System.out.println(decimal1 + " + " + decimal2+ " + " + decimal3+ " = " + (decimal1 + decimal2 + decimal3));
    System.out.println();

    // Subtraction
    System.out.println("//// Subtraction");
    System.out.println(integer3 + " - " + integer2 + " - " + integer1 + " = " + (integer3 - integer2 - integer1));
    System.out.println(decimal2 + " - " + decimal3 + " = " + (decimal2 - decimal3));
    System.out.println();

    // Multiplication
    System.out.println("//// Multiplication");
    System.out.println(integer1 + " * " + integer2 + " = " + (integer1 * integer2));
    System.out.println(decimal2 + " * " + decimal3 + " * " + decimal3 + " = " + (decimal2 * decimal3 * decimal3));
    System.out.println();

    // Division
    System.out.println("//// Division");
    System.out.println(integer2 + " / " + integer1 + " = " + (integer2 / integer1));
    System.out.println(decimal1 + " / " + decimal3 + " = " + (decimal1 / decimal3));
    System.out.println();

    // Modulus operator
    System.out.println("//// Modulus");
    System.out.println(integer3 + " % " + integer2 + " = " + (integer3 % integer2));
    System.out.println(decimal3 + " % " + decimal2 + " = " + (decimal3 % decimal2));
    System.out.println();

    // 2.03 Additional int Equations
    System.out.println("//// 2.03 Int Equations");
    System.out.println(integer5 + " / " + integer4 + " * " + integer2 + " = " + (integer5 / integer4 * integer2));
    System.out.println(integer6 + " - " + integer2 + " / " + integer4 + " = " + (integer6 - integer2 / integer4));
    System.out.println(integer6 + " % " + integer2 + " - " + integer2 + " = " + (integer6 % integer2 - integer2));

    // 2.04 Additional double Equations
    System.out.println("//// 2.04 Doubles Equations");
    System.out.println(decimal4 + " % " + decimal6 + " - " + decimal4 + " = " + (decimal4 % decimal6 - decimal4));
    System.out.println(decimal5 + " * " + "(" + decimal6 + " - " + decimal4 + ")" + " * " + decimal4 + " = " + (decimal5 * (decimal6 - decimal4) * decimal4));
    System.out.println(decimal4 + " - " + decimal6 + " * " + decimal6 + " = " + (decimal4 - decimal6 * decimal6));
    System.out.println();

  } // end of main method
} // end of class