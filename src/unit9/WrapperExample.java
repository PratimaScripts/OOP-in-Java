/*Write a Java program that demonstrates the use of wrapper classes by converting a string to an integer, double, and boolean. 
Perform arithmetic operations with the integer and double values, and print the results.*/

package unit9;

public class WrapperExample {
    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "45.67";
        String strBool = "true";

        Integer intValue = Integer.parseInt(strInt);
        Double doubleValue = Double.parseDouble(strDouble);
        Boolean boolValue = Boolean.parseBoolean(strBool);

        int intResult = intValue + 10;
        double doubleResult = doubleValue * 2;

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Boolean value: " + boolValue);
        System.out.println("Integer result after addition: " + intResult);
        System.out.println("Double result after multiplication: " + doubleResult);
    }
}
