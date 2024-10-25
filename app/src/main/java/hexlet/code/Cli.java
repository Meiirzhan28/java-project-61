package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name(){
        Scanner sc = new Scanner(System.in);
        return "Hello, " + sc.nextLine();
    }
}
