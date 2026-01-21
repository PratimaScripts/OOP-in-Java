package unit_17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PackagesProgram {
    public static void main(String args[]) {

        List<String> listObj = new ArrayList<String>();
        listObj.add("anil");
        listObj.add("12");
        listObj.add("anil");

        System.out.println("Welcome to Collection");

        Iterator it = listObj.iterator();
	
/*	while(it.hasNext()){
		
	System.out.println("Elements are===>>>"+it.next());	
	}
*/


// iterate a Collection
        for (String eachLoop : listObj) {
            System.out.println(eachLoop);

        }
        System.out.println(listObj.get(1));

/*	for(int i=0; i < listObj.size;i++)
	{
	System.out.println(listObj);
	} */

    }
}