package hexlet.code;

import java.util.Scanner;

public class Engine {
    private final Cli.Gamerule game;
    private String correctanswer;
    private String useranswer;
    public Engine(Cli.Gamerule game) {
        this.game = game;
    }

    public void starting() {
        System.out.println(game.gameinfo());
        Scanner scanner = new Scanner(System.in);
        int winround = 0;
        while (winround < 3) {
            String question = game.generatequestion();
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            useranswer = scanner.nextLine();
            correctanswer = game.getcorrectanswer(question);
            if (game.iscorrect(useranswer, correctanswer)) {
                winround++;
                System.out.println("Correct!");
            } else {
                break;
            }
        }
        if (winround == 3) {
            System.out.println("Congratulations, " + Cli.User.name);
        } else {
            System.out.print("\"" + useranswer + "\"" + " is wrong answer ;(. Correct answer was "
                    + "\"" + correctanswer + "\"" + ".\n" + "Let's try again, " + Cli.User.name + "!");
        }
    }

}
