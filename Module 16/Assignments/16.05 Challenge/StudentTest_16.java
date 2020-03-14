
/**
 *
 *
 * @author < your name >
 * @version < today's date >
 */

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class StudentTest_16 {
  public static ArrayList<Student_16> students = new ArrayList<Student_16>();

  public static void main(String[] args) {
    students.add(new Student_16("James White", new Double[] { 88.4, 97.0, 56.5, 45.7, 98.4 }));
    students.add(new Student_16("James Brown", new Double[] {67.4, 97.7, 56.5, 87.4, 82.5}));
    students.add(new Student_16("James Black", 93.5, 85.7, 9.41, 96.5, 72.0));
    students.add(new Student_16("James Green", new Double[] { 84.4, 75.7, 92.0, 100.0, 86.5 }));
    students.add(new Student_16("James Gray", new Double[] { 76.4, 82.0, 65.5, 83.4, 97.7 }));

    printAllData();

    // updateName("James Black", "James Smith");
    // updateQuiz("James Black", 5, 87.5);
    // replaceStudent("James Black", new Student_16("James Smith", new Double[] {
    // 88.4, 97.0, 56.5, 45.7, 98.4 }));

    // addStudent(6, "James Smith", new Double[] { 88.4, 97.0, 56.5, 45.7, 98.4 });
    // addStudent("James Black", "James Smith", new Double[] { 88.4, 97.0, 56.5,
    // 45.7, 98.4 });
    // addStudent("James Smith", new Double[] { 88.4, 97.0, 56.5, 45.7, 98.4 });

    // removeStudent(0);
    // removeStudent("James Black");

    printAllData();
  }

  /*
   * PRINT METHODS FOR CANDIDATES
   ********************************/

  public static void printAllData() {
    System.out.println();
    System.out.println("Gradebook:");
    System.out.println();
    printQuizResults();
    System.out.println();
  }

  // public static void printStudents() {
  // for (int i = 0; i < students.size(); i++) {
  // System.out.println(students.get(i).toString());
  // }
  // }

  public static void printQuizResults() {
    DecimalFormat df = new DecimalFormat("0.##");

    System.out.printf("%-16s|  %3s   |  %3s   |  %3s   |  %3s   |  %3s   |    %3s    |\n", "Student", "Q1", "Q2", "Q3",
        "Q4", "Q5", "Avg.");
    System.out.println("----------------+--------+--------+--------+--------+--------+    --------+");
    for (int i = 0; i < students.size(); i++) {
      students.get(i).printResults();
      System.out.println("----------------+--------+--------+--------+--------+--------+    --------+");
    }
  }

  // /*
  // * GETTER METHODS FOR CANDIDATES
  // ********************************/

  // public static int getTotalVotes() {
  // int totalVotes = 0;

  // for (int i = 0; i < students.size(); i++) {
  // totalVotes += students.get(i).getVotes();
  // }

  // return totalVotes;
  // }

  // public static double getPercentage(int divisor, int dividend) {
  // double percentage = ((double) dividend / (double) divisor) * 100;

  // return percentage;
  // }

  /*
   * ADD METHODS FOR CANDIDATES
   ********************************/
  public static void addStudent(int position, String name, Double[] scores) {
    if (position > students.size()) {
      System.out.println("<< Adding " + name + " in position " + students.size() + " >>");
      students.add(new Student_16(name, scores));
    } else {
      System.out.println("<< Adding " + name + " in position " + position + " >>");
      students.add(position, new Student_16(name, scores));
    }
  }

  public static void addStudent(String nameSearch, String name, Double[] scores) {
    boolean foundMatch = false;
    int index = 0;

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == nameSearch) {
        foundMatch = true;
        index = i;
      }
    }
    if (foundMatch) {
      System.out.println("<< Adding " + name + " before " + nameSearch + " >>");
      students.add(index, new Student_16(name, scores));
    } else {
      System.out
          .println("<< Failed adding " + name + ": could not find student " + nameSearch + " to insert before. >>");
    }
  }

  public static void addStudent(String name, Double[] scores) {
    System.out.println("<< Adding " + name + " in position " + students.size() + " >>");
    students.add(new Student_16(name, scores));
  }

  /*
   * DELETE METHODS FOR CANDIDATES
   ********************************/
  public static void removeStudent(int position) {
    if (position > students.size()) {
      System.out.println("<< Error removing a student from position " + position + ": that student does not exist. >>");
    } else {
      System.out.println(
          "<< Removing the student, " + students.get(position).getName() + ", from position " + position + " >>");

      students.remove(position);
    }
  }

  public static void removeStudent(String nameSearch) {
    boolean foundMatch = false;
    int index = 0;

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == nameSearch) {
        foundMatch = true;
        index = i;
      }
    }
    if (foundMatch) {
      System.out
          .println("<< Removing " + students.get(index).getName() + ", in position " + index + ", from students. >>");

      students.remove(index);

    } else {
      System.out.println("<< Failed removing student: " + " could not find student " + nameSearch + ". >>");
    }
  }

  /*
   * UPDATE METHODS FOR CANDIDATES
   ********************************/
  public static void updateName(String name, String replace) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == name) {
        System.out.println("<< Changing " + name + " to " + replace + " >>");
        students.get(i).setName(replace);
      }
    }
  }

  public static void updateQuiz(String name, int number, double score) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == name) {
        if (number <= 5 && number >= 1) {
          System.out.println("<< Changing " + name + "'s" + " score for quiz #" + number + " to " + score + " >>");
          students.get(i).setScore(number, score);
        } else {
          System.out.println("<< Cannot update " + name + "'s" + "score for quiz #" + number
              + " because that quiz does not exist. " + " >>");
        }

      }
    }
  }

  public static void replaceStudent(String name, Student_16 newStudent) {
    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName() == name) {
        System.out.println("<< Replacing " + name + " with " + newStudent.getName() + " >>");
        students.set(i, newStudent);
      }
    }
  }
}
