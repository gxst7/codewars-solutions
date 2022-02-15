/**
 * 8 kyu altERnaTIng cAsE <=> ALTerNAtiNG CaSe
 */
public class StringUtils {
  
    public static String toAlternativeString(String string) {
          char[] chars = string.toCharArray();
          for (char ch = 0; ch < chars.length; ch++) {
              if (Character.isLowerCase(chars[ch])) {
                  chars[ch] = Character.toUpperCase(chars[ch]);
              } else {
                  chars[ch] = Character.toLowerCase(chars[ch]);
              }
          }
          return String.valueOf(chars);  }
  }