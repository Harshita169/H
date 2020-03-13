package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;
import com.cts.training.bean.Employee;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {

	public static void main(String[] args) {
		System.out.println("Employee Management");
		System.out.println("Enter your choice");
		System.out.println("1. Add Employee");
		System.out.println("2. Update Employee");
		System.out.println("3. Remove Employee");
		System.out.println("4. Get Employee By Id");
		System.out.println("5.Display all");
		System.out.println("6.Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			
		}
		case 2:
		case 3:
		case 4:
			
		case 5:
		case 6:
		}
		EmployeeDAOImpl empObj = new EmployeeDAOImpl();
		Employee emp = new Employee(111, "Disha", "Bhopal", "Digital Engineer", 22, 46566.77, 46546656L);
		empObj.addEmployee(emp);
		
		
		System.out.println("Enter id: ");
		
		int id=sc.nextInt();
		Employee em=empObj.getEmployeeById(id);
		System.out.println(em);
		
		
		System.out.println("After delete:");
		empObj.deleteEmployee(em);
		
		System.out.println("After update:");
		empObj.deleteEmployee(em);
		
		List<Employee> list = empObj.getAllEmployees();
		list.forEach(System.out::println);
	}

}

