package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

public class GCDgame implements Cli.Gamerule {
    @Override
    public String gameinfo() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first + " " + second;
    }

    @Override
    public String getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.gCdresult(questions[0], questions[1]);
        return String.valueOf(result);
    }

    @Override
    public boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
