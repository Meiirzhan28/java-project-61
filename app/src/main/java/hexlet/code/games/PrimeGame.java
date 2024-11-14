package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame  {
    private static final int ROUND = 3;
    private static final String GAME_RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static String gameInfo() {
        return GAME_RULES;
    }

    public static void gameStart(String username) {
        String rules = gameInfo();
        String[][] data = generateData();
        Engine.starting(rules, data, username);
    }

    private static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            String num = String.valueOf(Utils.random());
            String correctAnswer = "";
            if (isPrime(num)) {
                correctAnswer = correctAnswer + "yes";
            } else {
                correctAnswer = correctAnswer + "no";
            }
            data[i][0] = num;
            data[i][1] = correctAnswer;
        }
        return data;
    }

    private static boolean isPrime(String num) {
        int a = Integer.parseInt(num);
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
