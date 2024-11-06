package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Random;

public class Calcgame {
    private static final int ROUND = 3;

    public static String gameinfo() {
        return "What is the result of the expression?";
    }

    public static String[][] generateData() {
        String[][] data = new String[ROUND][2];

        for (int i = 0; i < ROUND; i++) {
            int first = Utils.random();
            int second = Utils.random();
            String operand = oper();
            String question = first + " " + operand + " " + second;
            String answer = String.valueOf(calcresult(first, second, operand));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    public static String oper() {
        String[] operands = new String[]{"+", "-", "*"};
        Random rand = new Random();
        int randomNum = rand.nextInt(2); // Рандомное число для выбора операнда
        return operands[randomNum];
    }

    public static int calcresult(int first, int second, String operand) {
        return switch (operand) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> 0;
        };
    }
}
