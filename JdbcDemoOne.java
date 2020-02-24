package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoOne {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/ctspune";
	Connection conn=DriverManager.getConnection(url,"root","root");
	System.out.println("Connection established successfully");
	Statement stmt=conn.createStatement();
	//String query="CREATE TABLE STUDENT(id int primary key,name varchar(50),subject varchar(20))";
	//String query="insert into STUDENT values(2,'Neerja','Information Tech')";
	//String query="alter table STUDENT add pincode int";
	String query="update STUDENT set pincode=452011 where id=1"; 
	int result=stmt.executeUpdate(query);
	/*if(result>0)
	{
		System.out.println("Table created Successfully!");
	}
	else
	{
		System.out.println("Something went wrong..");
	}*/
}
}
