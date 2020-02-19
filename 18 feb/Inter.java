package cognizant;


interface Add
{
	int add(int a,int b);
	default int mul(int a,int b)
	{
		return a*b;
	}
	
interface Sub
{
	int sub(int a,int b);
}
class Div
{
	public int div(int a,int b)
	{
		return a/b;
	}
}


class Imp extends Div implements Sub
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
}




public class Inter {
	public static void main (String[] args)
	
	{
		Imp i=new Imp();
		System.out.println(i.add(2, 3));
		System.out.println(i.sub(8, 10));
		System.out.println(i.div(10, 5));
		
		
		Add a= new Add();
		System.out.println(a.mul(2, 3));
				
	}

}
}
