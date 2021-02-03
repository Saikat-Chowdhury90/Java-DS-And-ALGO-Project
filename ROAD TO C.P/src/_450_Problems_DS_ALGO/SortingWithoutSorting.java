package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class SortingWithoutSorting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    sort012(arr,n);

	}

	private static void sort012(int[] arr, int n)
	{
		int count_0 = 0,count_1 = 0,count_2 = 0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count_0++;
			}
			else if(arr[i]==1)
			{
				count_1++;
			}
			else if(arr[i]==2)
			{
				count_2++;
			}
		}
		int i=0;
		while(count_0>0)
		{
			arr[i]=0;
			count_0--;
			i++;
		}
		while(count_1>0)
		{
			arr[i]=1;
			count_1--;
			i++;
		}
		while(count_2>0)
		{
			arr[i]=2;
			count_2--;
			i++;
		}
		for (int j = 0; j < arr.length; j++) 
		{
			System.out.print(arr[j]+" ");
		}
	}

}
