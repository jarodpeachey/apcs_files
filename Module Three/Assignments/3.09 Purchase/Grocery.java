
/**
 * The purpose of this program is to calculate the cost of someone going to the movies
 * 
 * @author Jarod Peachey
 * @version 1.0.0 - 10-01-19
*/

// Import needed packages
import java.util.ArrayList;
import java.util.Scanner;

public class Grocery {
  // Set variables
  static Boolean addItemBool = false;
  static int numberOfItems = 0;
  static GroceryItem[] itemsAvailable = new GroceryItem[10];
  static GroceryItem[] itemsInUsersCart = new GroceryItem[1];

  // Start scanner
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    itemsAvailable[0] = new GroceryItem("Cookies", 3.50, 1);
    itemsAvailable[1] = new GroceryItem("Milk", 2.75, 2);
    itemsAvailable[2] = new GroceryItem("Butter", 1.89, 3);
    itemsAvailable[3] = new GroceryItem("Sugar", 2.25, 4);
    itemsAvailable[4] = new GroceryItem("Eggs", 3.25, 5);
    itemsAvailable[5] = new GroceryItem("Apples", 1.50, 6);
    itemsAvailable[6] = new GroceryItem("Soda", 2.15, 7);
    itemsAvailable[7] = new GroceryItem("Ice Cream", 2.69, 8);
    itemsAvailable[8] = new GroceryItem("Chips", 3.15, 9);
    itemsAvailable[9] = new GroceryItem("Snacks", 1.79, 10);

    System.out.println();
    System.out.println("Welcome to GroceryMart. Press enter to begin shopping.");
    String readString = in.nextLine();

    if (readString.isEmpty()) {
      // Call add new item function
      addNewItem();       
    }
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
    System.out.println();

    for (int j=0; j < itemsAvailable.length; j++) {
      // System.out.println(itemsAvailable[j].name.toString().toLowerCase());
      // System.out.println(item.toLowerCase());

      if (itemsAvailable[j].name.trim().toLowerCase().matches("(.*)" + item + "(.*)")) {
        itemInStore = true;

        itemCost = itemsAvailable[j].cost;
        itemId = itemsAvailable[j].id;        
      }
    }

    if (itemInStore == true) {
      // Get and set how many students took the item
      System.out.print("How many of these would you like to buy? ");
      int numberOfItem = in.nextInt();
      System.out.println();

      GroceryItem newItem = new GroceryItem(item, itemCost, itemId);

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
    System.out.print("Complete!!");
    //   // Print the results!!
    //   int totalStudentsThroughAllItems = 0;
    //   double totalAverageThroughAllItems = 0.0;

    //   // Loop through each item
    //   for (int j = 0; j < itemsArray.length; j++) {
    //     numItems++; // Increment the number of items

    //     // Print item data
    //     System.out.println();
    //     System.out.println("Item #" + numItems);
    //     System.out.println("  - Subject: " + itemsArray[j].subject);
    //     System.out.println("  - Total Students: " + itemsArray[j].totalStudents);
    //     System.out.println("  - Item scores:");

    //     // Loop through the students that took the item and print data
    //     for (int k=0; k < itemsArray[j].studentsArray.length; k++) {
    //       totalStudentsThroughAllItems++;
    //       System.out.println("      Student #" + itemsArray[j].studentsArray[k].id);
    //       System.out.println("        - Name: " + itemsArray[j].studentsArray[k].name);
    //       System.out.println("        - Score: " + itemsArray[j].studentsArray[k].grade);
    //     }

    //     // Calculate the average score for this item
    //     System.out.println("  - Average score: " + itemsArray[j].average);
    //     System.out.println();

    //     // Add average score for the item to the total average score
    //     totalAverageThroughAllItems += itemsArray[j].average;
    //   }

    //   // Calculate the average through all the items
    //   double averageFromAllItems = totalAverageThroughAllItems / numItems;

    //   // After finished looping through items, calculate the average score item-wide
    //   System.out.println("The average score for all " + numItems + " items (from " + totalStudentsThroughAllItems + " students) is " + averageFromAllItems);
    }
  }
} // end of class

