// Write a Java program that extracts and prints the first and last character of a given string.

package unit6;

public class CharacterExtraction {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char firstChar = str.charAt(0);
        
        System.out.println(str.length());
        
        char lastChar = str.charAt(str.length() - 1);
        
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);
    }
}
