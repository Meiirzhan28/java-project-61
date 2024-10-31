package hexlet.code.games;


import hexlet.code.rule.Gamerule;
import hexlet.code.Utils;

public class Evengame implements Gamerule {


    @Override
    public String Gameinfo() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String Generatequestion() {
        String question = String.valueOf(Utils.random());
        return question ;
    }

    @Override
    public String Getcorrectanswer(String question) {
        return Utils.iseven(question);
    }

    @Override
    public boolean Iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
