/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the PictureV3 class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class PictureV3 extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

  /**
   * Constructor that takes no arguments
   */
  public PictureV3() {
    /*
     * not needed but use it to show students the implicit call to super() child
     * constructors always call a parent constructor
     */
    super();
  }

  /**
   * Constructor that takes a file name and creates the picture
   * 
   * @param fileName the name of the file to create the picture from
   */
  public PictureV3(String fileName) {
    // let the parent class handle this fileName
    super(fileName);
  }

  /**
   * Constructor that takes the width and height
   * 
   * @param height the height of the desired picture
   * @param width  the width of the desired picture
   */
  public PictureV3(int height, int width) {
    // let the parent class handle this width and height
    super(width, height);
  }

  /**
   * Constructor that takes a picture and creates a copy of that picture
   * 
   * @param copyPicture the picture to copy
   */
  public PictureV3(PictureV3 copyPicture) {
    // let the parent class do the copy
    super(copyPicture);
  }

  /**
   * Constructor that takes a buffered image
   * 
   * @param image the buffered image to use
   */
  public PictureV3(BufferedImage image) {
    super(image);
  }

  ////////////////////// methods ///////////////////////////////////////

  /**
   * Method to return a string with information about this picture.
   * 
   * @return a string with information about the picture such as fileName, height
   *         and width.
   */
  public String toString() {
    String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
    return output;

  }

  /////////////////////////// Activity 5 ////////////////////////////
  /** Method to set the blue to 0 */
  public void zeroBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setBlue(0);
      }
    }
  }

  public void keepOnlyBlue() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
  }

  public void grayscale() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        double average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
        pixelObj.setRed((int) average);
        pixelObj.setGreen((int) average);
        pixelObj.setBlue((int) average);
      }
    }
  }

  public void invert() {
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length; col++) {
        int red = 255 - pixels[row][col].getRed();
        int green = 255 - pixels[row][col].getGreen();
        int blue = 255 - pixels[row][col].getBlue();

        Color newColor = new Color(red, green, blue);

        pixels[row][col].setColor(newColor);
      }
    }
  }

  public void negate() {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels) {
      for (Pixel pixelObj : rowArray) {
        pixelObj.setRed(255 - pixelObj.getRed());
        pixelObj.setGreen(255 - pixelObj.getGreen());
        pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }

  // keepOnlyBlue
  // keepOnlyRed
  // keepOnlyGreen
  // nagate
  // grayscale
  // fixUnderWater - optional

  /////////////////////////// Activity 6 ////////////////////////////
  /**
   * Method that mirrors the picture around a vertical mirror in the center of the
   * picture from left to right
   */
  public void mirrorVertical() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  public void mirrorVerticalRightToLeft() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }

  public void mirrorHorizontal() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    for (int col = 0; col < width; col++) {
      for (int row = 0; row < height / 2; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }

  public void mirrorHorizontalBottomToTop() {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int width = pixels[0].length;
    int height = pixels.length;
    for (int col = 0; col < width; col++) {
      for (int row = 0; row < height / 2; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
        topPixel.setColor(bottomPixel.getColor());
      }
    }
  }

  // mirrorVerticalRightToLeft
  // mirrorHorizontal
  // mirrorHorizontalBotToTop

  /////////////////////////// Activity 7 ////////////////////////////
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple() {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();

    // loop through the rows
    for (int row = 27; row < 97; row++) {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++) {

        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }

    System.out.println(count);
  }

  /** Mirrors the arms of the snowman */
  public void mirrorArms() {
    int leftMirrorPoint = 193;
    Pixel topPixelLeft = null;
    Pixel bottomPixelLeft = null;
    Pixel[][] pixels = this.getPixels2D();

    for (int row = 160; row < leftMirrorPoint; row++) {
      for (int col = 100; col < 170; col++) {
        topPixelLeft = pixels[row][col];
        bottomPixelLeft = pixels[leftMirrorPoint - row + leftMirrorPoint][col];
        bottomPixelLeft.setColor(topPixelLeft.getColor());
      }
    }

    int rightMirrorPoint = 195;
    Pixel topPixelRight = null;
    Pixel bottomPixelRight = null;

    for (int row = 170; row < rightMirrorPoint; row++) {
      for (int col = 237; col < 295; col++) {
        topPixelRight = pixels[row][col];
        bottomPixelRight = pixels[rightMirrorPoint - row + rightMirrorPoint][col];
        bottomPixelRight.setColor(topPixelRight.getColor());
      }
    }
  }

  /** Mirrors seagull */
  public void mirrorGull() {
    int mirrorPoint = 321;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    // Left arm
    // for (int row = 232; row < leftMirrorPoint; row++) {
    // // loop from 13 to just before the mirror point
    // for (int col = 237; col < 346; col++) {
    // topPixelLeft = pixels[row][col];
    // bottomPixelLeft = pixels[leftMirrorPoint - row + leftMirrorPoint][col];
    // bottomPixelLeft.setColor(topPixelLeft.getColor());
    // }
    // }
    for (int row = 232; row < mirrorPoint; row++) {
      for (int col = 346; col > 233; col--) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][233 - col + 233];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }

  // mirrorArms
  // mirrorGull

  /////////////////////////// Activity 8 ////////////////////////////
  /**
   * copy from the passed fromPic to the specified startRow and startCol in the
   * current picture
   * 
   * @param fromPic  the picture to copy from
   * @param startRow the start row to copy to
   * @param startCol the start col to copy to
   */
  public void copy(PictureV3 fromPic, int startRow, int startCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
        && toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
          && toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /**
   * copy from the passed fromPic to the specified startRow and startCol in the
   * current picture
   * 
   * @param fromPic      the picture to copy from
   * @param fromStartRow the row to start coping from in the from picture
   * @param fromStartCol the column to start copying from in the from picture
   * @param fromEndRow   the row to stop before in the from picture
   * @param fromEndCol   the column to stop before in the from picture
   * @param toStartRow   the row to start copying to
   * @param toStartCol   the column to start copying to
   */
  public void copy(PictureV3 fromPic, int fromStartRow, int fromStartCol, int fromEndRow, int fromEndCol, int toStartRow,
      int toStartCol) {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = toStartRow; fromRow < fromPixels.length
        && toRow < toPixels.length; fromRow++, toRow++) {
      for (int fromCol = 0, toCol = toStartCol; fromCol < fromPixels[0].length
          && toCol < toPixels[0].length; fromCol++, toCol++) {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
  }

  /** Method to create a collage of several pictures */
  public void createCollage() {
    PictureV3 snowman1 = new PictureV3("snowman.jpg");
    PictureV3 snowman2 = new PictureV3("snowman.jpg");
    this.copy(snowman1, 0, 0, 100, 100, 50, 300);
    int mirrorPoint = 98;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    for (int row = 0; row < 98; row++) {
      for (int col = 0; col < 88; col++) {
        rightPixel = pixels[row][col];
        leftPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
    PictureV3 snowmanNoBlue = new PictureV3(snowman2);
    snowmanNoBlue.zeroBlue();
    this.copy(snowmanNoBlue, 200, 150, 300, 250, 0, 0);

    PictureV3 snowmanInverse = new PictureV3(snowman2);
    snowmanInverse.invert();
    this.copy(snowmanInverse, 200, 300, 100, 200, 250, 15);
    // this.copy(snowmanNoBlue,300,0);
    // this.copy(snowman1,400,0);
    // this.copy(snowman2,500,0);
    // this.mirrorVertical();

    this.write("collage.jpg");
  }

  // myCollage

  /////////////////////////// Activity 9 ////////////////////////////
  /**
   * Method to show large changes in color
   * 
   * @param edgeDist the distance for finding edges
   */
  public void edgeDetection(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length - 1; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col + 1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }

  // edgeDetection2
  public void edgeDetection2(int edgeDist) {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int col = 0; col < pixels[0].length - 1; col++) {
      for (int row = 0; row < pixels.length - 1; row++) {
        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        bottomColor = bottomPixel.getColor();

        if (topPixel.colorDistance(bottomColor) > edgeDist)
        topPixel.setColor(Color.BLACK);
        else
        topPixel.setColor(Color.WHITE);
      }
    }
    for (int row = 0; row < pixels.length - 1; row++) {
      for (int col = 0; col < pixels[0].length - 1; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col + 1];
        rightColor = rightPixel.getColor();

        topPixel = pixels[row][col];
        bottomPixel = pixels[row + 1][col];
        bottomColor = bottomPixel.getColor();

        if (leftPixel.colorDistance(rightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);

        if (topPixel.colorDistance(bottomColor) > edgeDist)
        topPixel.setColor(Color.BLACK);
        else
        topPixel.setColor(Color.WHITE);
      }
    }
  }
} // this } is the end of class PictureV3, put all new methods before this
