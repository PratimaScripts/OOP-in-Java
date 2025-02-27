package unit3;

public class Student {
	String name;
	String rollNo;
	int phoneNumber;
	String address;
	
	// Default Constructor
	// Constructor is used to initialize value
	
	Student(){}
	
	public void getInfo() {
		System.out.println("My name is "+ this.name);
		System.out.println("My rollnum is "+ this.rollNo);
		System.out.println("My address is "+ this.address);
		System.out.println("My phone number is "+ this.phoneNumber);
	}
}
