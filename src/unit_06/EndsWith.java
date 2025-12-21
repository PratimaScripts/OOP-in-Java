package unit_06;

public class EndsWith{
  public static void main(String[] args) {
  
    String str = "Welcome to KMG";
    String ends = "KMG";
    String starts = "Welcome";
    
    System.out.println("Given String : " + str);
    System.out.println("Ends with : " + ends);
    if (str.endsWith(ends)){
      System.out.println("The given string is ends with KMG");
    }
    if (str.startsWith(starts)){
      System.out.println("The given string is starts with Welcome");
    }
    
    
    else{
      System.out.println("The given string is not ends with KMG");
    }
  }
} 