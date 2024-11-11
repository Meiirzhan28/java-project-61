package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int MAX = 101;
    private static final Random RAND = new Random();
    public static int random(int min, int max) {
        return RAND.nextInt(min, max);
    }
    public static int random() {
        return RAND.nextInt(MAX);
    }
}
