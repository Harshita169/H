package cognizant;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i,count=0;
		
		System.out.println("Enter elements:");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(arr[j]==arr[i])
			{
				count++;
			}
		}
		}
			System.out.println(count);
		
		

	
	}
}
