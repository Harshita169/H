package cognizant;

import java.util.Scanner;

public class Array5 {

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
		 Array5 a = new Array5();
	     System.out.println("Maximum value:"+a.max(arr));
	     System.out.println("Minimum value:"+a.min(arr));
	}
		 public int max(int [] arr1) 
		 {
		 int max = 0;
		 for(int i=0; i<arr1.length; i++ ) {
		 if(arr1[i]>max)
		 {
		     max = arr1[i];
		 }
		 }
		      return max;
		 }
		 public int min(int [] arr1) {
		 int min = arr1[0];
		 for(int i=0; i<arr1.length; i++ ) {
		 if(arr1[i]<min) 
		 {
		      min = arr1[i];
		 }
		 }
		      return min;
		 }
	}


