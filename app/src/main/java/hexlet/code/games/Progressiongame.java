package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Random;

public class Progressiongame {
    private static final int MIN_LIMIT = 5;
    private static final int MAX_LIMIT = 10;

    public static String gameinfo() {
        return "What number is missing in the progression?";
    }


    public static String[][] generateData() {
        String[][] data = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String[] progressionData = progressionques();
            data[i][0] = progressionData[0];
            data[i][1] = progressionData[1];
        }
        return data;
    }

    public static String[] progressionques() {
        Random rand = new Random();
        int times = rand.nextInt(MIN_LIMIT, MAX_LIMIT);
        int start = Utils.random();
        int prognum = Utils.random();
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


    public static String[] resultProgress(String[] str, String answer) {
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

