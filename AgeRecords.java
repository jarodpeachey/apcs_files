public class AgeRecords {
  private int[][] individualAges = {
    {12, 45, 23, 65, 32, 56},
    {43, 23, 65, 13, 12, 65}
  };
  private String[][] ageCategory = {
    {"C", "A", "Y", "S", "A", "S"},
    {"A", "Y", "S", "T", "C", "S"}
  };

  
  /** 
   * @param category
   * @return double
   */
  public double categoryAverage(String category) {
    double average = 0.0;
    double total = 0.0;
    int count = 0;

    for (int i = 0; i < ageCategory[0].length; i++) {
      if (ageCategory[0][i] == category) {
        total += individualAges[0][i];
        count++;
      } else if (ageCategory[1][i] == category) {
        total += individualAges[1][i];
        count++;        
      } else {
        return -1;
      }
    }

    average = total / count;

    return average;
  }
}
