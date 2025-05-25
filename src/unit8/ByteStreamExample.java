/* Byte Streams
Write a Java program that reads a file "input.txt" using a FileInputStream and writes its content to "output.txt" using a FileOutputStream.*/

package unit8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt")) {

            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }
            System.out.println("File copied successfully using byte streams.");
        } catch (IOException e) {
            System.out.println("An error occurred during file I/O.");
            e.printStackTrace();
        }
    }
}
