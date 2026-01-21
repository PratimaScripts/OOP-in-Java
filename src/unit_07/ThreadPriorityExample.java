package unit_07;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread1");
        PriorityThread t2 = new PriorityThread("Thread2");
        PriorityThread t3 = new PriorityThread("Thread3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
