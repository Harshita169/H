package cognizant;

public class ThreadAssign {
	public static void main(String[] args) throws InterruptedException {
		
		ThreadAssignOne threadOne=new ThreadAssignOne();//New Born state
		ThreadAssignTwo threadTwo=new ThreadAssignTwo();
		Thread t1=new Thread(threadOne);
		Thread t2=new Thread(threadTwo);
		t1.start();//Ready state
		t1.join();
		t2.start();
	}
}
