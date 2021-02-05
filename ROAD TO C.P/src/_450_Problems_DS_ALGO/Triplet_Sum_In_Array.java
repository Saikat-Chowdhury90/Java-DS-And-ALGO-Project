package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Triplet_Sum_In_Array {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextInt();
		}
		boolean ans=func(arr,n,k);
		System.out.println(ans);

	}

	private static boolean func(int[] arr, int n, int k) 
	{
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++)
		{
			int start=i+1;
			int end=n-1;
			while(start<end)
			{
				if(arr[i]+arr[start]+arr[end]==k)
				{
					return true;
				}
				else if(arr[i]+arr[start]+arr[end]<k)
				{
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		return false;
	}

}
