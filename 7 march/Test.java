package com.cts.training.date;

public class Test {
	public void sum(int age)
	{
		if(age<18)
		{
			System.out.print("java");
		}
		else
		{    
			System.out.print("I like ");
			sum(16);
		}
	}
	public static void main(String... args) {
		Test t=new Test();
		t.sum(24);
}
}