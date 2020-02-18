
/**
 * This class tests the Circle class hierarchy.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class TerrainTest {
  public static void main(String[] args) {
    Terrain terrain = new Terrain(120, 400);
    Forest forest = new Forest(500, 500, 450);
    RainForest rainForest = new RainForest(500, 500, 450, 12.5);
    Mountain mountains = new Mountain(350, 657, 6);
    WinterMountain winterMountains = new WinterMountain(350, 657, 6, 32.0, 13.5);
    Beach beach = new Beach(500, 500, "Sunny");

    // Terrain
    System.out.println();
    System.out.println("TERRAIN");
    System.out.println("Dimensions are " + terrain.getWidth() + " and " + terrain.getLength());
    System.out.println();

    // Forest
    System.out.println("FOREST");
    System.out.println("Dimensions are " + forest.getWidth() + " and " + forest.getLength() + ". Forest has "
        + forest.getNumberOfTrees() + " trees.");
    System.out.println();

    // Rain Forest
    System.out.println("RAIN FOREST");
    System.out
        .println("Dimensions are " + rainForest.getWidth() + " and " + rainForest.getLength() + ". Rain Forest has "
            + rainForest.getNumberOfTrees() + " trees. It rains " + rainForest.getRain() + " inches a month.");
    System.out.println();

    // Mountain
    System.out.println("MOUNTAINS");
    System.out.println("Dimensions are " + mountains.getWidth() + " and " + mountains.getLength()
        + ". The mountain range has " + mountains.getNumberOfMountains() + " mountains.");
    System.out.println();

    // Snowy Mountains
    System.out.println("SNOWY MOUNTAINS");
    System.out.println("Dimensions are " + winterMountains.getWidth() + " and " + winterMountains.getLength()
        + ". The mountain range has " + winterMountains.getNumberOfMountains() + " mountains. The temp is "
        + winterMountains.getTemp() + " degrees, and it snows " + winterMountains.getSnow() + " inches a month.");
    System.out.println();

    // Snowy Mountains
    System.out.println("BEACH");
    System.out.println("Dimensions are " + beach.getWidth() + " and " + beach.getLength()
        + ". The weather at the beach is currently " + beach.getWeather());
    System.out.println();
  }
}
