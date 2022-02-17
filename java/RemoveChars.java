/**
 * 8 kyu Remove First and Last Character
 */
public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}