
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class StoreTest {
  public static ArrayList<StoreItem> items = new ArrayList<StoreItem>();

  public static void main(String[] args) {
    items.add(new StoreItem("Toy Gun", 12.50, 2352, 6));
    items.add(new StoreItem("Toy Car", 5.99, 8912, 4));
    items.add(new StoreItem("Toy Doll", 7.58, 1264, 1));
    items.add(new StoreItem("Bouncy Ball", 12.99, 1267, 8));
    items.add(new StoreItem("Puzzle", 12.50, 2357, 10));
    items.add(new StoreItem("Notebook", 3.27, 8125, 15));
    items.add(new StoreItem("Pencil", .99, 6328, 3));
    items.add(new StoreItem("Stencil", 1.74, 7895, 4));
    items.add(new StoreItem("Costume", 11.59, 2348, 1));
    items.add(new StoreItem("Apple", 2.10, 1785, 13));

    printAllData();

    // USE THESE TO TEST
    sortById(0, items.size() - 1);
    // sortByPrice();
    // sortByName();

    printAllData();
  }

  /*
   * PRINT METHODS FOR CANDIDATES
   ********************************/

  public static void printAllData() {
    System.out.println();
    System.out.println("Store Items:");
    System.out.println();
    printStoreItems();
    System.out.println();
  }

  // public static void printStudents() {
  // for (int i = 0; i < items.size(); i++) {
  // System.out.println(items.get(i).toString());
  // }
  // }

  public static void printStoreItems() {
    DecimalFormat df = new DecimalFormat("0.##");

    System.out.printf("%-16s|  %3s  |  %3s   | %6s\n", "Product", "Price", "ID", "Quantity");
    System.out.println("----------------+---------+--------+---------+");
    for (int i = 0; i < items.size(); i++) {
      items.get(i).printItem();
      System.out.println("----------------+---------+--------+---------+");
    }
  }

  public static void sortById(int low, int high) {
    if (low == high)
      return;

    int mid = (low + high) / 2;

    sortById(low, mid); // recursive call
    sortById(mid + 1, high); // recursive call

    merge(low, mid, high);
  }

  public static void merge(int low, int mid, int high) {
    StoreItem[] temp = new StoreItem[high - low + 1];

    int i = low, j = mid + 1, n = 0;

    while (i <= mid || j <= high) {
      if (i > mid) {
        temp[n] = items.get(j);
        j++;
      } else if (j > high) {
        temp[n] = items.get(i);
        i++;
      } else if (items.get(i).getPrice() < items.get(j).getPrice()) {
        temp[n] = items.get(i);
        i++;
      } else {
        temp[n] = items.get(j);
        j++;
      }
      n++;
    }

    for (int k = low; k <= high; k++)
      items.set(k, temp[k - low]);
  } // end of merge

  public static void sortByPrice() {
    System.out.println("<< Items sorted by price using the Selection Sorting algorithm >>");
    int i;
    int k;
    int posMax;
    StoreItem temp;

    for (i = items.size() - 1; i >= 0; i--) {
      // find largest element in the i elements
      posMax = 0;
      for (k = 0; k <= i; k++) {
        if (items.get(k).getPrice() > items.get(posMax).getPrice())
          posMax = k;
      }

      temp = items.get(i);
      items.set(i, items.get(posMax));
      items.set(posMax, temp);
    }
  }

  public static void sortByName() {
    System.out.println("<< Items sorted by name using the Insertion Sorting algorithm >>");
    StoreItem temp;
    for (int i = 0; i < items.size(); i++) {
      for (int j = i + 1; j < items.size(); j++) {
        if (items.get(i).getName().compareToIgnoreCase(items.get(j).getName()) > 0) {
          temp = items.get(i);
          items.set(i, items.get(j));
          items.set(j, temp);
        }
      }
    }
  }

}
