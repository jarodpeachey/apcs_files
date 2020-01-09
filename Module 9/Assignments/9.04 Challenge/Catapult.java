
/**
 * Purpose: To return calculations of how far an item might be shot from a catapult,
 * based on trajectory angle and launch speed.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 *
 */

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Catapult {
  public static void main(String[] args) {
    double[] speeds = { 10.0, 20.0, 30.0, 40.0, 50.0, 90.0 };
    double[] angles = { 5.0, 10.0, 15.0, 20.0, 25.0, 30.0 };

    ArrayList<CatapultLaunch> catapultLaunches = new ArrayList<CatapultLaunch>();

    for (int i = 0; i < speeds.length; i++) {
      catapultLaunches.add(new CatapultLaunch(speeds[i]));
      CatapultLaunch catapultLaunch = catapultLaunches.get(i);
      for (double angle : angles) {
        catapultLaunch.newAngle(angle);
      }
    }

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println();
    System.out.println();
    System.out.println("        CALCULATED DISTANCES OF A CATAPULT (based on angle and speed)        ");
    System.out.println("=============================================================================");
    System.out.println();
    System.out.println("|--Speed--|---------------------------- Angles -----------------------------|");
    System.out.println("+---------+----------+----------+----------+----------+----------+----------+");
    System.out.printf("|  %-5s  |%8s  |%8s  |%8s  |%8s  |%8s  |%8s  |\n", "", df.format(angles[0]),
        df.format(angles[1]), df.format(angles[2]), df.format(angles[3]), df.format(angles[4]), df.format(angles[5]));
    System.out.println("+---------+----------+----------+----------+----------+----------+----------+");

    for (int i = 0; i < catapultLaunches.size(); i++) {
      System.out.printf("|  %-5s  |%8s  |%8s  |%8s  |%8s  |%8s  |%8s  |\n",
          df.format(catapultLaunches.get(i).getSpeedInMPH()),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(0)),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(1)),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(2)),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(3)),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(4)),
          df.format(catapultLaunches.get(i).getDistancesInFeet().get(5)));
    }
    System.out.println("+---------+----------+----------+----------+----------+----------+----------+");
  }
}
