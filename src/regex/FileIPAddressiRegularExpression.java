package regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FileIPAddressiRegularExpression {
	public static void main(String args[])throws IOException {
		
		DataInputStream dis = null;
		String record = null;
		int recCount = 0;
				
		File f = new File("c:/Input.txt");
		
		
		FileInputStream fis = new FileInputStream(f);
	
		BufferedInputStream bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
	
		StringBuffer sb = new StringBuffer();
			
		// Pattern p = Pattern.compile ( "^\\s?\\d+\\.\\d+\\.\\d+\\.\\d+\\s+ (  [ A-Z ]  [ ^\\s ] + ) \\s.*$" ) ; 

		String _255 = "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
		Pattern p = Pattern.compile( "^(?:" + _255 + "\\.){3}" + _255 + "$");

		
		
		OutputStream op=new FileOutputStream("c:/Finalbatch.txt");
			
		int appendrecCount = 0;
		while ((record = dis.readLine()) != null) {
			recCount++;
			Matcher m = p.matcher(record);
			boolean b = m.find();
			
						
			if (b) {
				appendrecCount++;
				sb.append(record);
				sb.append("\n");
					
			} else {
				
				
			}
	}
		byte buf[]= sb.toString().getBytes();
		
		op.write(buf);
		op.flush();
		dis.close();
		op.close();
		System.out.println("***String buffer*****\n" + sb.toString());
	
		System.out.println("^^^^^^^Found Number Of Mathes For IP ADDRESSES Are--- " + appendrecCount);
		System.out.println("***Number Of Lines Found In File ----" + recCount);
	
	}
	
	/*Well, the pattern of _255 is:
(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)

which is:
(?: 
start non-capturing group (don't worry about this)
25[0-5]
match the digit 2, then the digit 5, then one of the digits 0,1,2,3,4, or 5
|
or
2[0-4][0-9]
match the digit 2; then 0,1,2,3,or 4; then 0,1,2,3,4,5,6,7,8,or 9 (any single digit really)
|
orZ
[01]?[0-9][0-9]?
match 0 or 1 or nothing; match any single digit; match any single digit or nothing
)
end non-capturing group

So then the full pattern is:
"^(?:" + _255 + "\\.){3}" + _255 + "$"
which is:
^
start of the input
(?: 
start non-capturing group
String _255
the pattern of _255 must now match
\\.
match a period (backslash is escaped to show it is a real backslash, and the real backslash is needed as part of the pattern to escape the period, which otherwise matches any character.
)
end non-capturing group
{3}
match the group just ended 3 times
String _255
match 255 once more (note this time without the period at the end)
$
end of input
 */	
	
	}
