package unit11;

//The FlowLayout is used to arrange the components in a line,
//one after another (in a flow).
//It is the default layout of applet or panel.
import java.awt.*;
import javax.swing.*;

public class MyFlowLayout{
	JFrame f;
	
	MyFlowLayout(){
		f=new JFrame();

		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");

		f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);

		f.setLayout(new FlowLayout());
		//setting flow layout of right alignment

		f.setSize(300,300);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFlowLayout();
	}
}