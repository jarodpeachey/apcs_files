
/**
 * @purpose:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.ArrayList;
import java.text.DecimalFormat;

public class EmissionsTestV2 {
  public static void main(String[] args) {
    ArrayList<EmissionsV2> households = new ArrayList<EmissionsV2>();
    households.add(new EmissionsV2(5, false, true, false, false));
    households.add(new EmissionsV2(2, false, true, false, false));
    households.add(new EmissionsV2(6, false, false, true, false));
    households.add(new EmissionsV2(1, true, false, false, true));
    households.add(new EmissionsV2(3, false, true, false, false));
    households.add(new EmissionsV2(4, true, false, true, false));

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
