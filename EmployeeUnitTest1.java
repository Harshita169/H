package com.cts.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.cts.training.bean.Employee;
import com.cts.training.dao.EmployeeDAO;
import com.cts.training.dao.impl.EmployeeDAOImpl;

public class EmployeeUnitTest {

	private static EmployeeDAO employeeDAO;
	private static Employee employee;

	@BeforeClass
	public static void init() 
	{
		employee=new Employee();
		employeeDAO=new EmployeeDAOImpl();
	}
@Ignore
@Test
public void test_add_employee_success()
{
	Employee emp=new Employee(2, "Neerja", "Pune", 23, 774545364, "Development",30000);
	assertEquals(true, employeeDAO.saveEmployee(emp));
}
@Ignore
@Test
public void test_update_employee_success() 
{
	EmployeeDAO empObj= new EmployeeDAOImpl();
	Employee employee1 = empObj.getEmployeeById(1);
	employee1.setName("Harshita");
	empObj.updateEmployee(employee1);
	assertEquals(true, employeeDAO.updateEmployee(employee1));
}
@Ignore
@Test
public void test_delete_employee_success()
{
	EmployeeDAO empObj=new EmployeeDAOImpl();
	Employee emp=empObj.getEmployeeById(137);
	assertEquals(true, employeeDAO.deleteEmployee(emp));
	
}
@Ignore
@Test
public void test_get_employee_by_id_success()
{
	Employee emp=employeeDAO.getEmployeeById(139);
	assertEquals("Dhruv", emp.getName());
}
@Ignore
@Test
public void test_get_all_employees_success()
{
	EmployeeDAO empObj=new EmployeeDAOImpl();
	List<Employee> list=employeeDAO.getAllEmployees();
	//assertEquals(2, list.size());
	assertEquals("Dhruv",list.get(3).getName());
	
}
@Ignore
@Test(expected=NullPointerException.class)
public void test_update_employee_failure()
{
Employee emp=employeeDAO.getEmployeeById(1);
employee.setName("Krati");
assertEquals(false,employeeDAO.updateEmployee(employee) );

}

@Test(expected=NullPointerException.class)
public void test_delete_employee_faliure()
{
	Employee emp=employeeDAO.getEmployeeById(3);
	assertEquals(false, employeeDAO.deleteEmployee(emp));
	
}
}