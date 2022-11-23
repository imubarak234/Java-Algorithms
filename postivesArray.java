import java.io.*;
import java.util.Arrays;

/*
 * write another recursive method that counts the number of positive elements in the array. 
 * Add a statement inside the main method to call this method so that you program prints both the sum and the number of positive elements in the array.
 */
public class postivesArray {

  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    double[] number = new double[10];
    for (int x = 0; x < number.length; x++) {
      System.out.print("Please enter elements " + (x + 1) + ": ");
      number[x] = Double.parseDouble(stdin.readLine().trim());
    }

    // double[] second = { 2, 4, 5, 6, 7, 8, 6, 4, 5, -9 };
    // System.out.println(Arrays.toString(second));
    System.out.println("The test answer: " + positiveNumber(number, 0, 0));
  }

  public static double arraySums(double[] y, int start) {
    if (start >= y.length) {
      return 0;
    } else {
      return arraySums(y, start + 1) + y[start];
    }

  }

  public static int positiveNumber(double[] x, int start, int count) {
    if (start >= x.length) {
      return 0;
    } else if (x[start] >= 0) {
      System.out.println("Counts: " + count);
      return positiveNumber(x, start + 1, count) + count;
    } else {
      return positiveNumber(x, start + 1, count);
    }
  }
}
