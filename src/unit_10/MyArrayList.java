package unit_10;

import java.util.ArrayList;

public class MyArrayList {
    ArrayList<String> myList = new ArrayList<String>();

    public void display() {
        myList.add("Ram");
        myList.add("Sita");
        myList.add("Laxman");
        myList.add("Urmila");
        myList.remove("Sita");
        //myList.add(20);
        //System.out.println(myList.indexOf("Laxman"));
        myList.remove(1);
        /*
        Iterator itr = myList.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        */
        for (String val : myList) {
            System.out.println(val);
        }

        System.out.println(myList.indexOf("Ram"));
    }

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.display();
    }
}