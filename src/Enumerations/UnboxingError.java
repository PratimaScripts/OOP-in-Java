package Enumerations;
class AutoboxingError {
    public static void main(String[] args) {
     
     
     Integer wrapedInt = 1000;

     int byteInt = wrapedInt.byteValue();
     
     
     System.out.println("Autounboxing into int type == "+byteInt);
    
   }
}
