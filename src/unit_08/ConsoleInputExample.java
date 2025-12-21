/* Reading Console Input
Write a Java program that reads a line of text from the console using BufferedReader and prints it to the console.*/

package unit_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of text:");

        try {
            String line = reader.readLine();
            System.out.println("You entered: " + line);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}
