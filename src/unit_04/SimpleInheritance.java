package unit_04;

class Demo {
	int i = 10;
}

class Display extends Demo {
	void Display() {
		System.out.println("Accessing the int i from its base class: " + i);
	}
}

class InheritanceSuper {
	public static void main(String args[]) {
		Display dis = new Display();
		dis.Display();
	}
}
