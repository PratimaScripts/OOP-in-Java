package unit_07;

class ThisIsMyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ThisIsMyThread t = new ThisIsMyThread();
        t.start();
    }
}