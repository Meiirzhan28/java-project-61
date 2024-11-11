package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static String getName() {
        return name;
    }

    public static void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        name = (scanner.nextLine());
        System.out.print("Hello, " + name + "!");
    }
}
