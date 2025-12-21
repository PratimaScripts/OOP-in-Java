/* Using java.util.Dictionary and java.util.Hashtable
Write a Java program that creates a Hashtable (which is a subclass of Dictionary), adds key-value pairs, retrieves a value using a key, and iterates through the keys and values.
*/
package unit_09;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Retrieving a value
        int value = hashtable.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Iterating through keys and values
        Enumeration<String> keys = hashtable.keys();
        System.out.println("Hashtable contents:");
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + hashtable.get(key));
        }
    }
}
