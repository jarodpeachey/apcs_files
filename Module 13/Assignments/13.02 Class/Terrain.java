
/**
 * This class defines a basic Terrain.
 *
 * @author Jarod Peachey
 * @version 2-14-2020
 */

public class Terrain {
  private int length, width;

  public Terrain(int l, int w) {
    length = l;
    width = w;
  }

  public int getWidth() {
    return width;
  }

  public int getLength() {
    return length;
  }
}
