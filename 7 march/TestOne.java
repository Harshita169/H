package com.cts.training.date;

public class TestOne {
public void add(int a,int b)
{
System.out.println("Hi");
}
public void add(double c,double d)
{
	System.out.println("Hello");
}
public void add(float c,float d)

{
System.out.println("Bye");	
}
public static void main(String[] args) {
	TestOne t=new TestOne();
	t.add(1.1f, 1.2f);
	
}
}

