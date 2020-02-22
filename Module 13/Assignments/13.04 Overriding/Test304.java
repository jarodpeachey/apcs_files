
/**
 * This class tests the Rectangle304 class hierarchy.
 *
 * @author Jarod Peachey
 * @version 2-18-2020
 */

import java.util.ArrayList;

public class Test304 {
  public static void main(String[] args) {
    ArrayList<Rectangle304> shapes = new ArrayList<Rectangle304>();

    Rectangle304 rectangleOne = new Rectangle304(3, 4);
    Rectangle304 rectangleTwo = new Rectangle304(6, 2);
    Box304 boxOne = new Box304(3, 3, 3);
    Box304 boxTwo = new Box304(6, 2, 3);
    Cube304 cubeOne = new Cube304(3, 4, 8);
    Cube304 cubeTwo = new Cube304(6, 2, 3);

    shapes.add(rectangleOne);
    shapes.add(rectangleTwo);
    shapes.add(boxOne);
    shapes.add(boxTwo);
    shapes.add(cubeOne);
    shapes.add(cubeTwo);

    for (int i = 0; i < shapes.size(); i++) {
      showEffectBoth(shapes.get(i));
      System.out.println();
    }

    System.out.println(boxOne.getType() + " " + boxOne.getSize() + " " + boxOne.equals(rectangleOne));
    System.out.println(rectangleTwo.getType() + " " + rectangleTwo.getSize() + " " + rectangleTwo.equals(cubeTwo));
    System.out.println(boxOne.getType() + " " + boxOne.getSize() + " " + boxOne.equals(cubeOne));
    System.out.println(boxOne.getType() + " " + boxOne.getSize() + " " + boxOne.equals(cubeTwo));
  }

  public static void showEffectBoth(Rectangle304 r) {
    System.out.println(r);
  }
}
