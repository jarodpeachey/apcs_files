/**
 * The purpose of this program is to calculate the hypotenuse of a triangle and
 * its area. All calculations are done within methods. An object is instantiated
 * and all methods are invoked on the object.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
public class PeopleV3 {
  // default constructor
  public PeopleV3() {
  }

  // Calculate BMI
  public double calcBMI(int weight, int height) {
    return (weight * 703) / height;
  }

  // Calculate ideal weight
  public double calcWaterIntake(int weight) {
    return 0.75 * weight;
  }

  // main method
  public static void main(String[] args) {
    // declaration of variables
    int weight = 130;
    int height = 72;

    double bmi, waterIntake;

    PeopleV3 person = new PeopleV3();

    bmi = person.calcBMI(weight, height);
    waterIntake = person.calcWaterIntake(weight);

    System.out.println();
    System.out.println("Your BMI is " + bmi);
    System.out.println("Your recommended water intake in ounces is " + waterIntake + " oz");
  }// end main method
}// end class
