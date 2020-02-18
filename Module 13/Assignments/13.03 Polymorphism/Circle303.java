/**
 * This class defines a Circle for inheritance
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

public class Circle303 {
  // instance variables
  private int x;
  private int y;
  private int radius;

  // Constructor for objects of class Circle
  public Circle303(int p_x, int p_y, int r) {
    // initialize instance variables
    x = p_x;
    y = p_y;
    radius = r;
  }

  public int getRadius() {
    return radius;
  }

  // Get name method
  public String getName() {
    return "Circle";
  }

  public Boolean hasHeight() {
    return false;
  }

  public int getHeight() {
    return 0;
  }

  // Concatenates a String to show the center x, y point of the circle
  public String getCenter() {
    return "center is at (" + x + ", " + y + ")";
  }

  // Concatenates a String to show the center x, y point of the circle
  public String getCenter(int h) {
    return "center is at (" + x + ", " + y + ", " + h + ")";
  }
}
