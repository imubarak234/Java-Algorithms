import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a recursive method that returns true if a string passed to it as
 * parameter is a palindrome
 * (palindrome is a string that reads the same both forward and backward).
 * 
 * @return boolen
 */
public class palindromeRecursive {

  public static void main(String args[]) throws IOException {

    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("This algorithm takes in your input string and returns if its a palindrome or not: ");
    String padlindrome = stdin.readLine().trim();

    System.out.println(isPalindrome(padlindrome, 0, padlindrome.length(), 0));
    // String ends = "computers";
    // System.out.println(ends.charAt(ends.length() - 1));
  }

  public static boolean isPalindrome(String ins, int start, int end, int count) {

    if ((start >= ins.length()) && (count == ins.length())) {
      return true;
    } else if (ins.charAt(start) == ins.charAt(end - 1)) {
      return isPalindrome(ins, start + 1, end - 1, count + 1);
    } else if ((start >= ins.length()) && (count < ins.length())) {
      return false;
    } else {
      return isPalindrome(ins, start + 1, end - 1, count);
    }

  }
}
