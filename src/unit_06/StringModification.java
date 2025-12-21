// Write a Java program that replaces all occurrences of a character in a string with another character and prints the result.

package unit_06;

public class StringModification {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String modifiedStr = str.replace('o', '0');
        
        System.out.println("Original string: " + str);
        System.out.println("Modified string: " + modifiedStr);
    }
}
