package com.cts.training.date;

import java.io.FileReader;
import java.io.IOException;

public class Demo {
public void readData() throws IOException
{
	FileReader fr=new FileReader("empData.txt");
	int i=fr.read();
	System.out.println("Hi"+i);
}
public void task2() throws IOException

{
readData();	
}
public static void main(String[] args) {
	Demo d=new Demo();
	try {
		d.task2();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}
	System.out.println("End of main");
}
}
