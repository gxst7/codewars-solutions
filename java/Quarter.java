/**
 * 8 kyu Quarter of the year
 */
public class Quarter {
    public static int quarterOf(int month) {
        return (month < 4) ? 1 : (month < 7) ? 2 : (month < 10) ? 3 : 4;
    }
}
