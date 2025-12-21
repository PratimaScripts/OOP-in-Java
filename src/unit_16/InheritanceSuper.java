package unit_16;

import java.lang.reflect.Method;
import java.math.BigInteger;

class Demo
{
	int i=10;
	

}



class Display extends Demo
{
	int j=10;
	void Deck(){System.out.println("In Deck Method");}

}
class InheritanceSuper
{
	public static void main(String args[])
	{
		double pi=Math.PI;
		BigInteger ss = BigInteger.valueOf(33434343);
		System.out.println("The Pi value is==="+pi);
		// Demo dm = new Demo(20);
	Display dis = new Display();
	
	Class classes;

	classes = dis.getClass();
	System.out.println(classes);
	System.out.println(classes.getSuperclass());
	
	Method[] methods = classes.getDeclaredMethods();
    
    // Loop through the methods and print out their names
    for (Method method : methods) 
    	{
        	System.out.println(method.getName());
    	}
	}
}
	
	
