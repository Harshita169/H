package cognizant;

public class ThreadPing implements Runnable 
{
	@Override
	public void run()
	{
		for(int i=1;i<=30;i++)
		{
			if(i%2!=0)
			{
			System.out.println("Ping");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	}
}

