// Write a Java program that compares two strings using both equals and compareTo methods and prints the results.

package unit_06;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        
        // Using equals method
        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals method: " + areEqual);
        
        // Using compareTo method
        int comparisonResult = str1.compareTo(str2);
        System.out.println("Using compareTo method: " + comparisonResult);
    }
}