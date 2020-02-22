/**
 * This class defines a Cube object by extending Box and includes height. The
 * toString method has been added.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */
public class Cube304 extends Box304 {
  private int value;

  // Constructor for objects of class Cube
  public Cube304(int l, int w, int h) {
    // call superclass
    super(l, w, h);

    value = l;
  }

  // return the height
  public int getHeight() {
    return value;
  }

  // return the height
  public int getLength() {
    return value;
  }

  // return the height
  public int getWidth() {
    return value;
  }

  public String getType() {
    return "Cube";
  }

  // String to display when object is printed.
  public String toString() {
    return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
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
