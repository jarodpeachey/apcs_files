/**
 * Purpose: To return calculations of how far an item might be shot from a catapult,
 * based on trajectory angle and launch speed.
 *
 * @author Jarod Peachey
 * @version 1.0.0
 *
 */

import java.util.ArrayList;

public class CatapultLaunch {
  private double speed;
  private double speedInMPH;
  private ArrayList<Double> distances = new ArrayList<Double>();
  private ArrayList<Double> distancesInFeet = new ArrayList<Double>();

  CatapultLaunch(double newSpeed) {
    speed = newSpeed / 3.28;
    speedInMPH = newSpeed;
  }

  private double calculateDistance(double speed, double angle) {
    double radians = Math.toRadians(angle);
    double calculatedDistance = (Math.pow(speed, 2) * Math.sin(2 * radians)) / 9.8;

    return calculatedDistance;
  }

  public void newAngle(double newAngle) {
    double newDistance = calculateDistance(speed, newAngle);

    distances.add(newDistance);
    distancesInFeet.add(newDistance * 3.28);
  }

  public ArrayList<Double> getDistances() {
    return distances;
  }

  public ArrayList<Double> getDistancesInFeet() {
    return distancesInFeet;
  }

  public double getSpeed() {
    return speed;
  }

  public double getSpeedInMPH() {
    return speedInMPH;
  }
}
