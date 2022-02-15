import java.util.LinkedList;
import java.util.List;

/**
 * 5 kyu Scramblies
 * 
 * Complete the function scramble(str1, str2) that returns true
 * if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
 * Only lower case letters will be used (a-z). No punctuation or digits will be included.
 * Performance needs to be considered.
 * Examples:
 * scramble('cedewaraaossoqqyt', 'codewars') ==> True
 * scramble('katas', 'steak') ==> False
 */
public class Scramblies {
    
    public static boolean scramble(String str1, String str2) {
        List<Character> list1 = new LinkedList<>();
        List<Character> list2 = new LinkedList<>();

        str1.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(list1::add);
        str2.chars()
                .mapToObj(ch -> (char) ch)
                .forEach(list2::add);

        System.out.println(list1);
        System.out.println(list2);

        for (char ch : list2) {
            if (list1.contains(ch)) {
                list1.remove((Character) ch);
            } else {
                return false;
            }
        }
        return true;
    }
}