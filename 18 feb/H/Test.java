package cognizant;
import java.util.Scanner;

 class Inheritence {
	
	
		String Gender;
		String name;
	
}
class Employee extends Inheritence
{
	int id;
	
}
class Manager extends Employee
{
	String department;
}
class Hr extends Employee
{
	int hrid;
}
class Development extends Manager
{
	int devid;
}
class Test extends Manager
{
	
	void fun()
	{
		int testid;
		Scanner s=new Scanner(System.in);
		testid=s.nextInt();
		System.out.println("Test id is: "+testid);
}

public static void main (String[] args)
{
	Test t= new Test();
	t.fun();

}
}
