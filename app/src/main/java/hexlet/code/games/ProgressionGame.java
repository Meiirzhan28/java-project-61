package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    private static final int MIN_LIMIT = 5;
    private static final int MAX_LIMIT = 10;
    private static final int ROUND = 3;

    private static String gameInfo() {
        return "What number is missing in the progression?";
    }

    public static void gameStart(String username) {
        String rules = gameInfo();
        String[][] data = generateData();
        Engine.starting(rules, data, username);
    }

    private static String[][] generateData() {
        String[][] data = new String[ROUND][2];
        for (int i = 0; i < ROUND; i++) {
            int length = Utils.random(MIN_LIMIT, MAX_LIMIT);
            int start = Utils.random();
            int step = Utils.random();

            String[] progressionData = generateProgressionQuestion(start, step, length);
            data[i][0] = progressionData[0];
            data[i][1] = progressionData[1];
        }
        return data;
    }

    private static String[] generateProgression(int start, int step, int length) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }

    private static String[] generateProgressionQuestion(int start, int step, int length) {
        String[] progression = generateProgression(start, step, length);
        int hiddenIndex = Utils.random(0, length - 1);
        String correctAnswer = progression[hiddenIndex];

        progression[hiddenIndex] = "..";
        String question = String.join(" ", progression);

        return new String[] {question, correctAnswer};
    }
}

