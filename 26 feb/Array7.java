package cognizant;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		int[] arr;
		int i,j;
		arr=new int[n];
		System.out.println("Enter elements:");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(j=0;j<arr.length;j++)
		{

		System.out.println(arr[j]);
		}
		

	}

}
