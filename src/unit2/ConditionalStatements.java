package unit2;

public class ConditionalStatements {
    public static void main(String[] args) {
        int num = 10;

        // if statement: Executes a block of code if a specified condition is true.

        if (num > 0) {
            System.out.println("Positive number");
        }

        // if-else statement: Executes one block of code if a specified condition is true and another block if it is false.
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if-else-if statement: Allows you to test multiple conditions and execute a block of code based on the first condition that is true.
        if (num < 0) {
            System.out.println("Negative number");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive number");
        }

        // switch statement: Provides multiple paths of execution based on the value of an expression.
        switch (num) {
            case (0):
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            default:
                System.out.println("Other");
        }
    }
}
