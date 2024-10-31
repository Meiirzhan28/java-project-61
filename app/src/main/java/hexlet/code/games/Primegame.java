package hexlet.code.games;

import hexlet.code.rule.Gamerule;
import hexlet.code.Utils;

public class Primegame implements Gamerule {
    @Override
    public String Gameinfo() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String Generatequestion() {
        String question = String.valueOf(Utils.random());
        return question;
    }

    @Override
    public String Getcorrectanswer(String question) {
        return Utils.prime(question);
    }

    @Override
    public boolean Iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
