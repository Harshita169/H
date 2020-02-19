package cognizant;

public class StringDemoBuffer {
public static void main (String[] args)
{
	StringBuilder sb=new StringBuilder();
	
	System.out.println(sb.capacity());
	sb.append("Hello to java version 8");
	System.out.println(sb.capacity());
	sb.append("This is my version of development");
	System.out.println(sb.capacity());
	sb.insert(7,"Dear");
	System.out.println(sb);
	sb.replace(7, 20, "Hii");
	System.out.println(sb);
	sb.delete(7,20);
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
}
}
