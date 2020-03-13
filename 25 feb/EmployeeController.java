package com.cts.training.controller;

import java.util.List;
import java.util.Scanner;
import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;
;

public class EmployeeController {
public static void main(String[] args) {
	EmployeeDAO empObj=new EmployeeDAOImpl();
	//Employee employee=new Employee(111,"Mehul","Bhopal",21,925678432,"Developer",40000);
	//empObj.saveEmployee(employee);
	//Employee employee=new Employee();
	//Employee emp=empObj.getEmployeeById(2);
	empObj.deleteEmployee(empObj.getEmployeeById(3));
	//Employee employee1=empObj.getEmployeeById(1);
	//employee1.setName("Neerja");
	//empObj.updateEmployee(employee1);
	
	//List<Employee> list=empObj.getAllEmployees();
	//list.forEach(System.out::println);
}
}