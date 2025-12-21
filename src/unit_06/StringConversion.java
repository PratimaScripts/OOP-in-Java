// Write a Java program that converts an integer to a string, then converts the string to uppercase and lowercase. Print each result.

package unit_06;

public class StringConversion {
    public static void main(String[] args) {
        // Convert integer to string
        int number = 123;
        String str = Integer.toString(number);
        System.out.println("Converted integer to string: " + str);
        
        // Convert string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("String in uppercase: " + upperStr);
        
        // Convert string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("String in lowercase: " + lowerStr);
    }
}
