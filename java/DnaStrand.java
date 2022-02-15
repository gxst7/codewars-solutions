/**
 * 7 kyu Complementary DNA
 * 
 * "ATTGC" --> "TAACG"
 * "GTAT" --> "CATA"
 */
public class DnaStrand {
    public static String makeComplement(String dna) {
      char[] chars = dna.toCharArray();
      for (int i = 0; i < chars.length; i++) {
        switch (chars[i]) {
            case 'A':
              chars[i] = 'T';
              break;
            case 'T':
              chars[i] = 'A';
              break;
            case 'G':
              chars[i] = 'C';
              break;
            case 'C':
              chars[i] = 'G';
              break;
        }
      }
      return new String(chars);
    }
  }