package unit_17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SortedSetProgram
{
	public static void main(String args[]){
	
/*	SortedSet<String> setObj = new TreeSet<String>();
	setObj.add("aa");
	setObj.add("cc");
	setObj.add("bb");
	

	
		System.out.println("Welcome to Collection");
	
	Iterator it = setObj.iterator();
	
	while(it.hasNext()){
		
	System.out.println("Elements are===>>>"+it.next());	
 	 System.out.println ("In First ==="+setObj.first()) ; 
	}
*/



    Set set = new HashSet();
    set.add("Bernadine");
    set.add("Elizabeth");
    set.add("Gene");
    set.add("Elizabeth");
    set.add("Clara");
    System.out.println(set);
    Set sortedSet = new TreeSet(set);
    System.out.println(sortedSet);
 


// iterate a Collection 
/* for ( String eachLoop : setObj )   {  
     System.out.println ( eachLoop ) ; 
      
  }  */


	}
}