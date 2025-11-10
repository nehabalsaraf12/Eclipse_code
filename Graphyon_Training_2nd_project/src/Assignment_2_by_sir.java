//UI
import java.awt.*;
import javax.swing.*;
//event
import java.awt.event.*;
//JDBC
import java.sql.*;

public class Assignment_2_by_sir extends JFrame implements ActionListener 
{
	//UI
	JLabel L1,L2,L3;
	JTextField tf1,tf2,tf3;
	JButton b1,b2,b3,b4;
	
	//JDBC
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	Assignment_2_by_sir()
	{
		setLayout(null);
		
		//JLabel
		L1=new JLabel("Std_id");
		L2=new JLabel("Std_name");
		L3=new JLabel("Std_salary");

		
		//JTextField
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		
		//Button
		b1=new JButton("First");
		b2=new JButton("Next");
		b3=new JButton("Previous");
		b4=new JButton("Last");
		
		L1.setBounds(100,100,100,30);
		tf1.setBounds(220,100,100,30);
		
		L2.setBounds(100,140,100,30);
		tf2.setBounds(220,140,100,30);
		
		L3.setBounds(100,180,100,30);
		tf3.setBounds(220,180,100,30);
		
		b1.setBounds(100, 220, 100, 30);
		b2.setBounds(220, 220, 100, 30);
		b3.setBounds(100, 260, 100, 30);
		b4.setBounds(220, 260, 100, 30);
				
		add(L1);
		add(tf1);
		add(L2);
		add(tf2);
		add(L3);
		add(tf3);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		try
		{
			String url="jdbc:mysql://localhost:3306/sanjana";
			String user="root";
			String password="neha@123";
			
			//step 2: Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3: connect to MySQL
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Database connected successfully.");
			
			//step 4: create the statement.
			stmt=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
			String sql="Select * from emp_details_by_sir";
			rs=stmt.executeQuery(sql);
			
			if(rs.next())
			{
				tf1.setText(rs.getString(1));
				tf2.setText(rs.getString(2));
				tf3.setText(rs.getString(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			JButton B=(JButton)ae.getSource();
			if(B==b1)
			{
				rs.first();
			}
			else if(B==b2)
			{
				rs.next();
			}
			else if(B==b3)
			{
				rs.previous();
			}
			else if(B==b4)
			{
				rs.last();
			}
			
				tf1.setText(rs.getString(1));
				tf2.setText(rs.getString(2));
				tf3.setText(rs.getString(4));
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	

	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		Assignment_2_by_sir as= new Assignment_2_by_sir();
		as.setSize(600,600);
		as.setVisible(true);
		
		as.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});
	}
}
