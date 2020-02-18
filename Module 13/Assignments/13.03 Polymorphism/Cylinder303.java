/**
 * This class defines a Cylinder that extends the Circle class
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

public class Cylinder303 extends Circle303 {
  // instance variables
  private int height;

  // Constructor for objects of class Cylinder
  public Cylinder303(int x, int y, int rad, int h) {
    // call superclass
    super(x, y, rad);

    // initialize instance variables
    height = h;
  }

  // Get name method
  public String getName() {
    return "Cylinder";
  }

  public int getHeight() {
    return height;
  }

  public Boolean hasHeight() {
    return true;
  }
}
