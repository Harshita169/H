package cognizant;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want in array");
		int n=sc.nextInt();
		int[] arr;
		int i;
		arr=new int[n];
		System.out.println("Enter elements:");
		for( i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Even number:");
        for(i=0;i<n;i++)
        {
        	if(arr[i]%2==0)
        	{
        		
        		System.out.println(arr[i]);
        		
        	}
        }
        System.out.println("Odd number:");
        for(i=0;i<n;i++)
        {
        	if(arr[i]%2!=0)
        	{
        		
        		System.out.println(arr[i]);
        	
        	}
        }
	}

}
