/**
 * @purpose
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
public class Emissions5 {
  private int people;
  private boolean paper, plastic, glass, cans;
  private double emissions, reduction, netEmissions;

  /**
   * Constructor for objects of type Emissions
   * 
   * @param people number of people in a household
   * @param paper     whether or not paper is recycled
   * @param plastic   whether or not plastic is recycled
   * @param glass     whether or not glass is recycled
   * @param cans      whether or not cans are recycled
   */
  Emissions5(int people, boolean paper, boolean plastic, boolean glass, boolean cans) {
    this.people = people;
    this.paper = paper;
    this.plastic = plastic;
    this.glass = glass;
    this.cans = cans;
  }

  /**
   * Mutator method to calculate the total emissions, without any recycling (no
   * parameters)
   */
  public void calcGrossWasteEmission() {
    double grossEmissions = 1018 * this.people;

    this.emissions = grossEmissions;
  }

  /**
   * Mutator method to calculate the emission reduction from recycling (no
   * parameters)
   */
  public void calcWasteReduction() {
    double totalReduction = 0.0;
    if (this.paper) {
      totalReduction += (184.0 * this.people);
    } else if (this.plastic) {
      totalReduction += (25.6 * this.people);
    } else if (this.glass) {
      totalReduction += (46.6 * this.people);
    } else if (this.cans) {
      totalReduction += (165.8 * this.people);
    }

    this.reduction = totalReduction;
  }

  /**
   * Mutator method to calculate the net emissions (no parameters)
   */
  public void calcNetWasteReduction() {
    double netEmissions = this.emissions - this.reduction;

    this.netEmissions = netEmissions;
  }

  /**
   * Getter method to return the number of people (no parameters)
   */
  public int getNumPeople() {
    return this.people;
  }

  /**
   * Getter method to return paper's recycled status (true or false) (no
   * parameters)
   */
  public boolean getPaper() {
    return this.paper;
  }

  /**
   * Getter method to return glass's recycled status (true or false) (no
   * parameters)
   */
  public boolean getGlass() {
    return this.glass;
  }

  /**
   * Getter method to return plastic's recycled status (true or false) (no
   * parameters)
   */
  public boolean getPlastic() {
    return this.plastic;
  }

  /**
   * Getter method to return cans' recycled status (true or false) (no parameters)
   */
  public boolean getCans() {
    return this.cans;
  }

  /**
   * Getter method to return the total emissions (no parameters)
   */
  public double getEmissions() {
    return this.emissions;
  }

  /**
   * Getter method to return the reduction amount (no parameters)
   */
  public double getReduction() {
    return this.reduction;
  }

  /**
   * Getter method to return the net emissions (no parameters)
   */
  public double getNetEmissions() {
    return this.netEmissions;
  }
}
