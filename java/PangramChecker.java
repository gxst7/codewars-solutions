import java.util.HashSet;
import java.util.Set;

/**
 * 6 kyu Detect Pangram
 * 
 * A pangram is a sentence that contains every single letter of the alphabet at least once.
 * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
 * because it uses the letters A-Z at least once (case is irrelevant).
 * Given a string, detect whether or not it is a pangram. Return True if it is, False if not.
 * Ignore numbers and punctuation.
 */
public class PangramChecker {
  public boolean check(String sentence){
    Set<Character> characterSet = new HashSet<>();
        for (char ch = 97; ch < 123; ch++) {
            characterSet.add(ch);
        }
        sentence = sentence.toLowerCase();
        for (char ch = 97; ch < 123; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
  }
}