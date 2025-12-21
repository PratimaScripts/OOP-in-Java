package unit_17;
// Demonstrate ArrayList. 

import java.util.ArrayList;
class ConvertArraylistToArray { 
public static void main(String args[]) { 
// create an array list 
ArrayList al = new ArrayList(); 
System.out.println("Initial size of al: " + 
al.size()); 
// add elements to the array list 
al.add("C"); 
al.add("A"); 
al.add("E"); 
al.add("B"); 
al.add("D"); 
al.add("F"); 
al.add(1, "A2"); 
System.out.println("Size of al after additions: " + 
al.size()); 
// display the array list 
System.out.println("Contents of al: " + al); 
// Remove elements from the array list 
al.remove("F"); 
al.remove(2); 
System.out.println("Size of al after deletions: " + 
al.size()); 
System.out.println("Contents of al: " + al); 


ArrayList<Integer> arrNo = new ArrayList<Integer>(); 
System.out.println("Initial size of al: " + 
al.size()); 
// add elements to the array list 
arrNo.add(1); 
arrNo.add(2); 
arrNo.add(3); 
arrNo.add(4); 


// get array 
Object ia[] = (Object[])arrNo.toArray(); 
int sum = 0; 
// sum the array 
for(int i=0; i<ia.length; i++) 
sum += ((Integer) ia[i]).intValue(); 
System.out.println("Sum is: " + sum); 




} 
}

