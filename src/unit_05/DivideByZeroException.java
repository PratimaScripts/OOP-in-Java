package unit_05;

public class DivideByZeroException {
	public static void main(String args[]) {
		try {
			int i = 10;
			int b = i / 0;
			System.out.println("****Divide by zero exception**** " + b);
		} 
//		catch (ArithmeticException e) {
//			// e.printStackTrace();
//			System.out.println("*****ArithmeticException**** " + e);
//		} 
		catch (Exception e) {
//			 e.printStackTrace();
			System.out.println("In exception Super class of Exception " + e);
		}
		System.out.println("****After Two Catch Statement*****");
	}
}
