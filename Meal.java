public class Meal {
  // private String str1 = "";
  // private String str2 = "";
  // private String str3 = "";

  private double tipPercentage = 17.5;
  private double mealCost = 0.0;

  Meal(double mealCost) {
    this.mealCost = mealCost;
  }

  public Double calculateTip(double tipPercentage) {
    return mealCost * (tipPercentage / 100);
  }

  public Double calculateTip() {
    return mealCost * (tipPercentage / 100);
  }
}
