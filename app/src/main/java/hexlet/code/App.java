package hexlet.code;

import hexlet.code.games.Calcgame;
import hexlet.code.games.Evengame;
import hexlet.code.games.GCDgame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        Gamerule game = null;
        try {
            int choice = sc.nextInt();
            if (choice > 1 && choice <= 6) {
                User.Hello();
                switch (choice) {
                    case 2 -> game = new Evengame();
                    case 3 -> game = new Calcgame();
                    case 4 -> game = new GCDgame();
                    case 5 -> game =new Evengame();
                    case 6 -> game =new Evengame();
                }
                Engine engine = new Engine(game);
                engine.starting();
            }else if (choice == 1) {
                User.Hello();
            }else {
                System.out.println("Exit");
            }
        }catch (Exception e) {
            System.out.print("ERRORR");
        }
    }
}
