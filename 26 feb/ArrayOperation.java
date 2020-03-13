package cognizant;

import java.util.Scanner;

public class ArrayOperation {
public static void main(String[] args) {
	
	int i,j = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows:");
	int row=sc.nextInt();
	System.out.println("Enter column");
	int column=sc.nextInt();
	int[][] a=new int [row][column];
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.println(a[i][j]);
		}
	}
	ArrayOperation obj=new ArrayOperation();
	obj.SumOfRows(a,row,column);
	obj.SumOfColumn(a, row, column);
	obj.SumOfDiagonal(a, row, column);
	obj.SumDiv(a, row, column);
}


public void SumOfDiagonal(int[][]a,int row,int column)
{
	int sum=0;
	for(int i=0;i<row;i++)
	{
		
		for(int j=0;j<column;j++)
		{
			if(i==j)
			{
				sum=sum+a[i][j];
			}
			
		}
		System.out.println("Sum of Diagonal"+sum);
	}
	
}



public void SumOfRows(int[][]a,int row1,int column1)
{
	 for(int i1=0; i1<row1; i1++){    
         int sum = 0;    
         for(int j1=0;j1<column1; j1++){    
          
		sum=sum+ a[i1][j1];    
         }    
         System.out.println("Sum of "+(i1+1)+"row: "+sum);    
     }    
}





public void SumOfColumn(int a1[][],int row1,int column1)
{
	for(int i1=0; i1 <column1; i1++)
	{    
        int sum1= 0;    
        for(int j1 = 0; j1 <row1; j1++)
        {    
          sum1 = sum1+a1[j1][i1]; 
        }
        System.out.println("Sum of "+(i1+1)+"column: "+sum1); 
	}
}
	
	public void SumDiv(int[][] a, int row, int col) 
	{
	       int i,j,sum=0;
	       for(i=0; i<row; i++){
	           for( j=0; j<col; j++){
	              if(a[i][j]%3==0 && a[i][j]%5==0)
	              {
	            	  sum=sum+a[i][j];
	              }
	           }
		}
	       System.out.println("Divisible : " + sum);	
	
	
	}
}

