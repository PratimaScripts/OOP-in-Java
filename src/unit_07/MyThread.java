package unit_07;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("MyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void main(String [] args){
        Thread t1 = new MyThread("Example 1");
        t1.start();
        Thread t2 = new MyThread("Example 2");
        t2.start();
        Thread t3 = new MyThread("Example 3");
        t3.start();
        Thread t4 = new MyThread("Example 4");
        t4.start();
    }
}