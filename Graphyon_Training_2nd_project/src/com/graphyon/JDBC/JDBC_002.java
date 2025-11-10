package com.graphyon.JDBC;
import java.sql.*;
public class JDBC_002 
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="neha@123";
		
		Connection con=null;
		Statement stmt=null;
		
		try
		{
			//step 2: Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3: connect to MySQL
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Database connected successfully.");
			
			//step 4: create the statement.
			stmt=con.createStatement();
			String query="DROP DATABASE IF EXISTS PRPCEM_B";
			
			//step 5: execute the query
			stmt.executeUpdate(query);
			
			//step 6: got responsed (skip)
			System.out.println("\nDatabase Deleted Successfully");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//step 7: close the connection
			try
			{
				if(stmt!=null)
				{
					stmt.close();
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

}
