package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Smallest_SubArray_With_Sum_greater_than_x {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long arr[]=new long[(int)n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextLong();
		}
		long x=s.nextLong();
		long ans=func(arr,n,x);
		System.out.println(ans);
	}

	private static long func(long[] arr, long n, long x) 
	{
		long curr_sum=0;long min_length=Integer.MAX_VALUE;
		int start=0;int end=0;
		while(end<n)
		{
			while(curr_sum<=x && end<n)
			{
				curr_sum+=arr[end];
				end++;
			}
			while(curr_sum>x && start<n)
			{
				min_length=Math.min(min_length, end-start);
				curr_sum=curr_sum-arr[start];
				start++;
			}
		}
		return min_length;
	}
    
}
