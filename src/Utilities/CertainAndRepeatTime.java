package Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class CertainAndRepeatTime {

    public static void main(String[] args) throws IOException {

        System.out.println("Scheduled Job");
        Timer timer = new Timer();

        final Calendar date = Calendar.getInstance();
        date.set(
                Calendar.DAY_OF_WEEK,
                Calendar.PM
        );
        date.set(Calendar.HOUR, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        int delay = 1;

        System.out.println("What do you want (Certain time or Repeat time)?");
        System.out.print("Please enter 'C' or 'R' for that: ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ans = in.readLine();

        if (ans.equals("C") || ans.equals("c")) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("This line is printed only once.");
                }
            }, delay);
        } else if (ans.equals("r") || ans.equals("R")) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("This line is printed repeatedly.");
                }
            }, delay, 1);
        } else {
            System.out.println("Invalid Entry.");
            System.exit(0);
        }

        System.out.println("===Inside The Program===");
        System.exit(0);
    }
}
