public class Souvenir {
  double costPerItem;
  double budget;
  int itemsThatCanBeBought;
  double fundsRemaining;

  public Souvenir(double newCostPerItem, double newBudget) {
    costPerItem = newCostPerItem;
    budget = newBudget;

    itemsThatCanBeBought = (int)(budget / costPerItem); // how many items can be purchased
    fundsRemaining = budget % costPerItem; // how much of the budget is left
  }
}