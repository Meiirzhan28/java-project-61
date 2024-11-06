package hexlet.code.games;

import hexlet.code.Utils;

public class GCDgame  {

    public static String gameinfo() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static final String[][] generateData() {
        String[][] data = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int first = Utils.random();
            int second = Utils.random();
            String question = first + " " + second;
            String answer = String.valueOf(gCdresult(first, second));
            data[i][0] = question;
            data[i][1] = answer;
        }
        return data;
    }

    public static int gCdresult(int a, int b) {
        int first = Math.max(a, b);
        int second = Math.min(a, b);
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

}
