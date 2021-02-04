package _450_Problems_DS_ALGO;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_Consequtive_subsequence {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=(int) s.nextLong();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++)
		{
		   arr[i]=s.nextInt();	
		}
       int ans=func(arr,n);
       System.out.println(ans);

	}

	private static int func(int[] arr, int n) 
	{
		HashSet<Integer> s=new HashSet<Integer>();
		int len=0;
		for (int i = 0; i < arr.length; i++) 
		{
			s.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) 
		{
			if(!s.contains(arr[i]-1))
			{
				int j=arr[i];
				while(s.contains(j))
				{
					j++;
				}
				len=Math.max(len, j-arr[i]);
			}
		}
		return len;
	}

}
