import java.sql.*;
import java.util.*;

public class Assignment_1 {

	Assignment_1()
	{
		String dbname="sanjana";
		String username="root";
		String password="neha@123";
		String url="jdbc:mysql://localhost:3306/"+dbname;
		PreparedStatement ps = null;
		Statement st=null;
		Connection con=null;
		try {
		
		Scanner sc=new Scanner(System.in);
		//step 2: Drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 3: connect to MySQL
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is established..");
		
		//step 4: create the statement.
		String query="create table emp_details(id int primary key,name varchar(20),city varchar(20),salary double)";
		st=con.createStatement();
		
		//step 5: execute the query
		st.executeUpdate(query);
		
		//step 6: got responsed (skip)
		System.out.println("Table is created");
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter id of user : ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String name=sc.nextLine().toUpperCase();
			System.out.println("Enter City: "+ " ");
			String city=sc.nextLine().toUpperCase();
			System.out.println("Enter salary: ");
			double salary=sc.nextDouble();
			
			String sql="INSERT INTO emp_details(id, name, city, salary) VALUES (?, ?, ?, ?)";
			ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setDouble(4, salary);

			ps.executeUpdate();			
		}
		System.out.println("Records are inserted..");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//step 7: close the connection
			try
			{
				if(st!=null)
				{
					st.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		new Assignment_1();
	}

}
