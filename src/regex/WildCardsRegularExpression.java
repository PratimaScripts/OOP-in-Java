package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class WildCardsRegularExpression {
    public static void main(String args[]) {
	/*	Pattern pat = Pattern.compile("W+");
		Matcher mat = pat.matcher("W WW WWW");
		
		while(mat.find())
			System.out.println("Match:"+mat.group()); */

        //Pattern pat = Pattern.compile("e.+?d"); // this will find and will each in next line
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end  table");

        while (mat.find())
            System.out.println("Match==:" + mat.group());

    }

}