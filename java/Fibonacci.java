/**
 * 7 kyu Fibonacci
 * 
 * Create function fib that returns n'th element of Fibonacci sequence (classic programming task).
 */
public class Fibonacci {
    public static long fib (int n) {
      int prev = 0;
      int current = 1;
      for (int i = 1; i < n; i++) {
        int next = prev + current;
        prev = current;
        current = next;
      }
      return current;
    }
  }
