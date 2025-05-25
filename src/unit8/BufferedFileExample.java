/* Reading and Writing Files
Write a Java program that reads content from "input.txt" and writes the same content to "output.txt" using BufferedReader and BufferedWriter.*/

package unit8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedFileExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("File copied successfully using buffered streams.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
            e.printStackTrace();
        }
    }
}
