/* Using java.io Package
Write a Java program that uses classes from the java.io package to create a new directory named "TestDir" and a new file named "TestFile.txt" inside that directory.*/

package unit8;

import java.io.File;
import java.io.IOException;

public class CreateDirectoryAndFile {
    public static void main(String[] args) {
        File dir = new File("TestDir");
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created: " + dir.getName());
        }

        File file = new File(dir, "TestFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}
