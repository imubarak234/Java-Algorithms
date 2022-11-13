import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

/*
 * Write a recursive method that prints a string passed to it as parameter in reverse order. 
 */
public class printReverseRecursive {

  public static void main(String args[]) throws IOException {

    BufferedReader inner = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("This algorithm uses a recursive approach to print in reverse: ");
    String ins = inner.readLine().trim();
    System.out.println(reverseString(ins, 0));
  }

  public static String reverseString(String inn, int start) {
    if (start >= inn.length()) {
      return "";
    } else {
      return reverseString(inn, start + 1) + inn.charAt(start);
    }
  }
}
