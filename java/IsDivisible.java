/**
 * 7 kyu Is n divisible by (...)?
 */
public class IsDivisible {
    public static boolean isDivisible(int...n) {
        boolean b = true;
        for (int i = 1; i < n.length; i++) {
            b = b && (n[0] % n[i] == 0);
        }
        return b;
    }
}