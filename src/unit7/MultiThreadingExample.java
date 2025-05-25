package unit7;

public class MultiThreadingExample extends Thread {
    private String threadName;

    MultiThreadingExample(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " is running - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        // Creating thread instances
    	MultiThreadingExample thread1 = new MultiThreadingExample("Thread 1");
    	MultiThreadingExample thread2 = new MultiThreadingExample("Thread 2");

        // Starting threads
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Ensure the main thread waits for thread1
            thread2.join(); // Ensure the main thread waits for thread2
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread has finished execution.");
    }
}