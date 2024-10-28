package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Evengame {
    public static boolean evengame() {
        Scanner sc = new Scanner(System.in);
        int correctanswer = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (correctanswer < 3) {
            int rand = random();
            System.out.println("Question: " + rand);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            if (iseven(rand).equals(answer)) {
                correctanswer += 1;
                System.out.println("Correct!");
            } else {
                return false;
            }
        }
        return true;
    }

    public static int random(){
        Random rand = new Random();
        return rand.nextInt(101);
    }
    public static String iseven(int numb){
        if (numb%2==0){
            return "yes";
        }
        return "no";
    }
}
