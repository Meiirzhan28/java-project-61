package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.rule.Gamerule;

public class GCDgame implements Gamerule {
    @Override
    public final String gameinfo() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public final String generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first + " " + second;
    }

    @Override
    public final String getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.gCdresult(questions[0], questions[1]);
        return String.valueOf(result);
    }

    @Override
    public final boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
