package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

public class Calcgame implements Cli.Gamerule {

    @Override
    public String gameinfo() {
        return "What is the result of the expression?";
    }

    @Override
    public String generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first + " " + Utils.oper() + " " + second;
    }

    @Override
    public String getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.calcresult(questions[0], questions[2], questions[1]);
        return String.valueOf(result);
    }

    @Override
    public boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
