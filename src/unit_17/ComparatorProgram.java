package unit_17;

import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
	  public int compare(String b, String a) {
	    System.out.println(b+"==A-Comparing-B=="+a);
		  return b.compareTo(a);
	  }
	}

	class ComparatorProgram {
	  public static void main(String args[]) {
	    TreeSet<String> ts = new TreeSet<String>(new MyComp());

	    ts.add("C");
	    ts.add("A");
	    ts.add("B");
	    ts.add("E");
	    ts.add("F");
	    ts.add("D");
	    
	    for (String element : ts)
	      System.out.print(element + " ");
	  }
	}