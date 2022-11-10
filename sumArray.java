import java.io.IOException;
import java.io.*;

/*
 * Write a recursive method that returns the sum of elements in an array of double.  
 * Test your method by writing a main method that creates an array of double of size 10, initialize it by reading data from the user and calling your method to compute the sum and print it.
 */
public class sumArray {

  public static void main(String args[]) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    double[] number = new double[10];
    System.out.println("The algorithm collects 10 decimal values into an array sums up and displays the result");
    for (int x = 0; x < number.length; x++) {

      System.out.print("Please enter a number: ");
      number[x] = Double.parseDouble(stdin.readLine().trim());
    }

    System.out.println("The sum of all the values = " + arraySums(number, 0));
  }

  public static double arraySums(double[] y, int start) {
    if (start >= y.length) {
      return 0;
    } else {
      return arraySums(y, start + 1) + y[start];
    }

  }
}