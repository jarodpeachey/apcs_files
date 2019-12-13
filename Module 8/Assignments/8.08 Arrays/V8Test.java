/**
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class V8Test {
  public static void main(String[] args) {
    // Initiate a new array of PeopleV8 objects
    PeopleV8[] people = new PeopleV8[5];

    // Create 5 new objects
    people[0] = new PeopleV8("Jarod", "Peachey", 135, 72);
    people[1] = new PeopleV8("James", "Smith", 170, 80);
    people[2] = new PeopleV8("Joe", "White", 150, 65);
    people[3] = new PeopleV8("Jamie", "Brown", 125, 55);
    people[4] = new PeopleV8("Jagger", "Jones", 180, 73);

    // Modify attributes using object setters defined in PeopleV8.java
    people[0].setWeight(130);
    people[1].setHeight(76);
    people[2].setFirstName("Joseph");
    people[3].setFirstName("Jayden");
    people[4].setLastName("Jamison");

    // Initiate min and max values
    double minBMI = Double.MAX_VALUE;
    double maxBMI = Double.MIN_VALUE;
    double minWaterIntake = Double.MAX_VALUE;
    double maxWaterIntake = Double.MIN_VALUE;

    // Initiate variables for calculating averages
    int count = 0;
    double totalBMI = 0.0;
    double totalWaterIntake = 0.0;
    double averageBMI = 0.0;
    double averageWaterIntake = 0.0;


    // Loop through array of objects
    for (int i = 0; i < people.length; i++) {
      // Check for lowest and highest BMIs
      if (people[i].getBMI() < minBMI) {
        minBMI = people[i].getBMI();
      } else {
        maxBMI = people[i].getBMI();
      }

      // Check for lowest and highest water intakes
      if (people[i].getWaterIntake() < minWaterIntake) {
        minWaterIntake = people[i].getWaterIntake();
      } else {
        maxWaterIntake = people[i].getWaterIntake();
      }

      // Add values to variables to calculate the average
      totalBMI += people[i].getBMI();
      totalWaterIntake += people[i].getWaterIntake();
      count += 1;
    }

    // Calculate the average
    averageBMI = totalBMI / (double) count;
    averageWaterIntake = totalWaterIntake / (double) count;

    // Print data
    System.out.println();
    System.out.printf("%-20s%-10s%25s\n", "NAME", "BMI", "RECC. WATER INTAKE (oz)");
    for (int i = 0; i < people.length; i++) {
      System.out.printf("%-20s%-10s%25s\n", people[i].getName(true), people[i].getBMI(), people[i].getWaterIntake());
    }

    // Print min, max and averages
    System.out.println();
    System.out.printf("%-20s%-10s%25s\n", "Min:", minBMI, minWaterIntake);
    System.out.printf("%-20s%-10s%25s\n", "Max:", maxBMI, maxWaterIntake);
    System.out.printf("%-20s%-10s%25s\n", "Average:", averageBMI, averageWaterIntake);
  }// end main method
}// end class
