package cognizant;


public class Series {
	static int n=36;
public static void main(String[] args) {
	
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			n=n-4;
			System.out.print(n );
		}
	else
	{
		n=n-2;
		System.out.print(n );
		
	}
}
}
}