/**
 * 7 kyu Square Every Digit
 * 
 * For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
 */
public class SquareDigit {

    public int squareDigits(int n) {
      StringBuilder s = new StringBuilder();
      char[] chars = String.valueOf(n).toCharArray();
      for (char ch : chars) {
        s.append((int) Math.pow(Integer.parseInt(String.valueOf(ch)), 2));
      }
      return Integer.parseInt(s.toString());
    }
}