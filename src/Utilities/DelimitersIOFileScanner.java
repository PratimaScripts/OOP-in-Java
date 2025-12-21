package Utilities;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class DelimitersIOFileScanner
{
	public static void main(String args[])throws IOException
	{
		int count = 0;
		double sum = 0.0;
		// Write output to a file........
		
		FileWriter 	fout = new FileWriter("test.txt");
		fout.write("2, 3.4, 5, 6, 7.4, 9.1, 10.5, done");
		fout.close();
		
		FileReader fin = new FileReader("Test.txt");
		Scanner src = new Scanner(fin);
	
	

	
	
	// Set delimiters to space and comma.
		src.useDelimiter(",  *");
	
	
	// Read And Sum numbers.
		
	while(src.hasNext())
	{
		if(src.hasNextDouble()){
	//		sum += src.nextDouble();
				sum = sum + src.nextDouble();
		System.out.println("only Double Value===="+sum);
			count++;
		}
		else{
			String str = src.next();
			if(str.equals("done")) 
			break;
			else{
				System.out.println("File format error.....");
				return;
			}	
		}
	}
	fin.close();
	System.out.println("Average is "+sum/count);
	}
}