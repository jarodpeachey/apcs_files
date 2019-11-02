public class Country {
  String name;
  double moneySpentInCountry;
  String currencyName;
  double currencyExchangeRate;

  public Country(String newName, double newMoneySpentInCountry, String newCurrencyName, double newCurrencyExchangeRate) {
    name = newName;
    moneySpentInCountry = newMoneySpentInCountry;
    currencyName = newCurrencyName;
    currencyExchangeRate = newCurrencyExchangeRate;
  }
}