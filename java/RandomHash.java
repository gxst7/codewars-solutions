import java.util.Random;

public class RandomHash {
    
    public static void main(String... args) {
        Random random = new Random();
        String hash = "";

        for (int i = 0; i < 24; i++) {
            hash += (char) (random.nextInt(75) + 48);
        }

        System.out.println(hash);
    }
}