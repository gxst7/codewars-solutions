/**
 * 8 kyu Basic Mathematical Operations
 */
public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
      switch (op) {
          case "+":
            return v1 + v2;
          case "-":
            return v1 - v2;
          case "*":
            return v1 * v2;
          case "/":
            return v1 / v2;
          default:
            return -1;
        }
    }
  }
