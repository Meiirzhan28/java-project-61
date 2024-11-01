package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.rule.Gamerule;

public class Calcgame implements Gamerule {

    @Override
    public final String gameinfo() {
        return "What is the result of the expression?";
    }

    @Override
    public final String generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first + " " + Utils.oper() + " " + second;
    }

    @Override
    public final String getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.calcresult(questions[0], questions[2], questions[1]);
        return String.valueOf(result);
    }

    @Override
    public final boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
