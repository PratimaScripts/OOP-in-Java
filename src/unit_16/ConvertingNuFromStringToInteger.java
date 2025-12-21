package unit_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CovertingNuFromStringToInteger
{
	public static void main(String args[])throws IOException{
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int sum=0;
		System.out.println("Enter numbers, 0 to quit");
		
		
		
		
		do{
			str=br.readLine();
		
		try{ i = Integer.parseInt(str);	}
			
		catch(NumberFormatException e){System.out.println("===Number is not valid===");
		i=0;
		}
	
		sum +=i;
		System.out.println("===Sum of Numbers are==="+sum);
		}while(i!=0);
			
	}
}