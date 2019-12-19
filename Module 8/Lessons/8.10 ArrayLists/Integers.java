
/**
 * This class adds randomly selected integers to an ArrayList
 * and then prints the list.
 *
 * @author Alan Kay
 * @version 06/08/17
 */
import java.util.ArrayList;

public class Integers {
    public static void main(String[] args) {
        ArrayList<Double> array = new ArrayList<Double>(3);
        array.add(3.5);
        array.add(4.3);
        array.set(1, 12.3);
        array.add(1, 18.9);
        array.remove(2);
        array.set(0, -20.3);
        array.add(24.8);


        System.out.println(array.size());
    }
}
