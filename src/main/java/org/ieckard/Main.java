package org.ieckard;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int dayChoice = getInt(new InputAsker(System.in, System.out));
        System.out.println("Your number was " + dayChoice);

    }

    public static int getInt(InputAsker asker) {
        int input = asker.ask("Give a number between 1 and 1");
        while (input < 1 || input > 1)
            input = asker.ask("Wrong number, try again.");
        return input;
    }
}