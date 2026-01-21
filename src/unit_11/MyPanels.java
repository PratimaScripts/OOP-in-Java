package unit_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Using multiple panels inside a single frame. 
Multiple panels are used to compartmentalize a frame)*/

public class MyPanels {

    JFrame j;//declaring a frame
    JPanel mainPanel;// a main panel is declared
    JPanel p1, p2; //two panels that will fill the mainPanel are declared

    public static void main(String[] args) {

        new MyPanels();//calling the constructor
    }

    public MyPanels() {
        j = new JFrame("Working with multiple panels");

        //instantiating panels
        mainPanel = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();

        //Instantiating a button to be used in the p2 panel
        JButton click = new JButton("Click");
        //Instantiating a label to be used in p1 panel
        JLabel label = new JLabel("Button is clicked!!");
        //Setting foreground for the text displayed in the label
        label.setForeground(Color.BLACK);

        p1.setBackground(Color.CYAN);//setting background of p1 panel
        p2.setBackground(Color.GRAY);//setting background of p2 panel

        p1.add(label);//adding label to p1 panel
        p2.add(click);//adding button to p2 panel

        //Handling click event of the button
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p1.setBackground(Color.YELLOW);
                p2.setBackground(Color.GREEN);
                label.setForeground(Color.BLUE);
            }
        });


        //p1.setLayout(new GridLayout(3,3));
        //adding p1 panel to the frame and assigning layout
        j.add(p1, BorderLayout.CENTER);
        //adding p2 panel to the frame and assigning layout
        j.add(p2, BorderLayout.PAGE_END);

        //setting size of the JFrame
        j.setSize(400, 500);
        j.setVisible(true);//Making the frame visible
        //Closing the application when close button of the frame is clicked
        j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
