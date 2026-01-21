package Utilities;

import java.io.IOException;
import java.util.Scanner;

class InLineScannerMethod {
    public static void main(String args[]) throws IOException {

        String fin = "Name: Tom Age: 28 ID: 77";

        Scanner src = new Scanner(fin);

        src.findInLine("Tom"); // Find Age

        if (src.hasNext())
            System.out.println(src.next());
        else
            System.out.println("*******ERROR**********");

    }

}