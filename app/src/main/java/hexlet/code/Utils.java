package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RAND = new Random();
    public static int random(int min, int max) {
        return RAND.nextInt((max - min) + 1) + min;
    }
}
