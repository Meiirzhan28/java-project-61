package hexlet.code.games;

import hexlet.code.rule.Gamerule;
import hexlet.code.Utils;

public class GCDgame implements Gamerule {
    @Override
    public String Gameinfo() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String Generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first +" "+ second;
    }

    @Override
    public String Getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.GCDresult(questions[0], questions[1]);
        return String.valueOf(result);
    }

    @Override
    public boolean Iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
