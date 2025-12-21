// Write a Java program that demonstrates the use of StringBuffer to reverse a string and then append a new string to it.

package unit_06;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        
        // Reversing the string
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
        
        // Appending a new string
        sb.append(" Welcome to Java.");
        System.out.println("After appending: " + sb.toString());
    }
}
