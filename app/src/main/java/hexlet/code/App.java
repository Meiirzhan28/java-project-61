package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice != 0 && choice <= 6) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = Cli.name();
            System.out.println("Hello, " + name);
            if (choice > 1) {
                if (start.starting(choice)) {
                    System.out.println("Congratulations, " + name);
                } else {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" + "Let's try again, " + name + "!");
                }
            }
        } else {
            System.out.println("Sorry, but you are out of game number!");
        }
    }
}
