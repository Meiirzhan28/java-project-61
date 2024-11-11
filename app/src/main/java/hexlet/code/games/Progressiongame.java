package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Progressiongame {
    private static final int MIN_LIMIT = 5;
    private static final int MAX_LIMIT = 10;
    private static final int ROUND = 3;
    private static String gameinfo() {
        return "What number is missing in the progression?";
    }

    public static void gamestart(String username) {
        String rules = gameinfo();
        String[][] data = generateData();
        Engine.starting(rules, data, username);
    }

    private static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            String[] progressionData = progressionques();
            data[i][0] = progressionData[0];
            data[i][1] = progressionData[1];
        }
        return data;
    }

    private static String[] progressionques() {
        Random rand = new Random();
        int times = rand.nextInt(MIN_LIMIT, MAX_LIMIT);
        int start = Utils.random(0, 101);
        int prognum = Utils.random(0, 101);
        int secretnum = rand.nextInt(0, times);
        String winnum = "";
        String[] finalresult = new String[times];

        for (int i = 0; i < times; i++) {
            if (i != secretnum) {
                finalresult[i] = String.valueOf(start);
                start = start + prognum;
            } else {
                finalresult[i] = "..";
                winnum = String.valueOf(start);
                start = start + prognum;
            }
        }
        return resultProgress(finalresult, winnum);
    }

    private static String[] resultProgress(String[] str, String answer) {
        String[] result = new String[2];
        StringBuilder question = new StringBuilder(str[0]);
        for (int i = 1; i < str.length; i++) {
            question.append(" ").append(str[i]);
        }
        result[0] = question.toString();
        result[1] = answer;
        return result;
    }
}

