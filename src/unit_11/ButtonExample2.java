package unit_11;

import java.awt.event.*;
import javax.swing.*;

public class ButtonExample2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");

        JLabel label1 = new JLabel("Enter first number");
        label1.setBounds(20, 50, 150, 20);

        JLabel label2 = new JLabel("Enter second number");
        label2.setBounds(20, 80, 150, 20);

        JLabel label3 = new JLabel("Output will be displayed here");
        label3.setBounds(20, 150, 200, 20);

        JTextField tf1 = new JTextField();
        tf1.setBounds(200, 50, 50, 20);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 80, 50, 20);

        JButton b = new JButton("Click Here");
        b.setBounds(200, 200, 95, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int x = Integer.parseInt(tf1.getText());
                int y = Integer.parseInt(tf2.getText());
                int sum = x + y;
                label3.setText(String.valueOf(sum));
            }
        });

        f.add(b);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(tf1);
        f.add(tf2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the window
        //f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}