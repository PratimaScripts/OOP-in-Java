package unit_06;

public class StartsWith{
static int reverse ;
 
 static int signum(int num){
System.out.println("Calling in static method==="+num);
return reverse;
	}
		
 
 
  public static void main(String[] args) {
   
    reverse = signum(-2);
    
    System.out.println("d---"+reverse);
    System.out.println("String start with example!");
    String str = "Welcome to KMG";
    String start = "Wel";
    System.out.println("Given String : " + str);
    System.out.println("Start with : " + start);
    if (str.startsWith(start)){
      System.out.println("The given string is start with Wel");
    }
    else{
      System.out.println("The given string is not start with Wel");
    }
  }
} 