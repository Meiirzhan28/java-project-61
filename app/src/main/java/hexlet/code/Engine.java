package hexlet.code;

import hexlet.code.rule.Gamerule;
import hexlet.code.rule.User;

import java.util.Scanner;

public class Engine {
    private final Gamerule game;
    private String correctanswer;
    private String useranswer;
    public Engine(Gamerule game) {
        this.game = game;
    }

    public void starting(){
        System.out.println(game.Gameinfo());
        Scanner scanner = new Scanner(System.in);
        int winround = 0;
        while (winround < 3) {
            String question = game.Generatequestion();
            System.out.println("Question: " + question);
            System.out.println("Your answer: ");
            useranswer = scanner.nextLine();
            correctanswer = game.Getcorrectanswer(question);
            if(game.Iscorrect(useranswer, correctanswer)){
              winround++;
              System.out.println("Correct!");
            }else{
                break;
            }
        }
        if (winround==3){
            System.out.println("Congratulations, " + User.name);
        } else {
            System.out.print("\"" +useranswer + "\"" + " is wrong answer ;(. Correct answer was "+ "\"" +correctanswer + "\"" + ".\n" + "Let's try again, " + User.name + "!");
        }
    }

}
