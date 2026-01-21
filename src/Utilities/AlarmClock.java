package Utilities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock {

    private final Timer timer = new Timer("AlarmClockTimer", false);
    private final SimpleDateFormat dateFormat =
        new SimpleDateFormat("dd MMM yyyy HH:mm:ss.SSS");
    private final int hourOfDay, minute, second;

    public AlarmClock(int hourOfDay, int minute, int second) {
        this.hourOfDay = hourOfDay;
        this.minute = minute;
        this.second = second;
    }

    public void start() {
        Date firstRun = computeNextRun(hourOfDay, minute, second);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                soundAlarm();
            }

            private void soundAlarm() {
                System.out.println("Wake up! It's " + dateFormat.format(new Date()));
                // Start a new thread to sound an audible alarm if desired.
            }
        }, firstRun, 24L * 60L * 60L * 1000L);
    }

    private static Date computeNextRun(int hourOfDay, int minute, int second) {
        Calendar next = Calendar.getInstance();
        next.set(Calendar.HOUR_OF_DAY, hourOfDay);
        next.set(Calendar.MINUTE, minute);
        next.set(Calendar.SECOND, second);
        next.set(Calendar.MILLISECOND, 0);

        Date now = new Date();
        if (!next.getTime().after(now)) {
            // already passed for today, schedule for tomorrow
            next.add(Calendar.DATE, 1);
        }
        return next.getTime();
    }

    static void main() {
        AlarmClock alarmClock = new AlarmClock(7, 0, 0);
        alarmClock.start();
        System.out.println("Alarm scheduled for daily at 07:00:00. First run at: " +
                new SimpleDateFormat("dd MMM yyyy HH:mm:ss").format(computeNextRun(7, 0, 0)));
    }
}
