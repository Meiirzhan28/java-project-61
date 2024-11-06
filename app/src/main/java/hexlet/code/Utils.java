package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int UPPER_LIMIT = 101;
    public static int random() {
        Random rand = new Random();
        return rand.nextInt(UPPER_LIMIT);
    }

}
