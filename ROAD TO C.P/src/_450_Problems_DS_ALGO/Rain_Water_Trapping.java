package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int ans=func(arr,n);
		System.out.println(ans);

	}

	private static int func(int[] arr, int n)
	{
		int left[]=new int[n];
		int right[]=new int[n];
		int water=0;
		left[0]=arr[0];
		for (int i = 1; i < left.length; i++) 
		{
			left[i]=Math.max(left[i-1], arr[i]);
		}
		 right[n-1]=arr[n-1];
		for (int i = n-2; i>=0; i--) 
		{
			right[i]=Math.max(right[i+1], arr[i]);
		}
		for (int i = 0; i < arr.length; i++) 
		{
			water=water+(Math.min(left[i], right[i])-arr[i]);
		}
		return water;
	}

}
