/**
 * 7 kyu Exes and Ohs
 * 
 * Check to see if a string has the same amount of 'x's and 'o's.
 * The method must return a boolean and be case insensitive. The string can contain any char.
 * Examples input/output:
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 */
public class XO {
  
    public static boolean getXO (String str) {
      
      int count = 0;
      char[] array = str.toCharArray();
      for (char ch : array) {
        switch (ch) {
            case 'x':
            case 'X':
              count++;
              break;
            case 'o':
            case 'O':
              count--;
              break;
        }
      }
      return (count == 0) ? true : false;
    }
}