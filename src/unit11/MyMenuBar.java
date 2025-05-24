package unit11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyMenuBar extends JFrame implements ActionListener {
    private JMenuItem item1 = new JMenuItem("Open");
    private JMenuItem item2 = new JMenuItem("Cancel");

    private JMenuItem item3 = new JMenuItem("Font change");

    public MyMenuBar(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Edit");

        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);

        menu1.add(item1);
        menu1.add(item2);

        menu2.add(item3);

        menuBar.add(menu1);
        menuBar.add(menu2);

        setJMenuBar(menuBar);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==item1){
            JFileChooser f = new JFileChooser(".");
            f.showOpenDialog(null);
        }
        if(e.getSource()==item2){

            System.exit(0);
        }
    }

    public static void main(String []args){
        new MyMenuBar();
    }
}
