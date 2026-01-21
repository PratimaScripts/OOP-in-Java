package unit_17;

import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

class VectorProgram {
    public static void main(String args[]) {

        Vector vec = new Vector();
        vec.add("Bernadine");
        vec.add("Elizabeth");
        vec.add("Gene");
        vec.add("Elizabeth");
        vec.add("Clara");
        System.out.println(vec);
        Set sortedSet = new TreeSet(vec);
        System.out.println(sortedSet);

    }
}