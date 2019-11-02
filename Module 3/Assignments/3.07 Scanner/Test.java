public class Test {
  public String subject = "";
  public double average = 0.0;
  public int totalStudents = 0;
  public Student[] studentsArray;

  public Test(String newSubject, int newTotalStudents, Student[] newStudentsArray, double newAverage) {
    // Set test variables
    subject = newSubject;
    average = newAverage;
    totalStudents = newTotalStudents;
    studentsArray = newStudentsArray;
  }
}
