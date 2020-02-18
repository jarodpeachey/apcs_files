
/**
 * This class defines a mountain terrain.
 *
 * @author Jarod Peachey
 * @version 2-14-2020
 */

public class Mountain extends Terrain {
  private int count = 0;

  public Mountain(int l, int w, int c) {
    super(l, w);

    count = c;
  }

  public int getNumberOfMountains() {
    return count;
  }
}
