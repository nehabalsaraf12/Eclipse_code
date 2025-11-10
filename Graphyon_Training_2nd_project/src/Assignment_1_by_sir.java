

import java.sql.*;
import java.util.*;
public class Assignment_1_by_sir {


	public static void main(String[] args) {

			String dbname="sanjana";
			String username="root";
			String password="neha@123";
			String url="jdbc:mysql://localhost:3306/"+dbname;
			PreparedStatement ps = null;
			Statement st=null;
			Connection con=null;
			try {
			//step 2: Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step 3: connect to MySQL
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established..");
			
			//step 4: create the statement.
			String query="create table if not exists emp_details_by_sir("+" id int primary key,"+" name varchar(20),"+" city varchar(20),"+" salary double)";
			st=con.createStatement();
			
			//step 5: execute the query
			st.executeUpdate(query);
			
			//step 6: got responsed (skip)
			System.out.println("Table is created");
				
			String sql="INSERT INTO emp_details_by_sir(id,name,city,salary)VALUES (?, ?, ?, ?)";
						
			ps=con.prepareStatement(sql);
			ps.setInt(1, 401);
			ps.setString(2, "NEHA");
			ps.setString(3, "AMRAVATI");
			ps.setDouble(4, 60000);
			ps.executeUpdate();
				
			ps.setInt(1, 402);
			ps.setString(2, "AAYUSHI");
			ps.setString(3, "AMRAVATI");
			ps.setDouble(4, 80000);
			ps.executeUpdate();
				
			ps.setInt(1, 403);
			ps.setString(2, "SANJANA");
			ps.setString(3, "YAVATMAL");
			ps.setDouble(4, 40000);
			ps.executeUpdate();
			
			System.out.println("Records are inserted..");
			con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
			}
}
		


