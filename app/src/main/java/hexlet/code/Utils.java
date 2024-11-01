package hexlet.code;

import java.util.Random;

public class Utils {
    /// FOR EVEN GAME
    public static int random() {
        Random rand = new Random();
        return rand.nextInt(101);
    }
    public static String iseven(String question) {
        if (Integer.valueOf(question) % 2 == 0) {
            return "yes";
        }
        return "no";
    }
    /// FOR EVEN GAME


    /// FOR CALC GAME
    public static String oper() {
        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        String[] operand = new String[]{"-", "+", "*"};
        return operand[randomNum];
    }

    public static int calcresult(String first, String second, String operand) {
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);

        return switch (operand) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> 0;
        };
    }



    /// FOR CALC GAME


    /// FOR GCD GAME
    public static int gCdresult(String a, String b) {
        int first = Math.max(Integer.valueOf(a), Integer.valueOf(b));
        int second = Math.min(Integer.valueOf(a), Integer.valueOf(b));
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
    /// FOR GCD GAME

    /// FOR PROGRESSION GAME
    public static String[] progressionques() {
        Random rand = new Random();
        int times = rand.nextInt(5, 10);
        int start = random();
        int prognum = random();
        int secretnum = rand.nextInt(0, times);
        String winnum = "";
        String[] finalresult = new String[times+1];
        for (int i = 0; i < times; i++) {
            if (i != secretnum ) {
                finalresult[i] = String.valueOf(start);
                start = start + prognum;
            } else if (i == secretnum) {
                finalresult[i] = "..";
                winnum += String.valueOf(start);
                start = start + prognum;
            }
        }
        finalresult[times] = winnum;
        return resultProgress(finalresult);
    }

    public static String[] resultProgress(String[] str){
        String[] result = new String[2];
        String ab = str[0];
        for (int i = 1; i < str.length-1; i++) {
            ab = ab + " " + str[i];
        }
        result[0] = ab;
        result[1] = str[str.length-1];
        return result;
    }


    public static String prime(String num) {
        int a = Integer.parseInt(num);
        if (a <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return "no";
            }
        }

        return "yes";
    }
}
