package unit5;

public class MultipleCatchException {
	public static void main(String args[]) {
		try {
			int a = args.length;

			System.out.println("**** Args values Are **** " + a);
			int b = 42 / a;
			int c[] = {1};
			c[42] = 99;
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println("***** Divide By ZERO **** " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace();
			System.out.println("In ArrayIndexOutOfBoundsException " + e);
		}
		// System.out.println("**** After Try Catch Statement *****");
	}
}
