package cognizant;

public class ThreadDe {

	
	public static void main(String[] args) 
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY-2);
		ThreadThree threadThree=new ThreadThree();
		ThreadFour threadFour=new ThreadFour();
		Thread t1=new Thread(threadThree);
		Thread t2=new Thread(threadFour);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY+2);
		t1.start();
		t2.start();
		System.out.println("Main thread priority:"+Thread.currentThread().getPriority());
		System.out.println("Thread-1 Priority:"+t1.getPriority());
		System.out.println("Thread-2 Priority:"+t2.getPriority());
	}
	}
	


