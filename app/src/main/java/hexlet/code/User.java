package hexlet.code;

import java.util.Scanner;

public class User {
    public static String name;
    public static void Hello(){
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = Cli.name();
        System.out.println("Hello, " + name + "!");
    }
}
