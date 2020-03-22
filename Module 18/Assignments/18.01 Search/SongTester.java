
/**
 * This class browses through an album of songs and allows you to search by year, title and artist
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.util.ArrayList;

public class SongTester {
  private static ArrayList<Song> album = new ArrayList<Song>();

  public static void main(String[] args) {
    album.add(new Song("2011", "The Road Home", "Mary Ellen"));
    album.add(new Song("1995", "Rivers of Light", "DJ Turtle"));
    album.add(new Song("2008", "Do It Now", "Sue Manny"));
    album.add(new Song("2011", "Take It Slow", "Julia Torte"));
    album.add(new Song("1995", "Around The World", "Angela Ayres"));
    album.add(new Song("2011", "The Road Home", "Sue Manny"));
    album.add(new Song("1995", "Working Smart", "Emily Rose"));
    album.add(new Song("2008", "This Girl", "Aaron Tropic"));
    album.add(new Song("2011", "Do It Now", "Kyle Haney"));
    album.add(new Song("2008", "Land Of Dreams", "Emily Rose"));

    printAlbum();
    findTitle("Do It Now");
    findYear("2008");
    findArtist("Sue Manny");
  }

  public static void printAlbum() {
    System.out.println();
    System.out.println("ALBUM SONGS");
    System.out.println();
    System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
    System.out.println("---------------------------------------------");
    for (int i = 0; i < album.size(); i++)
      System.out.println(album.get(i));
  }

  public static void findTitle(String toFind) {
    ArrayList<Song> found = new ArrayList<Song>();

    for (int i = 0; i < album.size(); i++) {
      if (album.get(i).getTitle().compareTo(toFind) == 0) {
        found.add(album.get(i));
      }
    }

    System.out.println();
    System.out.println("<< SEARCH >>  The album search for \"" + toFind + "\" yielded " + found.size() + " results.");
    if (found.size() > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (int j = 0; j < found.size(); j++) {
        System.out.println(found.get(j));
      }
    }
  }

  public static void findYear(String toFind) {
    ArrayList<Song> found = new ArrayList<Song>();

    for (int i = 0; i < album.size(); i++) {
      if (album.get(i).getYear().compareTo(toFind) == 0) {
        found.add(album.get(i));
      }
    }

    System.out.println();
    System.out.println("<< SEARCH >>  The album search for songs from \"" + toFind + "\" yielded " + found.size() + " results.");
    if (found.size() > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (int j = 0; j < found.size(); j++) {
        System.out.println(found.get(j));
      }
    }
  }

  public static void findArtist(String toFind) {
    ArrayList<Song> found = new ArrayList<Song>();

    for (int i = 0; i < album.size(); i++) {
      if (album.get(i).getArtist().compareTo(toFind) == 0) {
        found.add(album.get(i));
      }
    }

    System.out.println();
    System.out.println("<< SEARCH >>  The album search for songs by \"" + toFind + "\" yielded " + found.size() + " results.");
    if (found.size() > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (int j = 0; j < found.size(); j++) {
        System.out.println(found.get(j));
      }
    }
  }
}
