/**
 * This class defines a Box object by extending Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Box304 extends Rectangle304 {
  // instance variables
  private int height;

  // Constructor for objects of class Box
  public Box304(int l, int w, int h) {
    // call superclass
    super(l, w);

    // initialize instance variables
    height = h;
  }

  // return the height
  public int getHeight() {
    return height;
  }

  public String getSize() {
    return getLength() + " X " + getWidth() + " X " + getHeight();
  }

  public String getType() {
    return "Box";
  }

  // String to display when object is printed.

  public String toString() {
    return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
  }

  // public Boolean equals(Rectangle304 compareObj) {
  //   if (compareObj.getHeight() == getHeight() && compareObj.getWidth() == getWidth()
  //       && compareObj.getLength() == getLength()) {
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }
}
