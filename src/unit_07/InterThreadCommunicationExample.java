package unit_07;

class SharedResource {
    private boolean flag = false;

    public synchronized void waitForCondition() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Waiting thread interrupted.");
            }
        }
        System.out.println("Condition met, resuming execution.");
    }

    public synchronized void meetCondition() {
        flag = true;
        notify();
    }
}

class WaitingThread extends Thread {
    private SharedResource resource;

    public WaitingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.waitForCondition();
    }
}

class NotifyingThread extends Thread {
    private SharedResource resource;

    public NotifyingThread(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Notifying thread interrupted.");
        }
        resource.meetCondition();
        System.out.println("Condition met and notified.");
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        WaitingThread t1 = new WaitingThread(resource);
        NotifyingThread t2 = new NotifyingThread(resource);

        t1.start();
        t2.start();
    }
}
