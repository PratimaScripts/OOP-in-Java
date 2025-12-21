/* Random Number Generation
Write a Java program that generates 5 random integers between 1 and 100 using the Random class and prints them.
*/
package unit_09;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Random integers between 1 and 100:");
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100)+1;
            System.out.println(randomNumber);
        }
    }
}
