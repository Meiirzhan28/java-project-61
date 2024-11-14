package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    private static final int ROUND = 3;
    private static final String GAME_RULES = "Answer 'yes' if the number is even, otherwise answer 'no'." ;

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
            String question = String.valueOf(Utils.random());
            String answer = isEven(question) ? "yes" : "no";
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static boolean isEven(String question) {
        if (Integer.valueOf(question) % 2 == 0) {
            return true;
        }
        return false;
    }
}
