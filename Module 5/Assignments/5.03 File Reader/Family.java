import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import java.text.DecimalFormat;

public class Family {
  public static void main(String[] args) throws IOException {
    String token = "";
    File fileName = new File("maleFemaleInFamily.txt");
    Scanner inFile = new Scanner(fileName);

    int totalCount = 0;
    int allBoys = 0;
    int allGirls = 0;
    int oneEach = 0;

    while (inFile.hasNext()) {
      token = inFile.next();
      if (Pattern.matches("BB", token)) {
        allBoys++;
      } else if (Pattern.matches("GG", token)) {
        allGirls++;
      } else if (Pattern.matches("BG|GB", token)) {
        oneEach++;
      }

      totalCount++;
    } // end while

    inFile.close();

    DecimalFormat df = new DecimalFormat("#.00");
    String format = "%1$-15s%2$-15s%3$-2s\n";

    double percentAllBoys = (double) totalCount / (double) allBoys * 10;
    double percentAllGirls = (double) totalCount / (double) allGirls * 10;
    double percentOneEach = (double) totalCount / (double) oneEach * 10;

    System.out.println();
    System.out.println("Statistics for families with 2 kids.");
    System.out.println();
    System.out.println("Total families: " + totalCount);
    System.out.println();
    System.out.format(format, "Spread", "Total", "Percentage of all familes");
    System.out.println();
    System.out.format(format, "2 girls: ", allGirls, df.format(percentAllGirls) + "%");
    System.out.format(format, "2 boys: ", allBoys, df.format(percentAllBoys) + "%");
    System.out.format(format, "1 each: ", oneEach, df.format(percentOneEach) + "%");
  } // end of main method
} // end of class

// V3: Use the following block of code to test reading integers from data3.txt
/*
 * //String token = ""; int intToken = 0; File fileName = new File("data3.txt");
 * Scanner inFile = new Scanner(fileName); int total = 0;
 * 
 * //while loop will continue while inFile has a next token to read while
 * (inFile.hasNext()) { intToken = inFile.nextInt(); //read next token from file
 * System.out.println(intToken); //print value of token total += intToken;
 * }//end while
 * 
 * System.out.println("\nTotal: " + total); inFile.close(); //close input file
 * 
 */

// V4: Use the following block of code to test reading doubles from data4.txt
/*
 * String token = ""; double doubleToken = 0.0; File fileName = new
 * File("data4.txt"); Scanner inFile = new Scanner(fileName); double total = 0;
 * 
 * //while loop will continue while inFile has a next token to read while
 * (inFile.hasNext()) { doubleToken = inFile.nextDouble( ); //read next token
 * from file System.out.println(doubleToken); //print value of token total +=
 * doubleToken; }//end while
 * 
 * System.out.println("\nTotal: " + total); inFile.close(); //close input file
 */
