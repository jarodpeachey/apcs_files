
/**
 * This class defines a rain forest.
 *
 * @author Jarod Peachey
 * @version 2-14-2020
 */

public class RainForest extends Forest {
  private double rainInches = 13.0;

  public RainForest(int l, int w, int c, double i) {
    super(l, w, c);

    rainInches = i;
  }

  public double getRain() {
    return rainInches;
  }
}
