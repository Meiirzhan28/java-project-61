package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class CalcGame {
    private static final int ROUND = 3;
    private static final String GAME_RULES = "What is the result of the expression?";

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
            String operand = randomOperator();
            String question = first + " " + operand + " " + second;
            String answer = String.valueOf(calculate(first, second, operand));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static String randomOperator() {
        String[] operands = new String[]{"+", "-", "*"};
        Random rand = new Random();
        int randomNum = rand.nextInt(2); // Рандомное число для выбора операнда
        return operands[randomNum];
    }

    private static int calculate(int first, int second, String operand) {
        return switch (operand) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> throw new Error();
        };
    }
}
