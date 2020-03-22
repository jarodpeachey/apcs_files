
/**
 * This class browses through an album of songs and allows you to search by year, title and artist
 *
 * @author Jarod Peachey
 * @version 1.0.0
 */

import java.util.ArrayList;

public class SongTester2 {
  private static ArrayList<Song2> album = new ArrayList<Song2>();
  private static ArrayList<Song2> albumByArtist = new ArrayList<Song2>();
  private static ArrayList<Song2> albumByYear = new ArrayList<Song2>();
  private static ArrayList<Song2> albumByTitle = new ArrayList<Song2>();

  public static void main(String[] args) {
    album.add(new Song2("2011", "The Road Home", "Mary Ellen"));
    album.add(new Song2("1995", "Rivers of Light", "DJ Turtle"));
    album.add(new Song2("2008", "Do It Now", "Sue Manny"));
    album.add(new Song2("2011", "Take It Slow", "Julia Torte"));
    album.add(new Song2("1995", "Around The World", "Angela Ayres"));
    album.add(new Song2("2011", "The Road Home", "Sue Manny"));
    album.add(new Song2("1995", "Working Smart", "Emily Rose"));
    album.add(new Song2("2008", "This Girl", "Aaron Tropic"));
    album.add(new Song2("2011", "Do It Now", "Kyle Haney"));
    album.add(new Song2("2008", "Land Of Dreams", "Emily Rose"));

    albumByArtist = album;
    albumByYear = album;
    albumByTitle = album;

    printAlbum();

    sortByArtist();
    findArtist("Sue Manny");
    // sortByTitle();
    // findTitle("Do It Now");
    // sortByYear();
    // findYear("2011");
  }

