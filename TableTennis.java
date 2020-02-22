package cognizant;

public class TableTennis {
public static void main(String[] args) 
{
	System.out.println("Player 1 is ready");
	System.out.println("Player 2 is ready");
	ThreadPing threadOne=new ThreadPing();//New Born state
	ThreadPong threadTwo=new ThreadPong();
	Thread t1=new Thread(threadOne);
	Thread t2=new Thread(threadTwo);
	t1.start();//Ready state
	t2.start();
}
}
