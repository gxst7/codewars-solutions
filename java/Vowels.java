/**
 * 7 kyu Vowel Count
 */
public class Vowels {

    public static int getCount(String str) {
        return (int) str.chars()
                  .filter(character -> (character == 'a' ||
                          character == 'e' || character == 'u' ||
                          character == 'o' || character == 'i'))
                  .count();
    }
  
  }