import java.util.Arrays;


/**
 * 7 kyu Small enough? - Beginner
 * 
 * You will be given an array and a limit value.
 * You must check that all values in the array are below or equal to the limit value.
 * If they are, return true. Else, return false.
 * You can assume all values in the array are numbers.
 */
public class SmallEnough {
  public static boolean smallEnough(int[] a, int limit) {
      int count = (int) Arrays.stream(a)
                .filter(value -> value <= limit)
                .count();
      return (count == a.length);
  }
}