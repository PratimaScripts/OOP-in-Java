/* Writing Console Output
Write a Java program that prompts the user for their name and age, then prints a message to the console using PrintWriter.*/

package unit8;

import java.io.PrintWriter;

public class ConsoleOutputExample {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);

        writer.println("Enter your name:");
        String name = System.console().readLine();

        writer.println("Enter your age:");
        int age = Integer.parseInt(System.console().readLine());

        writer.printf("Hello, %s! You are %d years old.\n", name, age);
    }
}
