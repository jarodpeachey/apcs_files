/**
 * This class defines a CylinderOval that extends the Oval class
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

public class OvalCylinder303 extends Oval303 {
  // instance variables
  private int height;

  // Constructor for objects of class OvalCylinder
  public OvalCylinder303(int x, int y, int rad1, int rad2, int h) {
    // call superclass
    super(x, y, rad1, rad2);

    // initialize instance variables
    height = h;
  }

  // Get name method
  public String getName() {
    return "OvalCylinder";
  }

  public int getHeight() {
    return height;
  }

  public Boolean hasHeight() {
    return true;
  }
}
