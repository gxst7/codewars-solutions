/**
 * 6 kyu Find the unique number
 */
public class FindUnique {
    public static double findUniq(double arr[]) {
        double num = (arr[0] == arr[1]) ? arr[0] : arr[2];
        for (double i : arr) {
            if (!(i == num)) {
                num = i;
                break;
            }
        }
        return num;
    }
}