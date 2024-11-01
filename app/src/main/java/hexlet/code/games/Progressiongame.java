package hexlet.code.games;

import hexlet.code.rule.Gamerule;
import hexlet.code.Utils;

public class Progressiongame implements Gamerule {
    public String num;
    @Override
    public String gameinfo() {
        return "What number is missing in the progression?";
    }

    @Override
    public String generatequestion() {
        String[] res = Utils.progressionques();
        this.num = res[1];
        System.out.println(res[0]);
        return res[0];
    }

    @Override
    public String getcorrectanswer(String question) {
        return this.num;
    }

    @Override
    public boolean iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}