  public static void printAlbum() {
    System.out.println();
    System.out.println("ALBUM SONGS");
    System.out.println();
    System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
    System.out.println("---------------------------------------------");
    for (int i = 0; i < album.size(); i++)
      System.out.println(album.get(i));
    System.out.println();
    System.out.println("ALBUM BY ARTIST");
    System.out.println();
    System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
    System.out.println("---------------------------------------------");
    for (int i = 0; i < albumByArtist.size(); i++)
      System.out.println(albumByArtist.get(i));
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
  // SORT METHODS USING INSERTION SORT //
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

  public static void sortByYear() {
    Song2 temp;

    for (int i = 0; i < albumByYear.size(); i++) {
      for (int j = i + 1; j < albumByYear.size(); j++) {
        if (albumByYear.get(i).getYear().compareToIgnoreCase(albumByYear.get(j).getYear()) > 0) {
          temp = albumByYear.get(i);
          albumByYear.set(i, albumByYear.get(j));
          albumByYear.set(j, temp);
        }
      }
    }
  }

  public static void sortByTitle() {
    Song2 temp;

    for (int i = 0; i < albumByTitle.size(); i++) {
      for (int j = i + 1; j < albumByTitle.size(); j++) {
        if (albumByTitle.get(i).getTitle().compareToIgnoreCase(albumByTitle.get(j).getTitle()) > 0) {
          temp = albumByTitle.get(i);
          albumByTitle.set(i, albumByTitle.get(j));
          albumByTitle.set(j, temp);
        }
      }
    }
  }

  public static void sortByArtist() {
    Song2 temp;

    for (int i = 0; i < albumByArtist.size(); i++) {
      for (int j = i + 1; j < albumByArtist.size(); j++) {
        if (albumByArtist.get(i).getArtist().compareToIgnoreCase(albumByArtist.get(j).getArtist()) > 0) {
          temp = albumByArtist.get(i);
          albumByArtist.set(i, albumByArtist.get(j));
          albumByArtist.set(j, temp);
        }
      }
    }
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//
  // SEARCH METHODS USING BINARY SEARCH //
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

  public static void findArtist(String toFind) {
    int high = albumByArtist.size();
    int low = -1;
    int probe;

    while (high - low > 1) {
      probe = (high + low) / 2;

      if (albumByArtist.get(probe).getArtist().compareTo(toFind) > 0)
        high = probe;
      else {
        low = probe;
        if (albumByArtist.get(probe).getArtist().compareTo(toFind) == 0) {
          break;
        }
      }
    }

    if ((low >= 0) && (albumByArtist.get(low).getArtist().compareTo(toFind) == 0)) {
      printArtist(low, toFind);
    } else
      System.out.println("NOT found: " + toFind);
  }

  public static void printArtist(int low, String toFind) {
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while ((i >= 0) && (albumByArtist.get(i).getArtist().compareTo(toFind) == 0)) {
      start = i;
      System.out.println(albumByArtist.get(i));
      i--;
    }
    // find ending point of matches
    i = low + 1;
    while ((i < albumByArtist.size()) && (albumByArtist.get(i).getArtist().compareTo(toFind) == 0)) {
      end = i;
      System.out.println(albumByArtist.get(i));
      i++;
    }
    // now print out the matches

    System.out.println();
    System.out.println(
        "<< SEARCH >>  The album search for songs by \"" + toFind + "\" yielded " + (end - start + 1) + " results.");
    if (i > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (i = start; i <= end; i++) {
        System.out.println(albumByArtist.get(i));
      }
    }
  }

  public static void findTitle(String toFind) {
    int high = albumByTitle.size();
    int low = -1;
    int probe;

    while (high - low > 1) {
      probe = (high + low) / 2;

      if (albumByTitle.get(probe).getTitle().compareTo(toFind) > 0)
        high = probe;
      else {
        low = probe;
        if (albumByTitle.get(probe).getTitle().compareTo(toFind) == 0) {
          break;
        }
      }
    }

    if ((low >= 0) && (albumByTitle.get(low).getTitle().compareTo(toFind) == 0)) {
      printTitle(low, toFind);
    } else
      System.out.println("NOT found: " + toFind);
  }

  public static void printTitle(int low, String toFind) {
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while ((i >= 0) && (albumByTitle.get(i).getTitle().compareTo(toFind) == 0)) {
      start = i;
      System.out.println(albumByTitle.get(i));
      i--;
    }
    // find ending point of matches
    i = low + 1;
    while ((i < albumByTitle.size()) && (albumByTitle.get(i).getTitle().compareTo(toFind) == 0)) {
      end = i;
      System.out.println(albumByTitle.get(i));
      i++;
    }
    // now print out the matches

    System.out.println();
    System.out
        .println("<< SEARCH >>  The album search for \"" + toFind + "\" yielded " + (end - start + 1) + " results.");
    if (i > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (i = start; i <= end; i++) {
        System.out.println(albumByTitle.get(i));
      }
    }
  }

  public static void findYear(String toFind) {
    int high = albumByYear.size();
    int low = -1;
    int probe;

    while (high - low > 1) {
      probe = (high + low) / 2;

      if (albumByYear.get(probe).getYear().compareTo(toFind) > 0)
        high = probe;
      else {
        low = probe;
        if (albumByYear.get(probe).getYear().compareTo(toFind) == 0) {
          break;
        }
      }
    }

    if ((low >= 0) && (albumByYear.get(low).getYear().compareTo(toFind) == 0)) {
      printYear(low, toFind);
    } else
      System.out.println("NOT found: " + toFind);
  }

  public static void printYear(int low, String toFind) {
    int i;
    int start = low;
    int end = low;

    // find starting point of matches
    i = low - 1;
    while ((i >= 0) && (albumByYear.get(i).getYear().compareTo(toFind) == 0)) {
      start = i;
      System.out.println(albumByYear.get(i));
      i--;
    }
    // find ending point of matches
    i = low + 1;
    while ((i < albumByYear.size()) && (albumByYear.get(i).getYear().compareTo(toFind) == 0)) {
      end = i;
      System.out.println(albumByYear.get(i));
      i++;
    }
    // now print out the matches

    System.out.println();
    System.out.println("<< SEARCH >>  The album search for songs published in \"" + toFind + "\" yielded "
        + (end - start + 1) + " results.");
    if (i > 0) {
      System.out.println();
      System.out.printf("%-10s %-20s %-5s\n", "Year", "Title", "Artist");
      System.out.println("---------------------------------------------");
      for (i = start; i <= end; i++) {
        System.out.println(albumByYear.get(i));
      }
    }
  }
}
