
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Student_16 {
  // instance variables
  private String name;
  private ArrayList<Double> scores = new ArrayList<Double>();

  // Constructor for objects of class Student_16
  public Student_16(String name, double scoreOne, double scoreTwo, double scoreThree, double scoreFour, double scoreFive) {
    // initialize instance variables
    this.name = name;

    scores.add(scoreOne);
    scores.add(scoreTwo);
    scores.add(scoreThree);
    scores.add(scoreFour);
    scores.add(scoreFive);
  }

  // Constuctor that accepts array of scores
  public Student_16(String name, Double[] scores) {
    // initialize instance variables
    this.name = name;

    for (int i = 0; i < scores.length; i++) {
      this.scores.add(scores[i]);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  public Double getScore(int number) {
    for (int i = 0; i < scores.size(); i++) {
      if (i == number) {
        return scores.get(number);
      }
    }

    return 0.0;
  }

  public void setScore(int number, double score) {
    scores.set(number - 1, score);
  }

  public void updateQuiz(int number, double score) {
    for (int i = 0; i < scores.size(); i++) {
      if (i == number) {
        scores.set(i, score);
      }
    }
  }

  public double getAverage() {
    double total = 0.0;
    int count = 0;
    double average = 0.0;

    for (int i = 0; i < scores.size(); i++) {
      total += scores.get(i);
      count++;
    }

    average = total / count;

    return average;
  }

  public void printResults() {
    DecimalFormat df = new DecimalFormat("0.##");
    String numbersString = "";

    for (int i = 0; i < scores.size(); i++) {
      numbersString += "   " + df.format(scores.get(i));
    }
    System.out.printf("%-16s| %5s  | %5s  | %5s  | %5s  | %5s  |    %-5s   |\n", name, scores.get(0), scores.get(1),
        scores.get(2), scores.get(3), scores.get(4), df.format(getAverage()));
  }
}
