package hexlet.code;

import hexlet.code.games.Evengame;
import hexlet.code.games.Calcgame;
import hexlet.code.games.GCDgame;
import hexlet.code.games.Progressiongame;
import hexlet.code.games.Primegame;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;
    private static String userName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        try {
            int choice = sc.nextInt();
            if (choice == GREET) {
                hello();
            } else if (choice >= EVEN && choice <= PRIME) {
                System.out.println();
                hello();
                System.out.println();
                startGame(choice);
            } else if (choice == EXIT) {
                System.out.println("Exit");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.print("Wrong");
        }
    }
    public static void startGame(int choice) throws Exception {
        String rules;
        String[][] data;
        switch (choice) {
            case EVEN -> {
                rules = Evengame.gameinfo();
                data = Evengame.generateData();
            }
            case CALC -> {
                rules = Calcgame.gameinfo();
                data = Calcgame.generateData();
            }
            case GCD -> {
                rules = GCDgame.gameinfo();
                data = GCDgame.generateData();
            }
            case PROGRESSION -> {
                rules = Progressiongame.gameinfo();
                data = Progressiongame.generateData();
            }
            case PRIME -> {
                rules = Primegame.gameinfo();
                data = Primegame.generateData();
            }
            default -> throw new Exception("Invalid choice!");
        }
        Engine.starting(rules, data, userName);
    }

    public static void hello() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = sc.nextLine();
        System.out.print("Hello, " + userName + "!");
    }
}
