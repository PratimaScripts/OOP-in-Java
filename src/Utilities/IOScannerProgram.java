package Utilities;

import java.io.*;

class IOScannerProgram {
    public static void main(String args[]) throws IOException {
        try {
            File fileIn = new File("c:/files/Sri.txt");
            File fileOut = new File("c:/files/Finalbatch.txt");

            FileInputStream streamIn = new FileInputStream(fileIn);
            FileOutputStream streamOut = new FileOutputStream(fileOut);

            int c;
            while ((c = streamIn.read()) != -1) {
                streamOut.write(c);
            }

            streamIn.close();
            streamOut.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileCopy: " + e);
        } catch (IOException e) {
            System.err.println("FileCopy: " + e);
        }
    }
}
