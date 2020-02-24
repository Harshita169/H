package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcDemoPs {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter Employee id: ");
//		int id=Integer.parseInt(br.readLine());
//		System.out.println("Enter Employee Name: ");
//		String name=br.readLine();
//		System.out.println("Enter Employee Address: ");
//		String address=br.readLine();
//		System.out.println("Enter Employee Age: ");
//		int age=Integer.parseInt(br.readLine());
//		System.out.println("Enter Employee Phone: ");
//		long phone=Long.parseLong(br.readLine());
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ctspune";
		Connection conn=DriverManager.getConnection(url,"root","root");
		//String query="insert into employee values(?,?,?,?,?)";
		//String query="delete from employee where id=?";
		
		String query="select*from employee";
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs=ps.executeQuery(query);
		int i=1;
		
		while(rs.next())
		{
			System.out.println("Employee"+i+"Records");
			System.out.println("Id"+rs.getInt(1));
			System.out.println("Name"+rs.getString(2));
			System.out.println("Address"+rs.getString(3));
			System.out.println("Age"+rs.getInt(4));
			System.out.println("Phone"+rs.getLong(5));
			i++;
//			int id=rs.getInt(1);//instead of 1 we can also write column name linke rs.getInt("id")
//			String name=rs.getString(2);
//			String address=rs.getString(3);
//			int age=rs.getInt(4);
//			long phone=rs.getLong(5);
//			System.out.println(id +":"+name+":"+address+":"+age+":"+phone);
		}
		}
		
//		ps.setString(1, name);
//		ps.setInt(1, id);
//		ps.setString(3, address);
//		ps.setInt(4,age);
//		ps.setLong(5, phone);
//		int result=ps.executeUpdate();
		
//		if(result>0)
//		{
//			System.out.println("Data inserted Successfully!");
//		}
//		else
//		{
//			System.out.println("Try Again");
//		}
	}


