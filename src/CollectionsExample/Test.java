package CollectionsExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class Test {
 
    public static void main(String[] args) {
        int tableSize = 256;
        int keys = 200000;
        System.out.println("Start");
        testHashMapInteger(new Hashtable(tableSize), keys);
        testHashMapInteger(new HashMap(tableSize), keys);
        testHashMapInteger(new LinkedHashMap(tableSize), keys);
        testHashMapDoubleSquared(new Hashtable(tableSize), keys);
        testHashMapDoubleSquared(new HashMap(tableSize), keys);
        testHashMapDoubleSquared(new LinkedHashMap(tableSize), keys);
        System.out.println("End");
    }
 
    public static void testHashMapInteger(Map map, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            map.put(new Integer(i), new Integer(i));
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            map.get(new Integer(i));
        }
        long end = System.currentTimeMillis();
        long final1 = end - start;
        System.out.println("Integer key test");
        System.out.println(
                map.getClass().getName() + " middle time: " + (middle - start));
        System.out.println(map.getClass().getName() + " time: " + final1);
    }
 
    public static void testHashMapDoubleSquared(Map map, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            map.put(new Double(i * i), new Integer(i));
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            map.get(new Double(i * i));
        }
        long end = System.currentTimeMillis();
        long final1 = end - start;
        System.out.println("Double Squared key test");
        System.out.println(
                map.getClass().getName() + " middle time: " + (middle - start));
        System.out.println(map.getClass().getName() + " time: " + final1);
    }
 
}

