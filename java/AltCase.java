/**
 * 7 kyu Alternate case
 * 
 * Write function alternateCase which switch every letter in string from upper to lower
 * and from lower to upper. E.g: Hello World -> hELLO wORLD
 */
class AltCase {
    static String alternateCase(final String string) {
        char[] chars = string.toCharArray();
        for (char ch = 0; ch < chars.length; ch++) {
            if (Character.isLowerCase(chars[ch])) {
                chars[ch] = Character.toUpperCase(chars[ch]);
            } else {
                chars[ch] = Character.toLowerCase(chars[ch]);
            }
        }
        return String.valueOf(chars);
    }
}