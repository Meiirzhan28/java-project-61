package hexlet.code;


import hexlet.code.games.Progressiongame;

import java.util.Random;

public class Utils {
    /// FOR EVEN GAME
    public static int random(){
        Random rand = new Random();
        return rand.nextInt(101);
    }
    public static String iseven(String question){
        if (Integer.valueOf(question)%2==0){
            return "yes";
        }
        return "no";
    }
    /// FOR EVEN GAME


    /// FOR CALC GAME
    public static String oper(){
        Random rand = new Random();
        int randomNum = rand.nextInt(2);
        String[] operand = new String[]{"-","+","*"};
        return operand[randomNum];
    }

    public static int calcresult(String first, String second, String operand){
        int result = 0;
        switch (operand){
            case "+" -> result = Integer.valueOf(first) + Integer.valueOf(second);
            case "-" -> result = Integer.valueOf(first) - Integer.valueOf(second);
            case "*" -> result = Integer.valueOf(first) * Integer.valueOf(second);
        }
        return result;
    }
    /// FOR CALC GAME


    /// FOR GCD GAME
    public static int GCDresult(String a, String b){
        int first = Math.max(Integer.valueOf(a), Integer.valueOf(b));
        int second = Math.min(Integer.valueOf(a), Integer.valueOf(b));
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
    /// FOR GCD GAME

    /// FOR PROGRESSION GAME
    public static String[] progressionques(){
        Random rand = new Random();
        int times = rand.nextInt(5,10);
        int start = random();
        int prognum = random();
        int secretnum = rand.nextInt(0, times);
        String result = "";
        String winnum = "";
        String[] finalresult = new String[2];
        for (int i = 0; i < times; i++) {
            if (i != secretnum) {
                result = result + " " + start;
                start = start + prognum;
            }else if (i == secretnum){
                result = result + " ..";
                winnum += String.valueOf(start);
                start = start + prognum;
            }
        }
        finalresult[0] = result;
        finalresult[1] = winnum;
        return finalresult;
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
