package unit5;

import java.util.Random;

public class RandomNumberException {
	public static void main(String args[]) {
		int a = 0;
		int b = 0, c = 0;
		Random r = new Random();

		for (int i = 0; i < 5; i++) {
			try {
				b = r.nextInt();
				System.out.println("*B* " + b);
				c = r.nextInt();
				System.out.println("*C* " + c);
				a = 12345 / (b / c);
			} catch (ArithmeticException e) {
				System.out.println("***** ArithmeticException ***** " + e);
				a = 0;
			}
		}
		System.out.println("**** After Two Catch Statement *****");
	}
}
