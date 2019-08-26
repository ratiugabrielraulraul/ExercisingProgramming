package org.fasttrackit;

import java.util.Scanner;

public class SayHello {
    private String input;

    public void run() {
        listenForInput();
        printOutput();
    }

    private void listenForInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        while (! scanner.hasNext("^[a-zA-Z]+$")) {
            System.out.println("Enter a valid name");
            scanner.next();
        }
        this.input = scanner.next();
    }

    private void printOutput() {
        System.out.println("Hello, " + this.input + " have a good day!");
    }
}
