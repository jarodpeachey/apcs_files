/**
 * This program calculates carbon footprint
 * 
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class FootprintTestV1 {

  /**
   * @param args
   */
  public static void main(String[] args) {
    double gallonsOfGas = 2410;

    FootprintV1 footprint = new FootprintV1(gallonsOfGas);
    footprint.calcTonsCO2();
    footprint.convertTonsToPounds();

    System.out.println("           CO2 Emissions");
    System.out.println("  Gallons   Pounds      Tons");
    System.out.println("  of Gas   from Gas   from Gas");
    System.out.println("  ****************************");
    System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(), footprint.getPoundsCO2(),
        footprint.getTonsCO2());

    System.out.println();
  }
}
