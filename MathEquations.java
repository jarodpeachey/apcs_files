import java.text.DecimalFormat;

public class MathEquations {
  public static void main(String[] args) {
    Meal meal = new Meal(32.50);
    // double tip = meal.calculateTip();
    double tip = meal.calculateTip(50.0);

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("Your tip is $" + df.format(tip));
  }
}
/*
 * 
 * javac MathEquations.java java MathEquations
 */
