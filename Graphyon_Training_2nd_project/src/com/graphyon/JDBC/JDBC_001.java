package com.graphyon.JDBC;

//step 1: phone
//import the java.sql.*; package
//step 2: SIM & Register
//Drivers
//step 3: call(connect) the friend
//connect to the database
//step 4: thinking 
//create the statements 
//step 5: talking
//execute the queries
//step 6: response
//result
//step 7: cut the call
//close the connection


import java.sql.*;

public class JDBC_001 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="neha@123";
		
		String dbName="PRPCEM_B";
		
		try {
			//step 2: Drivers
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3: connect to MySQL
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Database connected successfully.");
			
			//step 4: create the statement.
			Statement stmt=con.createStatement();
			String query="CREATE DATABASE "+dbName;
			
			//step 5: execute the query
			stmt.executeUpdate(query);
			
			//step 6: skip
			System.out.println("\nDatabase Created Successfully");
			
			//step 7: close the connection.
			con.close(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
