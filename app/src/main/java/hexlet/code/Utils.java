package hexlet.code;

import java.util.Random;

public class Utils {
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
}
