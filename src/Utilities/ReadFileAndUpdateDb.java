package Utilities;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ReadFileAndUpdateDb extends TimerTask {

    public void run() {
        //TODO  Code To  Read File And Update Db
    }

}

class MainApplication {

    public static void main(String[] args) {
        Timer timer = new Timer();
        Calendar date = Calendar.getInstance();
        date.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        date.set(Calendar.HOUR, 0);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        // Schedule to run every Sunday in midnight
        timer.schedule(new ReadFileAndUpdateDb(), date.getTime(), 1000 * 60 * 60 * 24 * 7);
    }
}