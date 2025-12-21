package unit_04;

class A {
	A(int a) {
		System.out.println("In Class A constructor");
		print();
	}

	void print() {
		System.out.println("In class A of Method Print()");
	}
}

class B extends A {
	B(int b) {
		super(5);
		System.out.println("In class B Constructor");
	}

	public static void main(String[] as) {
		B b = new B(4);
		System.out.println("In Class B");
	}
}
