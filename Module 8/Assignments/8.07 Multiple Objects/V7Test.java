/**
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class V7Test {
  public static void main(String[] args) {
    PeopleV7[] people = new PeopleV7[3];

    people[0] = new PeopleV7("Jarod", "Peachey", 135, 72);
    people[1] = new PeopleV7("James", "Smith", 170, 80);
    people[2] = new PeopleV7("Joe", "White", 150, 65);

    System.out.println();
    System.out.printf("%-20s%-10s%25s\n", "NAME", "BMI", "RECC. WATER INTAKE (oz)");
    for (int i = 0; i < people.length; i++) {
      System.out.printf("%-20s%-10s%25s\n", people[i].getName(true), people[i].getBMI(), people[i].getWaterIntake());
    }
  }// end main method
}// end class
