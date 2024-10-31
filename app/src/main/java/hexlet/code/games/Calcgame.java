package hexlet.code.games;

import hexlet.code.rule.Gamerule;
import hexlet.code.Utils;

public class Calcgame implements Gamerule {

    @Override
    public String Gameinfo() {
        return "What is the result of the expression?";
    }

    @Override
    public String Generatequestion() {
        int first = Utils.random();
        int second = Utils.random();
        return first +" "+ Utils.oper() +" "+ second ;
    }

    @Override
    public String Getcorrectanswer(String question) {
        String[] questions = question.split(" ");
        int result = Utils.calcresult(questions[0], questions[2],questions[1]);
        return String.valueOf(result);
    }

    @Override
    public boolean Iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}
