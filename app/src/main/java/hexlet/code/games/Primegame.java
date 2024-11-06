package hexlet.code.games;

import hexlet.code.Utils;

public class Primegame  {
    private static final int ROUND = 3;
    public static String gameinfo() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            String num = String.valueOf(Utils.random());
            String correctAnswer = prime(num);
            data[i][0] = num;
            data[i][1] = correctAnswer;
        }
        return data;
    }

    public static String prime(String num) {
        int a = Integer.parseInt(num);
        if (a <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
