package unit_03;
class Display{
	int x =10;
		
	Display() // this is the construtor with type of class Display constructor type
	{

		System.out.println("Inside the construtor");
	}
	void method()
	{
	
	System.out.println("Inside method");
	}
	
	
	}

class ContructorProgram
{
public static void main(String args[])
{
Display display = new Display();
display.method();
System.out.println("****Access the member variable through instance variable****"+display.x);

}

}