
/**
 * The purpose of this program is to calculate the cost of someone going to the movies
 * 
 * @author Jarod Peachey
 * @version 1.0.0 - 10-01-19
*/

// Import needed packages
import java.util.ArrayList;
import java.util.Scanner;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Grocery {
  // Set variables
  static Boolean addItemBool = false;
  static int numberOfItems = 0;
  static String firstName = "";
  static String lastName = "";
  static Store[] itemsAvailable = new Store[10];
  static GroceryItem[] itemsInUsersCart = new GroceryItem[0];

  // Start scanner
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    itemsAvailable[0] = new Store("Cookies", 3.50, 1);
    itemsAvailable[1] = new Store("Milk", 2.75, 2);
    itemsAvailable[2] = new Store("Butter", 1.89, 3);
    itemsAvailable[3] = new Store("Sugar", 2.25, 4);
    itemsAvailable[4] = new Store("Eggs", 3.25, 5);
    itemsAvailable[5] = new Store("Apples", 1.50, 6);
    itemsAvailable[6] = new Store("Soda", 2.15, 7);
    itemsAvailable[7] = new Store("Ice Cream", 2.69, 8);
    itemsAvailable[8] = new Store("Chips", 3.15, 9);
    itemsAvailable[9] = new Store("Snacks", 1.79, 10);

    System.out.println();
    System.out.println("Welcome to GroceryMart. What is your first and last name?");
    firstName = in.next();
    lastName = in.nextLine();

    addNewItem();
  }

  public static void addNewItem() {
    Boolean itemInStore = false;
    double itemCost = 0.0;
    int itemId = 1;

    System.out.print("What would you like to buy? We have ");
    for (int i=0; i < itemsAvailable.length; i++) {
      if (i < itemsAvailable.length -2) {
        System.out.print(itemsAvailable[i].name + ", ");
      } else if (i < itemsAvailable.length - 1) {
        System.out.print(itemsAvailable[i].name + " & ");
      } else {
        System.out.print(itemsAvailable[i].name + ":  ");
      }
    }
    String item = in.next();
    item += in.nextLine();
    System.out.println();

    for (int j=0; j < itemsAvailable.length; j++) {
      // System.out.println(itemsAvailable[j].name.toString().toLowerCase());
      // System.out.println(item.toLowerCase());

      if (itemsAvailable[j].name.trim().toLowerCase().matches("(.*)" + item.trim().toLowerCase() + "(.*)")) {
        itemInStore = true;

        itemCost = itemsAvailable[j].cost;
        itemId = itemsAvailable[j].id;

        System.out.println(item.trim().toLowerCase());
      }
    }

    if (itemInStore == true) {
      // Get and set how many students took the item
      System.out.print("How many of these would you like to buy? ");
      int numberOfItem = in.nextInt();
      System.out.println();

      GroceryItem newItem = new GroceryItem(item, itemCost, itemId, numberOfItem);

      // Since Java arrays have fixed length, we create an ArrayList
      ArrayList<GroceryItem> temp = new ArrayList<GroceryItem>();

      // Loop through the current items, if any, in the itemsArray and add to the ArrayList
      for(int k=0; k < itemsInUsersCart.length; k++) {
        temp.add(itemsInUsersCart[k]);
      }

      // Add the new item to the array
      temp.add(newItem);

      // Set the ArrayList back to an array
      itemsInUsersCart = temp.toArray(new GroceryItem[itemsInUsersCart.length]);
      
      // Ask if the user wants to add another item
      System.out.println("Would you like to add another item? (Y/N) ");
      String answer = in.next().trim().toLowerCase();
      if (answer.equals("y")) {
        addItemBool = true;
      } else if (answer.equals("n")) {
        addItemBool = false;
      } else {
        System.out.println("Please answer Y/N");
      }

      // Call the function to check whether or not to add a new item
      checkItemBool();      
    } else {
      System.out.print("No item");
    }
  }

  public static void checkItemBool() {
    if (addItemBool) {
      // Add a new item
      addNewItem();
    } else {
      System.out.println("Welcome to checkout. Please enter your debit card number (#####-###-####): ");
      String debitNumber = in.next();

      System.out.println("Enter your PIN (####): ");
      String pinNumber = in.next();

      String orderNum = pinNumber.substring(0, 3) + firstName.substring(0, 1) + lastName.substring(0, 1) + pinNumber.substring(1, 3);
      LocalDate date = LocalDate.now();
      String displayName = firstName.substring(0, 1) + "." + lastName;
      double totalCost = 0.0;
      String formattedCardNumber = debitNumber.replaceAll("[^-](?![^-]*$)", "#");

      System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
      System.out.println("");
      System.out.println("GroceryMart Receipt");
      System.out.println(date);
      System.out.println("Order #: " + orderNum);
      System.out.println("");

      System.out.println("Name: " + displayName);
      System.out.println("Card #: " + formattedCardNumber);
      System.out.println("");
      System.out.println("Items:");
      System.out.println("");
      // Loop through each item
      for (int j = 0; j < itemsInUsersCart.length; j++) {
        DecimalFormat df = new DecimalFormat("#.00");
        String name = itemsInUsersCart[j].name;
        String costPerItem = df.format(itemsInUsersCart[j].cost);
        int quantity = itemsInUsersCart[j].quantity;
        String cost = df.format(quantity * itemsInUsersCart[j].cost);
        totalCost += itemsInUsersCart[j].cost * itemsInUsersCart[j].quantity;

        System.out.println("  Item: " + name);
        System.out.println("  Cost per Item: ---------------------- $" + costPerItem);
        // System.out.println("                                         x");
        System.out.println("  Total Items Bought: ----------------- " + quantity);
        System.out.println("  Total: ------------------------------ $" + cost);
        System.out.println("");
      }

      System.out.print("The total cost is $" + totalCost);
    }
  }
} // end of class

