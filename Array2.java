package cognizant;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		int[] arr;
		int i;
		int sum=0;
		arr=new int[n];
		System.out.println("Enter elements:");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println("Sum is:"+sum);
		
		

	}

}
