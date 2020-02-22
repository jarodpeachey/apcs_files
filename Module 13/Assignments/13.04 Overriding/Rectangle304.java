
/**
 * This class defines a Rectangle object using length and width. The toString
 * method has been added.
 *
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Rectangle304 {
  // instance variables
  private int length;
  private int width;

  // Constructor for objects of class Rectangle
  public Rectangle304(int l, int w) {
    // initialize instance variables
    length = l;
    width = w;
  }

  // return the height
  public int getLength() {
    return length;
  }

  // return the width
  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return 0;
  }

  // String to display when object is printed.

  public String toString() {
    return "The rectangle's dimensions are " + length + " X " + width;
  }

  public Boolean equals(Rectangle304 compareObj) {
    if (compareObj.getHeight() == getHeight() && compareObj.getWidth() == getWidth()
        && compareObj.getLength() == getLength()) {
      return true;
    } else {
      return false;
    }
  }
}
