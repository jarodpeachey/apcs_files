
/**
 * This class defines a winter mountain.
 *
 * @author Jarod Peachey
 * @version 2-14-2020
 */

public class WinterMountain extends Mountain {
  private double temperature = 32.0;
  private double snowInches = 13.0;

  public WinterMountain(int l, int w, int c, double t, double i) {
    super(l, w, c);

    temperature = t;
    snowInches = i;
  }

  public double getTemp() {
    return temperature;
  }

  public double getSnow() {
    return snowInches;
  }
}
