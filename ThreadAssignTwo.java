package cognizant;

public class ThreadAssignTwo implements Runnable 
{
	@Override
	public void run()
	{
		for(int k=1;k<=10;k++)
		{
			int t=4*k;
			System.out.println(t);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}