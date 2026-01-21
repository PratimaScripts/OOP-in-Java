package Utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

/**
 * Simple desktop replacement for the original J2ME MIDlet.
 * Displays today's date and provides an Exit button.
 */
public class DateToday {

    private final JFrame frame;
    private final JLabel dateLabel;
    private final JButton exitButton;
    private final Date today = new Date();

    public DateToday() {
        frame = new JFrame("Today's Date");
        dateLabel = new JLabel(formatDate(today));
        exitButton = new JButton("Exit");

        setupUI();
        attachListeners();
    }

    private void setupUI() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        dateLabel.setFont(dateLabel.getFont().deriveFont(16f));

        JPanel center = new JPanel(new BorderLayout());
        center.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        center.add(dateLabel, BorderLayout.CENTER);

        JPanel south = new JPanel();
        south.add(exitButton);

        frame.add(center, BorderLayout.CENTER);
        frame.add(south, BorderLayout.SOUTH);

        frame.setSize(320, 140);
        frame.setLocationRelativeTo(null);
    }

    private void attachListeners() {
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destroyApp();
            }
        });
    }

    private static String formatDate(Date d) {
        return DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM).format(d);
    }

    public void startApp() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.setVisible(true);
            }
        });
    }

    public void pauseApp() {
        // Not applicable for desktop; kept for compatibility with original lifecycle.
    }

    public void destroyApp() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frame.dispose();
                // Exit the JVM; if you prefer not to exit, remove this.
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        DateToday app = new DateToday();
        app.startApp();
    }
}
