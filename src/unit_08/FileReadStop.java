package unit_08;

import java.io.*;
import java.util.*;
/**
 *
 * Program that inputs words from the user and saves the entered words,
 * one word per line, in a text file. The program terminates when the
 * user enters the word STOP (case insensitive).
 *
 */
public class FileReadStop {
    public static void main(String args[])
            throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word;
        String outFile;
        System.out.print("Enter the name of the output file: ");
        outFile = scanner.next();
        PrintWriter out = new PrintWriter(outFile);
        do {
            System.out.print("Enter a word (\"STOP\" to quit): ");
            word = scanner.next();
            if (!word.equalsIgnoreCase("STOP")) {
                // write word to file
                out.println(word);
            }
        } while (!word.equalsIgnoreCase("STOP"));
        out.close();
    }
}
