public class CircleStats {
  public CircleStats() {
  }

  // …code goes here — use the Math constant for pi rather than 3.14
  public static double calcCircleCircumf(int diameter) {
    return 2 * Math.PI * (diameter / 2);
  }

  public static double calcCircleCircumf(double radius) {
    return 2 * Math.PI * radius;
  }
}
