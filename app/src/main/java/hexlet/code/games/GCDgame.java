package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDgame  {
    private static final int ROUND = 3;

    private static String gameinfo() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static void gamestart(String username) {
        String rules = gameinfo();
        String[][] data = generateData();
        Engine.starting(rules, data, username);
    }

    private static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            int first = Utils.random(0, 101);
            int second = Utils.random(0, 101);
            String question = first + " " + second;
            String answer = String.valueOf(gCdresult(first, second));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static int gCdresult(int a, int b) {
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
