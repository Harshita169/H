package cognizant;

public class ThreadFour implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
			System.out.println("Thread 2:" +i);
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
