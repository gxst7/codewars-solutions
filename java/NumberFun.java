/**
 * 7 kyu Find the next perfect square!
 */
public class NumberFun {
    public static long findNextSquare(long sq) {
        return (((long) Math.sqrt(sq) * (long) Math.sqrt(sq)) == sq) ? (long) Math.pow(Math.sqrt(sq)+1, 2) : -1; 
    }
}