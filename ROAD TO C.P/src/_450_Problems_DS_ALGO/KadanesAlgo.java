package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class KadanesAlgo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    func(arr,n);

	}

	private static void func(int[] arr, int n) 
	{
		int maxatend=0;
		int maxsofar=0;
		for(int i=0;i<n;i++)
		{
			maxatend=maxatend+arr[i];
			if(maxatend<0)
			{
				maxatend=0;
			}
			if(maxsofar<maxatend)
			{
				maxsofar=maxatend;
			}
		}
		System.out.print(maxsofar);
	}

}
