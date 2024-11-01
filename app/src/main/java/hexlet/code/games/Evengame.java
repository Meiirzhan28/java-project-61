package hexlet.code.games;



import hexlet.code.Utils;
import hexlet.code.rule.Gamerule;

public class Evengame implements Gamerule {


    @Override
    public final String gameinfo() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public final String generatequestion() {
        String question = String.valueOf(Utils.random());
        return question;
    }

    @Override
    public final String getcorrectanswer(String question) {
        return Utils.iseven(question);
    }

    @Override
    public final boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
