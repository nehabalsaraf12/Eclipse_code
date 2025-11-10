import java.awt.*;
class PRP_301 extends Frame
{
	PRP_301()
	{
		Button b=new Button("CLICK ME");
		b.setBounds(30,100,80,30);
		add(b);
		
		setSize(300,300);
		setLayout(null); //by default it is border layout and if we setLayout(null) as null then it is border Layout
		setVisible(true);
		
	}
}
public class PRP_UI_001 
{
	public static void main(String[] args) 
	{
		new PRP_301();
	}
}
