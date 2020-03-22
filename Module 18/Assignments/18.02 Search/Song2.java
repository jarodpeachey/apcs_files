/**
 * This class defines a song based on year, title, and artist
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

public class Song2 {
  // instance variables
  private String year;
  private String title;
  private String artist;

  /**
   * Constructor for objects of class Song2
   */
  public Song2(String year, String title, String artist) {
    // initialize instance variables
    this.year = year;
    this.title = title;
    this.artist = artist;
  }

  public void setYear(String t) {
    year = t;
  }

  public String getYear() {
    return year;
  }

  public void setTitle(String l) {
    title = l;
  }

  public String getTitle() {
    return title;
  }

  public void setArtist(String p) {
    artist = p;
  }

  public String getArtist() {
    return artist;
  }

  public String toString() {
    return String.format("%-10s %-20s %-5s", year, title, artist);
  }
}
