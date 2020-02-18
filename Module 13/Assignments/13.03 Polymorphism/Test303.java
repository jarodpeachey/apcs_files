
/**
 * This class tests the Circle303 class hierarchy.
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

import java.util.ArrayList;

public class Test303 {
  public static void main(String[] args) {
    ArrayList<Circle303> shapes = new ArrayList<Circle303>();

    shapes.add(new Circle303(3, 4, 5));
    shapes.add(new Cylinder303(3, 6, 5, 10));
    shapes.add(new Oval303(5, 2, 5, 1));
    shapes.add(new OvalCylinder303(7, 4, 5, 1, 10));

    System.out.println();
    for (Circle303 shape : shapes) {
      if (shape.hasHeight()) {
        System.out.println("For the shape " + shape.getName() + ", the " + showCenter(shape.getName(), shapes, shape.getHeight()));
      } else {
        System.out.println("For the shape " + shape.getName() + ", the " + showCenter(shape.getName(), shapes));
      }
    }
  }

  public static String showCenter(String name, ArrayList<Circle303> shapes) {
    String returnValue = "";

    for (Circle303 shape : shapes) {
      // System.out.print("Shape name: " + shape.getName().toLowerCase());
      // System.out.print(" Name: " + name.toLowerCase());
      // System.out.println(" They are equal: " +
      // name.toLowerCase().equals(shape.getName().toLowerCase()));
      if (name.toLowerCase().equals(shape.getName().toLowerCase())) {
        returnValue = shape.getCenter();
        break;
      } else {
        returnValue = "center cannot be found.";
      }
    }

    return returnValue;
  }

  public static String showCenter(String name, ArrayList<Circle303> shapes, int height) {
    String returnValue = "";

    for (Circle303 shape : shapes) {
      // System.out.print("Shape name: " + shape.getName().toLowerCase());
      // System.out.print(" Name: " + name.toLowerCase());
      // System.out.println(" They are equal: " +
      // name.toLowerCase().equals(shape.getName().toLowerCase()));
      if (name.toLowerCase().equals(shape.getName().toLowerCase())) {
        returnValue = shape.getCenter(height);
        break;
      } else {
        returnValue = "center cannot be found.";
      }
    }

    return returnValue;
  }
}
