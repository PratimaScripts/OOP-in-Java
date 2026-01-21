package Utilities;

import java.util.Calendar;
import java.util.Formatter;

class LeftRightJustification {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        Calendar cal = Calendar.getInstance();
        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);

        // Right Justify by default
        fmt.format("|%10.3f", 123.123);
        System.out.println(fmt);

        // Now, Left Justify
        fmt = new Formatter();
        fmt.format("|%-10.2f", 123.123);
        System.out.println(fmt);

        // Now, Comma Separator
        fmt = new Formatter();
        fmt.format("%,f", 1234232322323123123.34);
        System.out.println(fmt);
		
	/*	// Display UpperCase 
		fmt = new Formatter();
		fmt.format("%A",);
		System.out.println(fmt);  */ // This Block didnt understand

    }
}