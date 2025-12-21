package Enumerations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// An annotation type declaration.

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1 {
	String str();
	String val();
}
class Meta{
	// Annotate a method.
	@MyAnno(str = "Annotation Example", val=100)
	public static void myMeth(){
		Meta ob = new Meta();
		
		// obtain the annotation for this method
		// and display the values of the members.
		try{
			// First, get a class object that repersents this class
			Class c = ob.getClass();
			
			// Now, get a Method object that represents this method
			
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			// Finally, display the values.
			System.out.println(anno.str()+""+anno.val());
		}	catch(NoSuchMethodException exc){System.out.println("Method Not Found.");
			}
			
		}	
		public static void main(String args[]){
			myMeth();
		}
		
		
	}
	
	
	
	
	
