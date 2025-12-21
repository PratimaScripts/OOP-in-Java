package Enumerations;
enum Apple {
	Jonathan , GoldenDel,RedDel, Winesap, Cortland 
}
class FirstEnumeration{
	public static void main(String args[])
	{
		Apple ap;
		ap = Apple.RedDel;
		// output an enum value.
		System.out.println("Value of ap:"+ap);
		System.out.println();
		ap = Apple.GoldenDel;
	//	ap=Apple.valueOf("GoldenDel");
	//	System.out.println("**Check the ValueOf method***"+ap);
		
		//compare two enum values.
		if(ap==Apple.GoldenDel)
		System.out.println("ap contains GoldenDel .\n");
		
		
		// Use an enum to control a switch statement.
		switch(ap){
			case Jonathan : System.out.println("Jonathan is Red."); break;
			case GoldenDel : System.out.println("GoldenDel is Yellow."); break;
			case RedDel : System.out.println("RedDel is red."); break;
			case Winesap : System.out.println("Winesap is Red."); break;
			case Cortland : System.out.println("Cortland is Red."); break;
			
			
			
			
			
			
		}
		
	}
	
}
