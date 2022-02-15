import java.util.LinkedList;
import java.util.List;

/**
 * 6 kyu Playing with digits
 * 
 * Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k
 */
public class DigPow {
  
  public static long digPow(int n, int p) {
      long sum = 0;
      List<Integer> list = new LinkedList<>();
      for (int i = 0; i < Integer.toString(n).length(); i++) {
          list.add(Integer.parseInt(String.valueOf(Integer.toString(n).charAt(i))));
      }
      System.out.println(list);
      for (Integer i : list) {
          sum += Math.pow(i, p++);
      }
      return (sum % n != 0) ? -1 : sum / n;
  }
  
}