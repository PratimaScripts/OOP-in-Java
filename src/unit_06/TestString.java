package unit_06;
class TestString
{
	public static void main(String args[])
	{
		
		char c[] = {'j','a','v','a'};
		String s1 = new String(c,3,1);
		String s2 = new String(s1);
		System.out.println(c);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}