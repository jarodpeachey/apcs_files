
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.Arrays;
import java.util.Collections;
import java.text.DecimalFormat;

public class ElectionTestOne {
  public static void main(String[] args) {
    Candidate[] candidates;
    candidates = new Candidate[5];

    candidates[0] = new Candidate("Abraham Lincoln", 100);
    candidates[1] = new Candidate("James Madison", 200);
    candidates[2] = new Candidate("George Washington", 300);
    candidates[3] = new Candidate("Teddy Roosevelt", 400);
    candidates[4] = new Candidate("Andrew Jackson", 500);

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

  public static void printCandidates(Candidate[] candidates) {
    for (int i = 0; i < candidates.length; i++) {
      System.out.println(candidates[i].toString());
    }
  }

  public static void printElectionResults(Candidate[] candidates) {
    DecimalFormat df = new DecimalFormat("0.##");
    int totalVotes = getTotalVotes(candidates);

    System.out.println("                                                   ");
    System.out.printf("  %-20s|   %5s   |   %7s   |\n", "Candidate", "Votes", "% votes");
    System.out.println("+---------------------+-----------+-------------+");
    for (int i = 0; i < candidates.length; i++) {
      System.out.printf("| %-20s|   %5s   |   %7s   |\n", candidates[i].getName(), candidates[i].getVotes(),
          df.format(getPercentage(totalVotes, candidates[i].getVotes())) + " %");
      System.out.println("+---------------------+-----------+-------------+");
    }

    System.out.println();
    System.out.println("Total votes cast: " + totalVotes);
  }

  public static int getTotalVotes(Candidate[] candidates) {
    int totalVotes = 0;

    for (int i = 0; i < candidates.length; i++) {
      totalVotes += candidates[i].getVotes();
    }

    return totalVotes;
  }

  public static double getPercentage(int divisor, int dividend) {
    double percentage = ((double) dividend / (double) divisor) * 100;

    return percentage;
  }
}
