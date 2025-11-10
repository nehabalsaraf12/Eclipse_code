import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Assignment_2 extends JFrame implements ActionListener
{
	JFrame jf;
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton binsert,bshow,bclear;
	JTable table;
	JScrollPane scrollPane;
	
	String dbname="sanjana";
	String username="root";
	String password="neha@123";
	String url="jdbc:mysql://localhost:3306/"+dbname;
	PreparedStatement ps = null;
	String sql;
	ResultSet rs=null;
	Statement st;
	Connection con=null;
	
	Assignment_2()
	{
	
	l1=new JLabel("Enter Your id: ");
	l2=new JLabel("Enter Your name: ");
	l3=new JLabel("Enter Your city: ");
	l4=new JLabel("Enter Your salary: ");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	binsert=new JButton("INSERT");
	bshow=new JButton("SHOW");
	bclear=new JButton("CLEAR");
	table = new JTable();
	scrollPane = new JScrollPane();
	
	
	setLayout(new GridLayout(0,2,2,2));
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(l4);
	add(t4);
	add(binsert);
	add(bshow);
	add(bclear);
	add(scrollPane);
	scrollPane.add(table);
	
	binsert.addActionListener(this);
	bshow.addActionListener(this);
	bclear.addActionListener(this);
	
	setSize(600,600);
	setVisible(true);
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection(url,username,password);
	System.out.println("Connection is established..");
	
	
	String query="create table emp_details_by_ui(id int primary key,name varchar(20),city varchar(20),salary double)";
	st=con.createStatement();
	st.execute(query);
	System.out.println("Table is created");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==binsert)
		{
			int id = Integer.parseInt(t1.getText());
			String name=t2.getText(); 
			String city=t3.getText(); 
			double salary = Double.parseDouble(t4.getText());
			try 
			{			
			sql="INSERT INTO emp_details_by_ui(id, name, city, salary) VALUES (?, ?, ?, ?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setDouble(4, salary);

			ps.executeUpdate();		
			
			System.out.println("Record is inserted..");
			
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
		}
		else if(e.getSource()==bshow)
		{
			try {
			sql="select * from emp_details_by_ui";
			int id = Integer.parseInt(t1.getText());
			String name=t2.getText(); 
			String city=t3.getText(); 
			double salary = Double.parseDouble(t4.getText());
			
			DefaultTableModel model = new DefaultTableModel();
	        model.addColumn("ID");
	        model.addColumn("Name");
	        model.addColumn("City");
	        model.addColumn("Salary");

			rs=st.executeQuery(sql);
				while(rs.next())
				{
					System.out.println("Id: " + id);
					System.out.println("Name: " + name);
					System.out.println("City: " + city);
					System.out.println("Salary: " + salary);

					model.addRow(new Object[] { id, name, city, salary });

				}
				table.setModel(model);
		        scrollPane.setViewportView(table);	
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			} 
			finally {
	            try {
	            	if (con != null) rs.close();
	                if (rs != null) rs.close();
	                if (ps != null) ps.close();
	            } 
	            catch (Exception ex) {
	                ex.printStackTrace();
	            }
			}
		}
		else
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" "); 
			t4.setText(" ");
		}
	}
	
	public static void main(String[] args) 
	{
		new Assignment_2();
	}
}


