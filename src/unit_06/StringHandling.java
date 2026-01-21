// Write a Java program that creates two strings, concatenates them, and prints the result. Additionally, demonstrate the use of the StringBuilder class to achieve the same result.

package unit_06;

public class StringHandling {
    public static void main(String[] args) {
        // Using String concatenation
        String str1 = "Hello, ";
        String str2 = "World!";
        String result = str1.concat(str2);
        System.out.println("Using String concatenation: " + result);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);
        System.out.println("Using StringBuilder: " + sb.getClass() + " " + sb.toString());
    }
}