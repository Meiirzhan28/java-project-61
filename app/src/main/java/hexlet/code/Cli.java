package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static interface Gamerule {
        String gameinfo();
        String generatequestion();
        String getcorrectanswer(String question);
        boolean iscorrect(String useranswer, String correctanswer);
    }

    public static class User {
        public static String name;
        public static void hello() {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            name = name();
            System.out.println("Hello, " + name + "!");
        }
    }
}
