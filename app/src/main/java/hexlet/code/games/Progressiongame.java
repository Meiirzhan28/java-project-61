package hexlet.code.games;

import hexlet.code.Gamerule;
import hexlet.code.Utils;

public class Progressiongame implements Gamerule {
    public String num;
    @Override
    public String Gameinfo() {
        return "What number is missing in the progression?";
    }

    @Override
    public String Generatequestion() {
        String[] res = Utils.progressionques();
        this.num = res[1];
        return res[0];
    }

    @Override
    public String Getcorrectanswer(String question) {
        return this.num;
    }

    @Override
    public boolean Iscorrect(String useranswer, String correctanswer) {
        return correctanswer.equals(useranswer);
    }
}

