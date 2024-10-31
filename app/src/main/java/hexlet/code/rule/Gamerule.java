package hexlet.code.rule;

public interface Gamerule{
    String Gameinfo();
    String Generatequestion();
    String Getcorrectanswer(String question);
    boolean Iscorrect(String useranswer,String correctanswer);
}
