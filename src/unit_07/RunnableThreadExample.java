package unit_07;

public class RunnableThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing heavy processing - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doing heavy processing - END "+Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void main(String [] args){
        Thread t1 = new Thread(new RunnableThreadExample(),"t11");
        t1.start();
        Thread t2 = new Thread(new RunnableThreadExample(),"t22");
        t2.start();
        Thread t3 = new Thread(new RunnableThreadExample(),"t33");
        t3.start();
        Thread t4 = new Thread(new RunnableThreadExample(),"t44");
        t4.start();
    }

}
