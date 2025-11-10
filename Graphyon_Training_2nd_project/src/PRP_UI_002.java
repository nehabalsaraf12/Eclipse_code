//interface are special type of class which have all method abstract
import java.awt.*;
import java.awt.event.*;

class PRP_302 extends Frame
{
	Label L;
	PRP_302()
	{
		//window closing
		this.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});
		L=new Label("Ths is the window closing example.");
		this.add(L);
		
		setTitle("Window Closing");
		setSize(300,300);
		setVisible(true);
	}
}
public class PRP_UI_002 {
	public static void main(String[] args)
	{
		new PRP_302();
	}
}
