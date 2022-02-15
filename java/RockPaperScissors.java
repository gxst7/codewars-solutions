/**
 * 8 kyu Rock Paper Scissors!
 */
public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        String s = p1 + p2;
        if (p1.equals(p2)) {
          return "Draw!";
        }
        switch(s) {
            case "scissorspaper":
            case "rockscissors":
            case "paperrock":
              return "Player 1 won!";
            case "paperscissors":
            case "scissorsrock":
            case "rockpaper":
              return "Player 2 won!";
            default:
              return "";
        }
    }
}
