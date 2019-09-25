/**
 * The Currency class converts an amount of money from a specific country into
 * the equivalent currency of another country given the current exchange rate.
 *
 * @author Charles Babbage (replace with your name)
 * @version 06/02/17 (replace with today's date)
 */

public class Currency {
  public static void main(String[] args) {
    // Declare and initialize the amount of US money you have to spend
    double startingUsDollars = 6500.00; // starting US Dollars
    double remainingUsDollars = 6500.00; // remaining US Dollars

    // Declare the array of objects based upon the Country class
    Country[] countriesArray = new Country[4];

    // Declare each country I go to using this format: Country(name,
    // moneySpentInCountry, currentName, currencyExchangeRate)
    countriesArray[0] = new Country("Greece", 450.00, "Euros", 1.1645);
    countriesArray[1] = new Country("Japan", 120000.00, "Yen", 0.00973);
    countriesArray[2] = new Country("France", 1025.56, "Euros", 1.1645);
    countriesArray[3] = new Country("Mexico", 7210.25, "Pesos", 0.0545);

    // Message to user stating purpose
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("This program converts an amount of money");
    System.out.println("from a specific country into the equivalent");
    System.out.println("currency of another country given the current");
    System.out.println("exchange rate.");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();
    System.out.println("Starting US Dollars: " + startingUsDollars);
    System.out.println();

    // Print out each country data
    for (int i = 0; i < countriesArray.length; i++) {
      // Add formatting so output looks nicer
      String spacing = "                           ";
      if (countriesArray[i].name == "Japan") {
        spacing = "                             ";
      }

      // Print out data about country
      System.out.println(countriesArray[i].name + ":");
      System.out
          .println("  " + countriesArray[i].currencyName + " spent:" + spacing + countriesArray[i].moneySpentInCountry);
      System.out.println("  US Dollars Equivalent:                 "
          + countriesArray[i].moneySpentInCountry * countriesArray[i].currencyExchangeRate);
      System.out.println("  US Dollars Remaining:                  "
          + (remainingUsDollars - (countriesArray[i].moneySpentInCountry * countriesArray[i].currencyExchangeRate)));

      // Update value of us dollars before calling next country
      remainingUsDollars = remainingUsDollars
          - (countriesArray[i].moneySpentInCountry * countriesArray[i].currencyExchangeRate);

      // Print an empty line
      System.out.println();
    }

    System.out.println("=====================================================");
    System.out.println("Remaining US Dollars:                    " + remainingUsDollars);
    System.out.println();

    // Print message heading about souvenirs
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Souvenir Purchases (all values in US Dollars)");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println();

    // Declare the array of objects based upon the Country class
    Souvenir[] souvenirsArray = new Souvenir[3];

    // Declare each souvenir I buy using this format: Souvenir(costPerItem, budget)
    souvenirsArray[0] = new Souvenir(12, 100);
    souvenirsArray[1] = new Souvenir(15.65, 300);
    souvenirsArray[2] = new Souvenir(8.50, 75);

    for (int i = 0; i < souvenirsArray.length; i++) {
      System.out.println("Item " + (i + 1));
      System.out.println(" Cost per item: $" + souvenirsArray[i].costPerItem);
      System.out.println(" Budget: $" + souvenirsArray[i].budget);
      System.out.println(" Total items that can be bought: " + souvenirsArray[i].itemsThatCanBeBought);
      System.out.println(" Funds remaining: $" + souvenirsArray[i].fundsRemaining);
      System.out.println();
    }
  } // end of main method
} // end of class