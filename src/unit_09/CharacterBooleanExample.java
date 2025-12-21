/* Using java.lang.Character and java.lang.Boolean
Write a Java program that checks if a given character is a digit, a letter, and its uppercase version. Also, demonstrate the use of the Boolean class by parsing a string to a boolean value.
*/

package unit_09;

public class CharacterBooleanExample {
    public static void main(String[] args) {
        char ch = 'a';
        String boolStr = "true";

        // Checking character properties
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        char upperCaseChar = Character.toUpperCase(ch);

        // Parsing string to boolean
        boolean boolValue = Boolean.parseBoolean(boolStr);

        System.out.println("Character: " + ch);
        System.out.println("Is digit: " + isDigit);
        System.out.println("Is letter: " + isLetter);
        System.out.println("Uppercase version: " + upperCaseChar);
        System.out.println("Boolean value: " + boolValue);
    }
}
