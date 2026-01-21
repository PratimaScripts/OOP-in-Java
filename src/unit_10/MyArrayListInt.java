package unit_10;

import java.util.*;

public class MyArrayListInt {
    ArrayList<Integer> myList = new ArrayList<Integer>();

    public void display() {
        myList.add(1);
        myList.add(2);
        myList.add(3);
        
        /*
        Iterator itr = myList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        */
        //for(String val:myList)
        //System.out.println(val);
        System.out.println(myList.indexOf(3));
    }

    public static void main(String[] args) {
        MyArrayListInt myArrayListInt = new MyArrayListInt();
        myArrayListInt.display();
    }
}