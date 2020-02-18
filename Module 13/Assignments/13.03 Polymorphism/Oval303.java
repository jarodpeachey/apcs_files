/**
 * This class defines a Oval that extends the Circle class
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

public class Oval303 extends Circle303 {
  // instance variables
  private int radius2;

  // Constructor for objects of class Oval
  public Oval303(int x, int y, int rad1, int rad2) {
    // call superclass
    super(x, y, rad1);

    // initialize instance variables
    radius2 = rad2;
  }

  // Get name method
  public String getName() {
    return "Oval";
  }

  public int getRadius2() {
    return radius2;
  }


  public Boolean hasHeight() {
    return false;
  }
}
