
/**
 * This class calculates all prime numbers in a given range
 * 
 * @author Jarod Peachey
 * @version 1.0.0
 *
 */

import java.util.ArrayList;

public class PrimeNumbers {
  // instance variables
  private int[] range;
  private ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

  // Constructor for objects of class Circle
  public PrimeNumbers(int[] range) {
    // initialize instance variables
    this.range = range;
    calculatePrimeNumbers();
  }

  private boolean isPrime(int n) {

    if (n <= 1) {
      return false;
    }

    for (int i = 2; i < n; i++)
      if (n % i == 0) {
        return false;
      }

    return true;
  }

  public void calculatePrimeNumbers() {
    for (int i = range[0]; i <= range[1]; i++) {
      if (isPrime(i)) {
        primeNumbers.add(i);
      }
    }
  }

  public ArrayList<Integer> getPrimeNumbers() {
    return primeNumbers;
  }
}
