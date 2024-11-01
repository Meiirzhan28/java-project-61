package hexlet.code.rule;

import hexlet.code.Cli;

public final class User {
    private static String name;

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public void hello() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setName(Cli.name());
        System.out.print("Hello, " + name + "!");
    }
}
