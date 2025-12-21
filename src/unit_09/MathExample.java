// Write a Java program that calculates and prints the square root, power, and absolute value of a given number using methods from the Math class.

package unit_09;

public class MathExample {
    public static void main(String[] args) {
        double number = -8.5;

        double squareRoot = Math.sqrt(Math.abs(number));
        double power = Math.pow(number, 2);
        double absoluteValue = Math.abs(number);

        System.out.println("Square root of " + Math.abs(number) + " is: " + squareRoot);
        System.out.println(number + " to the power of 2 is: " + power);
        System.out.println("Absolute value of " + number + " is: " + absoluteValue);
    }
}