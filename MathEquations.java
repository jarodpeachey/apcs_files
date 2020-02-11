import java.util.Scanner;
import java.util.ArrayList;

public class MathEquations {
  public static void main(String[] args) {
    int n1 = 0, n2 = 16;
    int hcf = hcf(n1, n2);
    System.out.println(hcf);
  }

  public static int hcf(int n1, int n2) {
    if (n2 != 0)
      return hcf(n2, n1 % n2);
    else
      return n1;
  }
}

/*

javac MathEquations.java
java MathEquations
 */
