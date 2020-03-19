
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.ArrayList;
import java.text.DecimalFormat;

public class StoreItem {
  private String name;
  private double price;
  private int id;
  private int quantity;

  public StoreItem(String name, double price, int id, int quantity) {
    this.name = name;
    this.price = price;
    this.id = id;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getPrice() {
    return price;
  }

  public void printItem() {
    DecimalFormat df = new DecimalFormat("0.##");

    System.out.printf("%-16s| %6s  | %5s  |  %3s    |\n", name, "$" + df.format(price), df.format(id),
        df.format(quantity));
  }
}
