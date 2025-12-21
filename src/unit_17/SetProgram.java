package unit_17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class SetProgram
{
	public static void main(String args[]){
	
	Set<String> setObj = new HashSet<String>();
	setObj.add("anil");
	setObj.add("12");
	setObj.add("Gupta");
	
		System.out.println("Welcome to Collection");
	
	Iterator it = setObj.iterator();
	
/*	while(it.hasNext()){
		
	System.out.println("Elements are===>>>"+it.next());	
	}
*/




// iterate a Collection 
 for ( String eachLoop : setObj )   {  
     System.out.println ( eachLoop ) ; 
      
  }  
//System.out.println (setObj.get(1)) ;





/*	for(int i=0; i < listObj.size;i++)		
	{
	System.out.println(listObj);
	} */

	}
}