package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Swaps_and_K_Together {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    int k=s.nextInt();
	   int ans= func(arr,n,k);
	   System.out.println(ans);
	}

	private static int func(int[] arr, int n, int k) 
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<=k)
			{
				count++;
			}
		}
		int bad=0;
		for(int i=0;i<count;i++)
		{
			if(arr[i]>k)
			{
				bad++;
			}
			
		}
		
		int ans=bad;
		for(int i=0,j=count;j<n;i++,j++)
		{
			if(arr[i]>k)
			{
				bad--;
			}
			if(arr[j]>k)
			{
				bad++;
			}
			ans=Math.min(ans, bad);
		}
		return ans;
	}

}
