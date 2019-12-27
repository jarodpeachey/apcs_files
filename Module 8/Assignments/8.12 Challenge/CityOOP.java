/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class CityOOP {
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
  CityOOP(String newCity, String newState, double[] newTemperature, double[] newPrecipitation) {
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

  public double getMinTemperature(String format) {
    double minTemperature = Double.MAX_VALUE;

    for (int i = 0; i < this.temperature.length; i++) {
      if (temperature[i] < minTemperature) {
        minTemperature = temperature[i];
      }
    }

    if (format.equalsIgnoreCase("c")) {
      return (minTemperature - 32) * (5.0 / 9.0);
    } else {
      return minTemperature;
    }
  }

  public double getMaxTemperature(String format) {
    double maxTemperature = 0.0;

    for (int i = 0; i < this.temperature.length; i++) {
      if (temperature[i] > maxTemperature) {
        maxTemperature = temperature[i];
      }
    }

    if (format.equalsIgnoreCase("c")) {
      return (maxTemperature - 32) * (5.0 / 9.0);
    } else {
      return maxTemperature;
    }
  }

  public double getAverageTemperature(String format) {
    int count = 0;
    double totalTemp = 0.0;
    for (int i = 0; i < temperature.length; i++) {
      totalTemp += temperature[i];
      count++;
    }

    double averageTemperature = totalTemp / count;

    if (format.equalsIgnoreCase("c")) {
      return (averageTemperature - 32) * (5.0 / 9.0);
    } else {
      return averageTemperature;
    }
  }

  public double getMinPrecipitation(String format) {
    double minPrecipitation = Double.MAX_VALUE;

    for (int i = 0; i < this.precipitation.length; i++) {
      if (precipitation[i] < minPrecipitation) {
        minPrecipitation = precipitation[i];
      }
    }

    if (format.equalsIgnoreCase("c")) {
      return minPrecipitation * 2.54;
    } else {
      return minPrecipitation;
    }
  }

  public double getMaxPrecipitation(String format) {
    double maxPrecipitation = 0.0;

    for (int i = 0; i < this.precipitation.length; i++) {
      if (precipitation[i] > maxPrecipitation) {
        maxPrecipitation = precipitation[i];
      }
    }

    if (format.equalsIgnoreCase("c")) {
      return maxPrecipitation * 2.54;
    } else {
      return maxPrecipitation;
    }
  }

  public double getAveragePrecipitation(String format) {
    int count = 0;
    double totalPrecip = 0.0;
    for (int i = 0; i < precipitation.length; i++) {
      totalPrecip += precipitation[i];
      count++;
    }

    double averagePrecipitation = totalPrecip / count;

    if (format.equalsIgnoreCase("c")) {
      return averagePrecipitation * 2.54;
    } else {
      return averagePrecipitation;
    }
  }
}
