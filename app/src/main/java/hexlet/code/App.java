package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;


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
                Cli.hello();
            } else if (choice >= EVEN && choice <= PRIME) {
                System.out.println();
                Cli.hello();
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
        userName = Cli.getName();
        switch (choice) {
            case EVEN -> {
                EvenGame.gameStart(userName);
            }
            case CALC -> {
                CalcGame.gameStart(userName);
            }
            case GCD -> {
                GcdGame.gameStart(userName);
            }
            case PROGRESSION -> {
                ProgressionGame.gameStart(userName);
            }
            case PRIME -> {
                PrimeGame.gameStart(userName);
            }
            default -> throw new Exception("Invalid choice!");
        }
    }
}
