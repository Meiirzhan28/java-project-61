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
}
