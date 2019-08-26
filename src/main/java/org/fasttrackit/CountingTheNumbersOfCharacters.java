package org.fasttrackit;

import java.util.Scanner;

public class CountingTheNumbersOfCharacters {
    private String input;
    String s1 = "Homer";

   public void run () {
        stringLenght();
    }


    private void stringLenght() {
        System.out.println("What is the input string ?" + s1);
        System.out.println(s1 + " has"+ " " + s1.length()+ " " +"characters");

    }
}
