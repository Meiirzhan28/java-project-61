package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

public class Progressiongame implements Cli.Gamerule {
    public String num;
    @Override
    public String gameinfo() {
        return "What number is missing in the progression?";
    }

    @Override
    public String generatequestion() {
        String[] res = Utils.progressionques();
        this.num = res[1];
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

