/**
 * This program calculates carbon footprint
 * 
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class FootprintV1 {
  private double myGallonsUsed, myTonsCO2, myPoundsCO2;

  /**
   * @param gallons
   * @return
   */
  FootprintV1(double gallons) {
    myGallonsUsed = gallons;
  }

  public void calcTonsCO2() {
    myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
  }

  public void convertTonsToPounds() {
    myPoundsCO2 = myTonsCO2 * 2205;
  }

  /**
   * @return double
   */
  public double getGallons() {
    return myGallonsUsed;
  }

  /**
   * @return double
   */
  public double getTonsCO2() {
    return myTonsCO2;
  }

  /**
   * @return double
   */
  public double getPoundsCO2() {
    return myPoundsCO2;
  }
}
