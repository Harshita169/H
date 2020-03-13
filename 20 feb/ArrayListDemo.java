package cognizant;

import java.awt.print.Printable;
import java.util.ArrayList;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList();
	list.add("Hello");
	list.add("To");
	list.add("Java");
	list.add("Batch");
	list.add("7");
	list.add("true");
	System.out.println(list);
	list.remove(2);
	list.add(2,"Advanced Java");
	System.out.println("List contains Python?: "+list.contains("Python"));
	System.out.println("List size: "+list.size());
	
	for(String obj : list)
	{
		System.out.println(obj);
		if(obj.equals("Java"))
		{
			break;
		}
	}
}
}
