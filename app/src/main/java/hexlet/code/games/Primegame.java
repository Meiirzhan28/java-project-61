package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

public class Primegame implements Cli.Gamerule {
    @Override
    public String gameinfo() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String generatequestion() {
        String question = String.valueOf(Utils.random());
        return question;
    }

    @Override
    public String getcorrectanswer(String question) {
        return Utils.prime(question);
    }

    @Override
    public boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
