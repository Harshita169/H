package cognizant;

 class E {
	int x=10;
	public void display()
	{
		System.out.println("Class A");
	}

}
class C extends E
{
	public void displays()
	{
		@Override
		System.out.println("Class B");
	}	
}
public class D
{
public static void main (String [] args)
{
	C c=new C();
	c.display();
}
}