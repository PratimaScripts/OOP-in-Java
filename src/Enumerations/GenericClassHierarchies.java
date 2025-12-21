package Enumerations;
class Gen<T>{
	T ob; // declare an object of type T
	
	Gen(T o){ // pass the constructor a reference to an object of type T.
	System.out.println("1");
	ob = o;
		
	}
	T getob(){ // return ob

	return ob;
	}
}
class Gen2<T,V> extends Gen<T>{
	V ob2;
	Gen2(T o,V o2){
		super(o);
		System.out.println("2");
		ob2 = o2;
		System.out.println("3");
	}
	
	V getob2(){
		return ob2;
	}
	
	
	
}
class GenericClassHierarchies{ // Create an object of type Gen2
public static void main(String args[]){
Gen<String> xsuper = new Gen<String>("In Super Class");

	System.out.println(xsuper.getob());
			System.out.println(xsuper.getob());

Gen2<String,Integer> x = new Gen2<String,Integer>("value is :",88);
		System.out.println(x.getob());
			System.out.println(x.getob2());
	
}
}