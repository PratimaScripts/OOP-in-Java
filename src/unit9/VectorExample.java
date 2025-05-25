/* Using java.util.Vector
Write a Java program that creates a Vector of integers, adds elements to it, removes an element, and iterates through the elements to print them.
*/
package unit9;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        // Removing an element
        vector.remove(2);

        // Iterating through elements
        System.out.println("Vector elements:");
        for (Integer num : vector) {
            System.out.println(num);
        }
    }
}
