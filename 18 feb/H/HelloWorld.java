package cognizant;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter digits");
		num=s.nextInt();
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
System.out.println("The sum is " + sum);
	}

}
