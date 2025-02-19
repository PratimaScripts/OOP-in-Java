package unit2;

public class TransferStatements {

    //statement: Exits the current method and optionally returns a value.
    public static int add(int a, int b) {
        return a + b; // This line returns the sum of 'a' and 'b'
    }

    public static void main(String[] args) {
        // break statement: Terminates the loop or switch statement it is within.

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        // continue statement: Skips the remaining code in the current iteration of a loop and proceeds to the next iteration.

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        // Method to add two numbers and return the result

        int result = add(3, 4);

        System.out.println("Result: " + result);

    }

    // Method to add two numbers and return the result
}
