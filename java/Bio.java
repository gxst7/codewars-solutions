/**
 * 8 kyu DNA to RNA Conversion
 * 
 * Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems.
 * It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
 * Ribonucleic acid, RNA, is the primary messenger molecule in cells.
 * RNA differs slightly from DNA its chemical structure and contains no Thymine.
 * In RNA Thymine is replaced by another nucleic acid Uracil ('U').
 * Create a function which translates a given DNA string into RNA.
 * For example: "GCAT"  =>  "GCAU"
 * The input string can be of arbitrary length - in particular, it may be empty.
 * All input is guaranteed to be valid, i.e. each input string will only ever consist of 'G', 'C', 'A' and/or 'T'.
 */
public class Bio {
    public String dnaToRna(String dna) {
        char[] chars = dna.toCharArray();
        for(int i = 0; i < chars.length; i++) {
          if (chars[i] == 'U') chars[i] = 'T';
          else if (chars[i] == 'T') chars[i] = 'U';
        }
        return new String(chars);
    }
}