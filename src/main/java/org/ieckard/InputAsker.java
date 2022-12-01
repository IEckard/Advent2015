package org.ieckard;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InputAsker {
    private final Scanner scanner;
    private final PrintStream out;

    public InputAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public int ask(String message) {
        out.println(message);
        return scanner.nextInt();
    }
}
