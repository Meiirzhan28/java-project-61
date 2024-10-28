package hexlet.code;

import hexlet.code.games.Evengame;

public class start {
    public static boolean starting(int gameOfplay){
        switch(gameOfplay){
            case 2: return Evengame.evengame();
        }
        return false;
    }
}
