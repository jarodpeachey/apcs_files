
/**
 * This class defines a beach terrain.
 *
 * @author Jarod Peachey
 * @version 2-14-2020
 */

public class Beach extends Terrain {
  private String weather;

  public Beach(int l, int w, String newWeather) {
    super(l, w);

    weather = newWeather;
  }

  public String getWeather() {
    return weather;
  }
}
