package cognizant;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[arr.length];
		int i;
		
		System.out.println("Enter elements:");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
