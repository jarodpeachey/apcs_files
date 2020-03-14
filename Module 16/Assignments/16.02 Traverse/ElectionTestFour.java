
/**
 * Purpose: This class defines a Candidate by its name and number of votes.
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class ElectionTestFour {
  public static ArrayList<Candidate> candidates = new ArrayList<Candidate>();

  public static void main(String[] args) {
    candidates.add(new Candidate("Abraham Lincoln", 100));
    candidates.add(new Candidate("James Madison", 200));
    candidates.add(new Candidate("George Washington", 300));
    candidates.add(new Candidate("Teddy Roosevelt", 400));
    candidates.add(new Candidate("Andrew Jackson", 500));

    printAllData();

    // updateName("George Washington", "Bill Clinton");
    // updateVotes("Teddy Roosevelt", 350);
    updateNameAndVotes("Andrew Jackson", "John Adams", 350);

    printAllData();
  }

  public static void printAllData() {
    System.out.println();
    System.out.println("RAW ELECTION DATA");
    System.out.println();
    printCandidates();
    System.out.println();
    System.out.println();

    System.out.println("ELECTION RESULTS");
    System.out.println();
    printElectionResults();
  }

  public static void printCandidates() {
    for (int i = 0; i < candidates.size(); i++) {
      System.out.println(candidates.get(i).toString());
    }
  }

  public static void printElectionResults() {
    DecimalFormat df = new DecimalFormat("0.##");
    int totalVotes = getTotalVotes();

    System.out.println("                                                   ");
    System.out.printf("  %-20s|   %5s   |   %7s   |\n", "Candidate", "Votes", "% votes");
    System.out.println("+---------------------+-----------+-------------+");
    for (int i = 0; i < candidates.size(); i++) {
      System.out.printf("| %-20s|   %5s   |   %7s   |\n", candidates.get(i).getName(), candidates.get(i).getVotes(),
          df.format(getPercentage(totalVotes, candidates.get(i).getVotes())) + " %");
      System.out.println("+---------------------+-----------+-------------+");
    }

    System.out.println();
    System.out.println("Total votes cast: " + totalVotes);
    System.out.println();
  }

  public static int getTotalVotes() {
    int totalVotes = 0;

    for (int i = 0; i < candidates.size(); i++) {
      totalVotes += candidates.get(i).getVotes();
    }

    return totalVotes;
  }

  public static double getPercentage(int divisor, int dividend) {
    double percentage = ((double) dividend / (double) divisor) * 100;

    return percentage;
  }

  public static void updateName(String name, String replace) {
    for (int i = 0; i < candidates.size(); i++) {
      if (candidates.get(i).getName() == name) {
        System.out.println("<< Changing " + name + " to " + replace + " >>");
        candidates.get(i).setName(replace);
      }
    }
  }

  public static void updateVotes(String name, int votes) {
    for (int i = 0; i < candidates.size(); i++) {
      if (candidates.get(i).getName() == name) {
        System.out.println("<< Changing " + name + "'s " + " votes to " + votes + " >>");
        candidates.get(i).setVotes(votes);
      }
    }
  }

  public static void updateNameAndVotes(String name, String replace, int votes) {
    for (int i = 0; i < candidates.size(); i++) {
      if (candidates.get(i).getName() == name) {
        System.out.println("<< Changing " + name + " to " + replace + " and votes to " + votes + " >>");
        candidates.get(i).setName(replace);
        candidates.get(i).setVotes(votes);
      }
    }
  }
}
