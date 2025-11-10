//designing in UI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PRP_UI_004 extends Frame implements ActionListener
{
	JFrame jf;
	JPanel pp; //it is a parent panel
	CardLayout cd;
	
	PRP_UI_004()
	{
		jf=new JFrame("CardLayout Example");
		cd=new CardLayout();
		
		//creating a main parent panel.
		//contain two child panels.
		pp=new JPanel();
		
		//creating two child panels
		JPanel cp1=new JPanel();
		JPanel cp2=new JPanel();
		
		//creating two parent buttons
		JButton b1=new JButton("NUMBERS");
		JButton b2=new JButton("ALPHABETS");
		
		//creating 3 child buttons of the Numbers button(parent).
		JButton b3=new JButton("1");
		JButton b4=new JButton("2");
		JButton b5=new JButton("3");
		
		//adding b3,b4,b5 buttons to cp1(child panel 1)
		cp1.add(b3);
		cp1.add(b4);
		cp1.add(b5);
		
		//creating 3 child buttons of the Alphabets button(parent).
		JButton b6=new JButton("A");
		JButton b7=new JButton("B");
		JButton b8=new JButton("C");
		JButton b9=new JButton("D");
		
		//adding b6,b7,b8,b9 buttons to cp2(child panel 2)
		cp2.add(b6);
		cp2.add(b7);
		cp2.add(b8);
		cp2.add(b9);
		
		//setting the positioning of the components in pp(that contains cp1 and cp2) to cardlayout
		pp.setLayout(cd);
		
		//adding child panels cp1,cp2 to parent panel pp.
		pp.add(cp1,"NUMBERS");
		pp.add(cp2,"ALPHABETS");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		//setting container JFrame's layout to FlowLayout
		jf.setLayout(new FlowLayout());
		
		//adding two buttons to JFrame but this button will remain commonly visible to all panels
		jf.add(b1);//numbers 
		jf.add(b2);//alphabets
		
		//adding parent panel to main frame
		jf.add(pp);
		
		jf.setSize(300,200);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) 
	{
		//if "numbers" button is clicked, open the JPanel with buttons showing the numbers.
		if(ae.getActionCommand()=="NUMBERS") 
		{
			cd.show(pp, "NUMBERS");
		}
		//if "alphabets" button is clicked, open the JPanel with buttons showing the alphabets.
		else
		{
			cd.show(pp, "ALPHABETS");
		}
	}
	public static void main(String[] args) 
	{
		new PRP_UI_004();
	}
}
