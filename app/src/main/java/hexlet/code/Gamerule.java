package hexlet.code;

import java.util.Random;

public interface Gamerule{
    String Gameinfo();
    String Generatequestion();
    String Getcorrectanswer(String question);
    boolean Iscorrect(String useranswer,String correctanswer);
}
