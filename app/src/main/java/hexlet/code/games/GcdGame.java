package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GcdGame  {
    private static final int ROUND = 3;
    private static final String GAME_RULES = "Find the greatest common divisor of given numbers.";

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
            int first = Utils.random();
            int second = Utils.random();
            String question = first + " " + second;
            String answer = String.valueOf(calculate(first, second));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static int calculate(int a, int b) {
        int first = Math.max(a, b);
        int second = Math.min(a, b);
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
