// Write a Java program that searches for a substring within a given string and prints the index of its first occurrence.

package unit_06;

public class StringSearch {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String substr = "over";

        int index = str.indexOf(substr);
        System.out.println("..........." + index);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found.");
        }
    }
}