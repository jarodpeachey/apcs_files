/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class City {
  private double[] temperature, precipitation;
  private String city, state;

  /**
   * Constructor for objects of type Emissions
   * 
   * @param newCity          ---------- Name of the city
   * @param newState         --------- Name of the state
   * @param newTemperature   --- Array of temperatures
   * @param newPrecipitation - Array of precipitation
   */
  City(String newCity, String newState, double[] newTemperature, double[] newPrecipitation) {
    city = newCity;
    state = newState;
    precipitation = newPrecipitation;
    temperature = newTemperature;
  }

  public String getCity() {
    return city;
  }

  public String getState() {
    return state;
  }

  /**
   * Getter to return a temperature
   * 
   * @param i ---- Index to return
   */
  public double getTemperature(int i, String format) {
    if (format.equalsIgnoreCase("c")) {
      return (temperature[i] - 32) * (5.0 / 9.0);
    } else {
      return temperature[i];
    }
  }

  /**
   * Getter to return a precipitation value
   * 
   * @param i ---- Index to return
   */
  public double getPrecipitation(int i, String format) {
    if (format.equalsIgnoreCase("c")) {
      return precipitation[i] * 2.54;
    } else {
      return precipitation[i];
    }
  }
}
