package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Evengame {
    private static final int ROUND = 3;

    private static String gameinfo() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static void gamestart(String username) {
        String rules = gameinfo();
        String[][] data = generateData();
        Engine.starting(rules, data, username);
    }

    private static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            String question = String.valueOf(Utils.random());
            String answer = iseven(question) ? "yes" : "no";
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static boolean iseven(String question) {
        if (Integer.valueOf(question) % 2 == 0) {
            return true;
        }
        return false;
    }
}
