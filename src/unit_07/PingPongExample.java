package unit_07;

class PingThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Ping");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Ping thread interrupted.");
        }
    }
}

class PongThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Pong");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Pong thread interrupted.");
        }
    }
}

public class PingPongExample {
    public static void main(String[] args) {
        PingThread ping = new PingThread();
        PongThread pong = new PongThread();
        
        ping.start();
        pong.start();
    }
}
