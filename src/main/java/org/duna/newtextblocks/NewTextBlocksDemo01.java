package org.duna.newtextblocks;

public class NewTextBlocksDemo01 {
    public static void main(String[] args) {

        String multiline = "Java 14 Features - New Text Blocks - Preview Features.";

        System.out.println(multiline);

        /*
            \s: to indicate a single space
            \: to indicate the end of the line, so that a new line character is not introduced
         */
        String multiline2 = """
                Java 14 Features\s\
                - New Text Blocks\s\
                - Preview Features.""";

        System.out.println(multiline2);

    }
}
