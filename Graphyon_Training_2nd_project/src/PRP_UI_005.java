import java.awt.*;
import javax.swing.*;

public class PRP_UI_005 extends JFrame{
	JFrame jf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmult,bdiv,bres,bclear;
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JPanel pp;
	GridLayout gd;
	
	PRP_UI_005()
	{
		jf=new JFrame("CALCULATOR");
		gd=new GridLayout(0,4,5,5);//0 shows that it will take row automatically and 4 shows it 
		//will take 4 column and 5,5 are the horizontal_gap and vertical_gap
		
		pp=new JPanel();
				
		l1=new JLabel("Enter first number:");
		t1=new JTextField();
		l2=new JLabel("Enter second number:");
		t2=new JTextField();
		
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		badd=new JButton("+");
		bsub=new JButton("-");
		bmult=new JButton("*");
		bdiv=new JButton("/");
		bres=new JButton("=");
		bclear=new JButton("C");
		l3=new JLabel("Result:");
		t3=new JTextField();
		
		pp.add(l1);
		pp.add(t1);
		pp.add(l2);
		pp.add(t2);
		pp.add(b1);
		pp.add(b2);
		pp.add(b3);
		pp.add(b4);
		pp.add(b5);
		pp.add(b6);
		pp.add(b7);
		pp.add(b8);
		pp.add(b9);
		pp.add(badd);
		pp.add(bsub);
		pp.add(bmult);
		pp.add(bdiv);
		pp.add(bres);
		pp.add(bclear);
		pp.add(l3);
		pp.add(t3);
		
		pp.setLayout(gd);
		add(pp);
		setSize(600,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new PRP_UI_005();
	}

}
