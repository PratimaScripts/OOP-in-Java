package unit2;

/**
 * @author prati
 */

public class LoopingStatements {
    public static void main(String[] args) {

        // while loop: Executes a block of code repeatedly as long as a specified condition is true.
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop: Similar to while loop, but it executes the block of code at least once before checking the condition.
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // for loop: Executes a block of code repeatedly for a specified number of times.
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        // foreach loop: Iterates over elements of arrays or collections.
        int[] numbers = {1, 2, 3, 4, 5};

        for (int num: numbers) { //The Element on the left should be of the same datatype of the array or one that can be converted into 
            System.out.println(num);
        }

        /*String[] numbes={"aa","bb"};

        for (String a:numbes){
            System.out.println(a);
        }*/
    }
}
