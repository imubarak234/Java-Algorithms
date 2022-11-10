import java.io.*;

public class postivesArray {

  public static void main(String args[]) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    double[] number = new double[10];
    for (int x = 0; x < number.length; x++) {
      System.out.println("Please enter elements" + (x + 1) + ": ");
      number[x] = Double.parseDouble(stdin.readLine().trim());
    }
  }
}
