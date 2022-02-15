import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 4 kyu Roman Numerals Helper
 * 
 * Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
 * It should follow the API demonstrated in the examples below.
 * Multiple roman numeral values will be tested for each helper method.
 * Examples:
 * RomanNumerals.toRoman(1000) // should return 'M'
 * RomanNumerals.fromRoman("M") // should return 1000
 */
public class RomanNumerals {
    public static Map<String, Integer> map = new LinkedHashMap<>();

    public static String toRoman(int n) {
        StringBuilder romanString = new StringBuilder("");
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        for (String roman : map.keySet()) {
            while (n >= map.get(roman)) {
                romanString.append(roman);
                n -= map.get(roman);
            }
        }
        return romanString.toString();
    }
  
    public static int fromRoman(String romanNumeral) {
        int arabic = 0;
        while (romanNumeral.length() > 0) {
            for (String roman : map.keySet()) {
                if (romanNumeral.length() == 0) break;
                if (romanNumeral.substring(0, 1).equals(roman)) {
                    arabic += map.get(roman);
                    romanNumeral = romanNumeral.substring(1);
                } else if (romanNumeral.length() > 1 && romanNumeral.substring(0, 2).equals(roman)) {
                    arabic += map.get(roman);
                    romanNumeral = romanNumeral.substring(2);
                }
            }
        }
        return arabic;
    }
}