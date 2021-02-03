package _450_Problems_DS_ALGO;

import java.util.HashMap;
import java.util.Scanner;

public class SubArray_with_zero_sum {

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			boolean res= func(arr,n);
         
			System.out.print(res);
         
		}

	}

	private static boolean func(int[] arr, int n) 
	{
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		if(n<=1 && arr[0]!=0)
		{
			return false;
		}
		int sum=0;boolean b=false;
		for (int i = 0; i < arr.length; i++) 
		{
			sum=sum+arr[i];
			if(sum==0)
			{
			    b=true;
			}
			if(!map.containsKey(sum))
			{
				map.put(sum, 1);
			}
			else
			{
			   b=true;	
			}
			
			
			
		}
		return b;
			
	}

}
