package org.fasttrackit;

public class PrintingQuotes {
    private String author;
    String s1 = "Obi-Wan Kenobi";

    public void run() {
        promptsQuotes();
    }

    private void promptsQuotes() {
        System.out.println("What Is the Quote?" + "These aren't the droids you're looking for." +  "\n" +
              "Who said it? Obi-Wan Kenobi" +"\n" +
                "Obi-Wan Kenobi says, \"These aren't the droids\n" +
                "you're looking for.\"");



    }
}





