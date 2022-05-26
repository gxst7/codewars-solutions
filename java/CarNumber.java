public class CarNumber {
    public static void main(String...strings) {
        // String fin = "DDD-LL";
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int n = 0; n < 3; n++) {
                        for (int m = 0; m < 3; m++) {
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}