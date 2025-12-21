package CollectionsExample;

class StringToChar
{
	public static void main(String args[])
	{
		
		
		String s = "welcome to this world";
		
		s.toString();
		char buf[] = new char[s.length() - 0];
		s.getChars(0,s.length(),buf, 0);
		
	
	}
}