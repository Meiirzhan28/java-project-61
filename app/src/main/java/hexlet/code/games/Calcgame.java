package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calcgame {
    private static final int ROUND = 3;

    private static String gameinfo() {
        return "What is the result of the expression?";
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
            String operand = oper();
            String question = first + " " + operand + " " + second;
            String answer = String.valueOf(calcresult(first, second, operand));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    private static String oper() {
        String[] operands = new String[]{"+", "-", "*"};
        Random rand = new Random();
        int randomNum = rand.nextInt(2); // Рандомное число для выбора операнда
        return operands[randomNum];
    }

    private static int calcresult(int first, int second, String operand) {
        return switch (operand) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> throw new Error();
        };
    }
}
