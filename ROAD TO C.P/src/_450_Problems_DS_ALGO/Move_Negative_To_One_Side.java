package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Move_Negative_To_One_Side {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++)
		{
		   arr[i]=s.nextInt();	
		}
		move(arr,n);

	}

	private static void move(int[] arr, int n) 
	{
		int j=0;
		for (int i = 0; i < arr.length; i++) 
		{
			
		   if(arr[i]<0)
		   {
			 if(i!=j)
			 {
				 int temp=arr[i];
				 arr[i]=arr[j];
				 arr[j]=temp;
			 }
			 j++;
		   }
		   
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
	}

}
