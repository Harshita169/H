package cognizant;

public class ThreadD {

	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		Resource res=new Resource();
		
		ThreadFive threadFive=new ThreadFive(res);
		ThreadSix threadSix=new ThreadSix(res);
		Thread t1=new Thread(threadFive);
		Thread t2=new Thread(threadSix);
		
		t1.start();
		t2.start();
		
	}
}
