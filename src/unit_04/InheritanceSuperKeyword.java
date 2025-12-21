package unit_04;

class Demo1 {
	int i = 10;
	private int j;

	Demo1(int j) {
		this.j = j;
		System.out.println("***In constructor of Super Class ***" + j);
	}
}

class Display1 extends Demo1 {
	Display1(int j) {
		super(j);
		System.out.println("***In constructor of Sub Class ***");
	}
}

class InheritanceSuperKeyword {
	public static void main(String args[]) {
		// Demo dm = new Demo(20);
		Display1 dis = new Display1(40);
	}
}
