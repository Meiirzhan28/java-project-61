package hexlet.code;

import hexlet.code.games.Evengame;
import hexlet.code.games.Calcgame;
import hexlet.code.games.GCDgame;
import hexlet.code.games.Progressiongame;
import hexlet.code.games.Primegame;
import hexlet.code.rule.Gamerule;
import hexlet.code.rule.User;

import java.util.Scanner;

public class App {
    private static final int SIX = 6
    private static final int ONE = 1;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        User user = new User();
        try {
            int choice = sc.nextInt();
            if (choice > ONE && choice <= SIX) {
                user.hello();
                System.out.println();
                Engine engine = new Engine(createGame(choice));
                engine.starting();
            } else if (choice == 1) {
                user.hello();
            } else if (choice == 0) {
                System.out.println("Exit");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Wrong");
        }
    }
    public static Gamerule createGame(int choice) throws Exception {
        return switch (String.valueOf(choice)) {
            case "2" -> new Evengame();
            case "3" -> new Calcgame();
            case "4" -> new GCDgame();
            case "5" -> new Progressiongame();
            case "6" -> new Primegame();
            default -> throw new Exception("Invalid choice!");
        };
    }
}
