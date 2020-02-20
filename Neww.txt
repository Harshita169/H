package cognizant;
import java.util.Scanner;

public class Neww {
	public static void main(String[] args)
	{
	int count = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input 1: ");
	int a=sc.nextInt();
	System.out.println("Input 2: ");
	int b=sc.nextInt();
    for(int i = a; i<=b; i++)
    {
        String number = String.valueOf(i);
        while(number.contains("1"))
        {
            number= number.substring(number.indexOf("1")+1);
            count++;
        }
    }
    System.out.println(count);
}
}