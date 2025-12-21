package unit_17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesProgram{
	public static void main( String[] args ) throws IOException
    {
    Properties props = new Properties();
    FileInputStream fis =
            new FileInputStream( "C:/hibernate/Assignment/JDBC/src/Chapter_17/ApplicationResources.properties" );
    props.load( fis );
    fis.close();
    
   
    
    
 /*   Enumeration keys = props.keys();
    while ( keys.hasMoreElements() )
        {
        // need cast since Properties are non-generified Hashtables.
        String keyword = ( String ) keys.nextElement();
        String value = ( String ) props.get( keyword );
        out.println( keyword + "=[" + value + "]" );
        // prints in effectively random order.
        }
*/
    
    
    
 /*  // String states = props.keySet();
    for(Object objState: props.keySet()){
    	System.out.println(objState+"\n");
    }
    */
   
  
    
        
    
    }
}