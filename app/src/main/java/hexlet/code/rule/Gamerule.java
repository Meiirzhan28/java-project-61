package hexlet.code.rule;

public interface Gamerule {
    String gameinfo();
    String generatequestion();
    String getcorrectanswer(String question);
    boolean iscorrect(String useranswer, String correctanswer);
}