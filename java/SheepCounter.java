/**
 * 8 kyu If you can't sleep, just count sheep!!
 */
class SheepCounter {
    public static String countingSheep(int num) {
      String s = "";
      for (int i = num, j = 1; i > 0; i--, j++) {
        s += j + " sheep...";
      }
      return s;
    }
  }