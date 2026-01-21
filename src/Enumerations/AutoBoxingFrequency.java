package Chapter_12_Enumerations;

import java.util.*;

public class AutoBoxingFrequency {
    public static void main(String[] args) {

        Integer wrapedInt = 12; // autobox an int
        int unboxint = wrapedInt; // auto-unbox
        System.out.println("Autounboxing into int type == " + unboxint);

        Map<String, Integer> m = new TreeMap<String, Integer>();
        for (String word : args) {
            Integer freq = m.get(word);
            m.put(word, (freq == null ? 1 : freq + 1));
        }
        System.out.println(m);
        System.out.println("**Checking the size of map**" + m.size());
    }
}
