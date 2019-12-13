/**
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class PeopleV8 {
  private String firstName;
  private String lastName;
  private int weight;
  private int height;
  private double bmi;
  private double waterIntake;

  public PeopleV8(String newFirstName, String newLastName, int newWeight, int newHeight) {
    firstName = newFirstName;
    lastName = newLastName;
    weight = newWeight;
    height = newHeight;

    this.setWaterIntake();
    this.setBMI();
  }

  // These methods are the setter and mutator methods
  public void setFirstName(String newFirstName) {
    firstName = newFirstName;
  }

  public void setLastName(String newLastName) {
    lastName = newLastName;
  }

  public void setWeight(int newWeight) {
    weight = newWeight;
    this.setWaterIntake();
    this.setBMI();
  }

  public void setHeight(int newHeight) {
    height = newHeight;
    this.setWaterIntake();
  }

  private void setWaterIntake() {
    waterIntake = 0.75 * height;
  }

  private void setBMI() {
    bmi = (weight * 703) / height;
  }

  // These are the getter methods
  public double getBMI() {
    return bmi;
  }

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
