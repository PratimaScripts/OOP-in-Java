package unit_12;

import javax.swing.*;
import java.awt.*;

public class MyAnimation extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;
    private int x = 0;
    private int y = 50;

    public MyAnimation() {
        Thread thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            x += 5;
            if (x > getWidth()) x = 0;  // reset for looping animation
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Moving text", x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation Example");
        MyAnimation anim = new MyAnimation();
        frame.add(anim);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
