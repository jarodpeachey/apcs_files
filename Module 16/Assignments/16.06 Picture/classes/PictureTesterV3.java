/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods that will help you test the
 * PictureV3 class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTesterV3 {
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  public static void testKeepOnlyBlue() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }

  public static void testNegate() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }

  public static void testGrayscale() {
    PictureV3 beach = new PictureV3("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVerticalRightToLeft() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorHorizontal() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontalBottomToTop() {
    PictureV3 caterpillar = new PictureV3("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottomToTop();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    PictureV3 temple = new PictureV3("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test mirrorArms */
  public static void testMirrorArms() {
    PictureV3 snowman = new PictureV3("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }

  /** Method to test mirrorGull */
  public static void testMirrorGull() {
    PictureV3 snowman = new PictureV3("seagull.jpg");
    snowman.explore();
    snowman.mirrorGull();
    snowman.explore();
  }

  /** Method to test mirrorGull */
  public static void testCopy() {
    PictureV3 picture = new PictureV3("seagull.jpg");
    picture.explore();
    picture.copy(picture, 1, 1, 50, 50, 50, 50);
    picture.explore();
  }

  /** Method to test the collage method */
  public static void testCollage() {
    PictureV3 canvas = new PictureV3("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    PictureV3 swan = new PictureV3("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection2() {
    PictureV3 swan = new PictureV3("swan.jpg");
    swan.edgeDetection2(20);
    swan.explore();
  }

  /**
   * Main method for testing. Every class can have a main method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test and
    // comment out the ones you don't want to run

    // Activity 5
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();

    // Activity 5 Challenge - optional
    // testFixUnderwater();

    // Activity 6
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBottomToTop();

    // Activity 6 Challenge - optional
    // testMirrorDiagonal();

    // Activity 7
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();

    // Activity 8
    // testCollage();
    // testCopy();
    // testMyCollage();

    // Activity 9
    // testEdgeDetection();
    testEdgeDetection2();

    // Extra methods
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}
