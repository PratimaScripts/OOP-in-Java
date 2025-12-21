package unit_16;

class DeleteStringBuffer
{
	public static void main(String args[]){
			
	
		
		
		StringBuffer sb2 = new StringBuffer("Some Content");
  		
  		 System.out.println("Before=="+sb2);
   		
   		 sb2.delete(0, sb2.length());
		System.out.println("after=="+sb2);
	
	StringBuffer sb3 = new StringBuffer("Some Content");
		System.out.println("Before=="+sb3);	
				sb3.setLength(0); 	
		 
	
		System.out.println(Runtime.getRuntime()+"after=="+sb3);
		
		sb3.append("appended value");
		System.out.println("after append=="+sb3);
		
//	while (rs.next()) {
//sb3.append("");

//}

	
		
		
	
	}
}