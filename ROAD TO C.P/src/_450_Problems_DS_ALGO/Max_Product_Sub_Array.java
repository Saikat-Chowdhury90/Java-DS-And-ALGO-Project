package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Max_Product_Sub_Array {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
		  arr[i]=s.nextInt();	
		}

		long ans=func(arr,n);
		System.out.println(ans);
	}

	private static long func(int[] arr, int n) 
	{
		long minVal=arr[0];
		long maxVal=arr[0];
		long maxProduct=arr[0];
		for (int i = 1; i < arr.length; i++) 
		{
			if(arr[i]<0)
			{
				long temp=minVal;
				minVal=maxVal;
				maxVal=temp;
			}
			maxVal=Math.max(arr[i], maxVal*arr[i]);
			minVal=Math.min(arr[i], minVal*arr[i]);
			maxProduct=Math.max(maxVal, maxProduct);
		}
		return maxProduct;
	}

}
