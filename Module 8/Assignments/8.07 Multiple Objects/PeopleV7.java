/**
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class PeopleV7 {
  private String firstName;
  private String lastName;
  private int weight;
  private int height;
  private double bmi;
  private double waterIntake;

  public PeopleV7(String newFirstName, String newLastName, int newWeight, int newHeight) {
    firstName = newFirstName;
    lastName = newLastName;
    weight = newWeight;
    height = newHeight;

    waterIntake = 0.75 * newWeight;
    bmi = (weight * 703) / height;
  }

  // Calculate BMI
  public double getBMI() {
    return bmi;
  }

  // Calculate ideal weight
  public double getWaterIntake() {
    return waterIntake;
  }

  public String getName() {
    return firstName;
  }

  public String getName(Boolean getSurname) {
    return firstName + " " + lastName;
  }

  public int getWeight() {
    return weight;
  }

  public int getHeight() {
    return weight;
  }
}// end class
