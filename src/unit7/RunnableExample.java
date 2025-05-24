package unit7;

class MyRunnable implements Runnable {
    public void run() {
        String[] months = {"January", "February", "March", "April", "May"};
        try {
            for (String month : months) {
                System.out.println(month);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
