package unit_06;
class StringBuilderProgram {
	public static void main(String args[]) {

		//StringBuilder stringBuilder = new StringBuilder();
		StringBuffer stringBuilder = new StringBuffer();
		
		stringBuilder.setLength(02);
		stringBuilder.append("Greetings_Greetings_Greetings_");  
		
		System.out.println("stringBuilder.capacity()== "+ stringBuilder.capacity());
		System.out.println("stringBuilder.length() ==" + stringBuilder.length());
		System.out.println("reading the contents ==" + stringBuilder);
	}
}
