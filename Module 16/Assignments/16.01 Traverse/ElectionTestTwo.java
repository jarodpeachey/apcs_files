
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.Arrays;
import java.util.Collections;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class ElectionTestTwo {
  public static void main(String[] args) {
    ArrayList<Candidate> candidates = new ArrayList<Candidate>();

    candidates.add(new Candidate("Abraham Lincoln", 100));
    candidates.add(new Candidate("James Madison", 200));
    candidates.add(new Candidate("George Washington", 300));
    candidates.add(new Candidate("Teddy Roosevelt", 400));
    candidates.add(new Candidate("Andrew Jackson", 500));

    System.out.println();
    System.out.println("RAW ELECTION DATA");
    System.out.println();
    printCandidates(candidates);
    System.out.println();
    System.out.println();

    System.out.println("ELECTION RESULTS");
    System.out.println();
    printElectionResults(candidates);
  }

  public static void printCandidates(ArrayList<Candidate> candidates) {
    for (int i = 0; i < candidates.size(); i++) {
      System.out.println(candidates.get(i).toString());
    }
  }

  public static void printElectionResults(ArrayList<Candidate> candidates) {
    DecimalFormat df = new DecimalFormat("0.##");
    int totalVotes = getTotalVotes(candidates);

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
  }

  public static int getTotalVotes(ArrayList<Candidate> candidates) {
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
}
