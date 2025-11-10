//this is userdefined like frame and all components hence it will do internally the work of closing window

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PRP_UI_003 extends JFrame{
	JLabel l1,l2;
	JTextField f1,f2;
	JButton b1,b2,b3;
	JFrame jf;
	
	PRP_UI_003()
	{
		jf=new JFrame("FlowLayout Example");
		l1=new JLabel("Enter Name:");
		l2=new JLabel("Enter City:");
		
		f1=new JTextField(15); //default size is 20
		f2=new JTextField(15);
		
		b1=new JButton("CLEAR");
		b2=new JButton("SUBMIT");
		b3=new JButton("NEXT");
		
		jf.setLayout(new FlowLayout());
		
		jf.add(l1);
		jf.add(f1);
		
		jf.add(l2);
		jf.add(f2);
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.setSize(300,200);
		jf.setVisible(true);
		
	}
	public static void main(String[] args) 
	{
		
		 new PRP_UI_003();
	}

}
