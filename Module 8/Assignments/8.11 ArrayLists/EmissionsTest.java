
/**
 * @purpose:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.ArrayList;
import java.text.DecimalFormat;

public class EmissionsTest {
  public static void main(String[] args) {
    ArrayList<Emissions> households = new ArrayList<Emissions>();
    households.add(new Emissions(5, false, true, false, false));
    households.add(new Emissions(2, false, true, false, false));
    households.add(new Emissions(6, false, false, true, false));
    households.add(new Emissions(1, true, false, false, true));
    households.add(new Emissions(3, false, true, false, false));
    households.add(new Emissions(4, true, false, true, false));

    for (Emissions dataRecord : households) {
      dataRecord.calcGrossWasteEmission();
      dataRecord.calcWasteReduction();
      dataRecord.calcNetWasteReduction();
    }

    System.out.println();
    System.out.println();
    System.out.println("         INFO                HOUSEHOLD WASTE RECYCLED                           POUNDS OF CO2                   ");
    System.out.println("+--------------------+---------------------------------------+----------------------------------------------+");
    System.out.printf("|  %-5s%10s   |%7s%11s%9s%9s   |%16s%13s%15s  |\n", "Index", "People", "Paper", "Plastic", "Glass", "Cans", "Total Emission", "Reduction", "Net Emission");
    System.out.println("+--------------------+---------------------------------------+----------------------------------------------+");


    DecimalFormat df = new DecimalFormat("#.00");

    for (int i = 0; i < households.size(); i++) {
      System.out.printf("|  %3s%9s      |%7s%11s%9s%9s   |%16s%13s%15s  |\n", Integer.toString(i), Integer.toString(households.get(i).getNumPeople()), households.get(i).getPaper(), households.get(i).getPlastic(), households.get(i).getGlass(), households.get(i).getCans(), df.format(households.get(i).getEmissions()), df.format(households.get(i).getReduction()), df.format(households.get(i).getNetEmissions()));
    }
    System.out.println("+--------------------+---------------------------------------+----------------------------------------------+");
  }
}
