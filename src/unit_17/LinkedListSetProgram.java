package unit_17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

class LinkedListProgram
{
	public static void main(String args[]){
	
	LinkedList<String> linkList = new LinkedList<String>();
	linkList.add("anil");
	linkList.add("12");
	linkList.add("Gupta");
	
	LinkedHashSet<String> hashSet = (LinkedHashSet<String>) new HashSet<String>();
		
	
	
	
	System.out.println("Welcome to Collection");
	
	Iterator it = linkList.iterator();
	
while(it.hasNext()){
		
	System.out.println("Elements are===>>>"+it.next());	
	}





// iterate a Collection 
 for ( String eachLoop : linkList )   {  
     System.out.println ( eachLoop ) ; 
      
  }  
//System.out.println (setObj.get(1)) ;





/*	for(int i=0; i < listObj.size;i++)		
	{
	System.out.println(listObj);
	} */

	}
}