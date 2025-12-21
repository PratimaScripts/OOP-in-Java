package CollectionsExample;

import java.util.Currency;
import java.util.Locale;
class Curreny
{
	public static void main(String args[])	
	{
		Currency c; 
		c = Currency.getInstance(Locale.ENGLISH) ;
		System.out.println("Symbol: "+c.getSymbol());
		System.out.println("Default fractional digits: "+c.getDefaultFractionDigits());
		 
	}
	
	
	
}