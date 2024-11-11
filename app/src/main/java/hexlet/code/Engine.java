package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUND = 3;

    public static void starting(String rules, String[][] data, String userName) {
        System.out.println(rules);
        Scanner scanner = new Scanner(System.in);
        int winround = 0;

        while (winround < ROUND) {
            String question = data[winround][0];
            String answer = data[winround][1];

            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            String useranswer = scanner.nextLine();

            if (useranswer.equals(answer)) {
                winround++;
                System.out.println("Correct!");
            } else {
                System.out.print("\"" + useranswer + "\"" + " is wrong answer ;(. Correct answer was "
                        + "\"" + answer + "\"" + ".\n" + "Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
