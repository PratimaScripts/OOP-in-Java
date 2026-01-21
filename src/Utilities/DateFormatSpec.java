package Utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatSpec {
    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date date = new Date();
            Calendar calender = Calendar.getInstance();
            System.out.print("Date=> ");
            System.out.print(calender.get(Calendar.DATE) + "   ");
            System.out.print("   " + months[calender.get(Calendar.MONTH)]);
            System.out.println("   " + calender.get(Calendar.YEAR));

            System.out.print("TIME=> ");
            /*System.out.print(calender.get(Calendar.HOUR)+"   :");
            System.out.print(calender.get(Calendar.MINUTE)+"   :");
            System.out.println("   "+calender.get(Calendar.PM));*/

            String strDateFormat = "HH:mm a";
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

            System.out.println("Time with AM/PM field : " + sdf.format(date));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
