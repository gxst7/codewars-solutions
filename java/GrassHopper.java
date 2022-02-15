/**
 * 8 kyu Grasshopper - Grade book
 * 
 * Complete the function so that it finds the average
 * of the three scores passed to it and returns the letter value associated with that grade.
 */
public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int sum = (s1 + s2 + s3 ) / 3;
        if (sum < 60) {
          return 'F';
        } else if (sum < 70) {
          return 'D';
        } else if (sum < 80) {
          return 'C';
        } else if (sum < 90) {
          return 'B';
        } else {
          return 'A';
        }
    }
}