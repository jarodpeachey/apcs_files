/**
 * This class defines a CylinderOval that extends the Oval class
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

public class OvalCylinder extends Oval {
  // instance variables
  private int height;

  // Constructor for objects of class OvalCylinder
  public OvalCylinder(int x, int y, int rad1, int rad2, int h) {
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
