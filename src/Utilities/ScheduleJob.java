package Utilities;

import java.util.Calendar;
import java.util.Timer;

/**
 * The class is used to schedule the job to be executed as per time set.
 */
public class ScheduleJob {

    static void main() {
        // Minimal entry point. Create an instance if you want to schedule tasks.
        // Example (commented out to avoid background threads during simple builds):
        // new ScheduleJob().expireStatus();
    }

    public void expireStatus() {
        System.out.println("Scheduled Job");
        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();

        // Set the time to midnight of the current day
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        System.out.println("date.getTime " + date.getTime());

        // Schedule the job: ExecutableRunner.run() executed periodically.
        timer.schedule(
                new ExecutableRunner(),
                date.getTime(),
                // 1000 * 60 * 5          // For Live
                1000L * 60 * 5 * 60     // For Test Purpose
        );
    }

    /* Added By PMishra May 23, 2007 ----- For scheduling the Members
       and non members report generation */
    public void expireStatusNew() {
        System.out.println("Scheduled Job");
        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();

        // Set base to next Friday at midnight
        date.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        Calendar now = Calendar.getInstance();
        if (now.after(date)) {
            // If the target time is already passed this week, move to next week
            date.set(Calendar.DATE, date.get(Calendar.DATE) + 7);
        }
        System.out.println("date.getTime " + date.getTime());

        // Schedule weekly members report
        timer.schedule(
                new MembersReport(), // Members report task
                date.getTime(),
                1000L * 60 * 60 * 24 * 7
        );
    }

    /**
     * Method to send mail to all members as a reminder for rent.
     */
    public void checkMonthly() {
        System.out.println("-------- Schedule Job ------- ");
        System.out.println("--------- Calling method checkMonthly -------- ");

        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();

        // Set date to the 1st of current month at midnight
        date.set(Calendar.MONTH, Calendar.getInstance().get(Calendar.MONTH));
        date.set(Calendar.DATE, 1);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        Calendar rightNow = Calendar.getInstance();
        System.out.println("******* Current Date is ******** " + rightNow.get(Calendar.DATE));

        if (rightNow.after(date)) {
            System.out.println("--------- inside if condition -------- ");
            // Move to next month if the 1st already passed
            date.add(Calendar.MONTH, 1);
            System.out.println("month:" + date.get(Calendar.MONTH));
            System.out.println("date:" + date.get(Calendar.DATE));
        }

        // Schedule monthly rent report (for testing set to once-per-day)
        timer.schedule(
                new RentReport(),
                date.getTime(),
                1000L * 60 * 60 * 24 // This will run once per day (adjust for production)
        );
    }

    // Simple TimerTask implementations so this file compiles independently.
    private static class ExecutableRunner extends java.util.TimerTask {
        @Override
        public void run() {
            System.out.println("ExecutableRunner: running scheduled job at " + Calendar.getInstance().getTime());
            // Place execution logic here.
        }
    }

    private static class MembersReport extends java.util.TimerTask {
        @Override
        public void run() {
            System.out.println("MembersReport: generating members report at " + Calendar.getInstance().getTime());
            // Report generation logic here.
        }
    }

    private static class RentReport extends java.util.TimerTask {
        @Override
        public void run() {
            System.out.println("RentReport: generating rent reminders at " + Calendar.getInstance().getTime());
            // Rent reminder logic here.
        }
    }

}