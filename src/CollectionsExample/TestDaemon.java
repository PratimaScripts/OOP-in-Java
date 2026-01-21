package CollectionsExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestDaemon {
    private class HashObject {
        private int i_ = 0;

        HashObject(int i) {
            i_ = i;
        }

        public boolean equals(Object o) {
            boolean ret = false;
            if (o instanceof HashObject) {
                ret = (((HashObject) o).i_ == i_);
            }
            return ret;
        }

        public int hashCode() {
            return new Integer(i_).hashCode();
        }
    }

    private void runTest() {
        int tableSize = 260000;
        int iterations = 200000;
        System.out.println("Start");
        Map hashMap = new HashMap(tableSize);
        Map hashTable = new Hashtable(tableSize);
        test(hashMap, iterations);
        test(hashTable, iterations);
        System.out.println("End");
    }

    public static void main(String[] args) {
        TestDaemon instance = new TestDaemon();
        instance.runTest();
    }

    public void test(Map map, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            HashObject obj = new HashObject(i);
            map.put(obj, obj);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            map.get(new HashObject(i));
        }
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println(map.getClass().getName() + " insertion time: " + (middle - start));
        System.out.println(map.getClass().getName() + " total time: " + total);
    }
} 