package unit_11;

import javax.swing.*;
import java.awt.event.*;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create the frame (window)
        JFrame frame = new JFrame("Square Calculator");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label and TextField for input
        JLabel labelInput = new JLabel("Enter any number:");
        labelInput.setBounds(50, 30, 150, 30);
        frame.add(labelInput);

        JTextField txtInput = new JTextField();
        txtInput.setBounds(200, 30, 100, 30);
        frame.add(txtInput);

        // Button to trigger calculation
        JButton btnCalculate = new JButton("Calculate Square");
        btnCalculate.setBounds(100, 80, 180, 40);
        frame.add(btnCalculate);

        // Label and TextField for result
        JLabel labelOutput = new JLabel("Square of entered number:");
        labelOutput.setBounds(30, 140, 180, 30);
        frame.add(labelOutput);

        JTextField txtOutput = new JTextField();
        txtOutput.setBounds(200, 140, 100, 30);
        txtOutput.setEditable(false); // Make result field read-only
        frame.add(txtOutput);

        // Logic for the button
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num = Double.parseDouble(txtInput.getText());
                    double square = num * num;
                    txtOutput.setText(String.valueOf(square));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number!");
                }
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}