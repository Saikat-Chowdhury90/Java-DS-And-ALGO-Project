package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Cyclic_Rotation_of_Array {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long arr[]=new long[(int) n];
		for (int i = 0; i < arr.length; i++)
		{
		   arr[i]=s.nextInt();	
		}
       func(arr,n);
	}

	private static void func(long[] arr, long n) 
	{
		
		  long temp=arr[(int) (n-1)];
		  for(int i=1;i<arr.length;i++)
		  {
			  arr[(int) (n-i)]=arr[(int) (n-i-1)];
		  }
		  arr[0]=temp;
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(arr[i]+" ");
		  }
		 
		
	}

}
