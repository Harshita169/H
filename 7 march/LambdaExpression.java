package com.cts.training.lambda;

public class LambdaExpression {
public static void main(String[] args) {
//	MyThread t=new MyThread();
//	Thread thread=new Thread(t);
//	thread.start();
	
	
	
//Runnable r=() -> System.out.println("Hello Runnable");	
//Thread t=new Thread(r);
//t.start();
	Hello h=() -> "Good Morning";
	System.out.println(h.greetings());
	Hello h1=() -> "Good Evening";
	System.out.println(h1.greetings());
	Hello h2=() -> "Good Night";
	System.out.println(h2.greetings());
}
}
//class MyThread implements Runnable
//{
//	@Override
//	public void run()
//	{
//		System.out.println("Hello Runnable");
//	}
//}
@FunctionalInterface
interface Hello
{
	String greetings();
	//public void display();
}