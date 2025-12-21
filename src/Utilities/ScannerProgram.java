package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
class ScannerProgram
{
	public static void main(String args[])throws IOException{
			FileReader fin =null;

		fin= new FileReader("Currency.java");

	
	Scanner scan = new Scanner(fin);
	while(scan.hasNext())
	{
		System.out.println(scan.next());
	}
	
		
		
		
	}
	
	
	
}