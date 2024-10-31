package hexlet.code.games;


import hexlet.code.Cli;
import hexlet.code.Utils;

public class Evengame implements Cli.Gamerule {


    @Override
    public String gameinfo() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String generatequestion() {
        String question = String.valueOf(Utils.random());
        return question;
    }

    @Override
    public String getcorrectanswer(String question) {
        return Utils.iseven(question);
    }

    @Override
    public boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
