package cognizant;

public class ThreadAssignOne implements Runnable {
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			int j=i*2;
			System.out.println(j);
		
		}
	}
}
