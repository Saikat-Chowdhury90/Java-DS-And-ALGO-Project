package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class ReArrange_The_Array {

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
   int res[]= func(arr,n);
   for (int i = 0; i < res.length; i++) 
   {
			System.out.print(res[i]+" ");
   }
		}

	}

	private static int[] func(int[] arr, int n) 
	{
		if(n<=1)
		{
			return arr;
		}
		int i=0;int j=n-1;
		while(i<j)
		{
			while(i<n-1 && arr[i]>=0)
			{
				i++;                                      //this code will bring all the negatives into the end
			}
			while(j>=0 && arr[j]<0)
			{
				j--;
			}
			if(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		if(i==0 || i==n)
		{
			return arr;
		}
		int k=0;
		while(k<n && i<n)
		{
			
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;
			
			k=k+2;
			i=i+1;
		}
		return arr;
	}

}
