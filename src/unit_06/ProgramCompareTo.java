package unit_06;

public class ProgramCompareTo{
 
  static String str[] = {"b","a","A","N"};
    
  public static void main(String[] args) {
    
    
    int count=0;
    for(int j=0; j < str.length;j++)
    {
     	count++;
    
     for(int i=j+1; i < str.length;i++)
    	{
   		 if (str[i].compareTo(str[j])<0)
    		{
      			System.out.println("str[j]---"+str[j]);
      			String t = str[j];
      			System.out.println("t in Check---"+t);
      			str[j] = str[i];
      			System.out.println("str[i]---"+str[i]);
      			str[i] = t;
      		
   	 		}
    	}
      	System.out.println(+count+"<-----Arrays are---->"+str[j]);
    }
   }
 }