/**
 * 8 kyu Will there be enough space?
 */
public class Bob {
    public static int enough(int cap, int on, int wait){
      return ((on + wait) <= cap) ? 0 : on + wait - cap;
    }
  }