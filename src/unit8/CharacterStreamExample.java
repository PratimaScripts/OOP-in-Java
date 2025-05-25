/* Character Streams
Write a Java program that reads a file "input.txt" using a FileReader and writes its content to "output.txt" using a FileWriter.*/

package unit8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("input.txt");
             FileWriter fw = new FileWriter("output.txt")) {

            int charContent;
            while ((charContent = fr.read()) != -1) {
                fw.write(charContent);
            }
            System.out.println("File copied successfully using character streams.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
            e.printStackTrace();
        }
    }
}
