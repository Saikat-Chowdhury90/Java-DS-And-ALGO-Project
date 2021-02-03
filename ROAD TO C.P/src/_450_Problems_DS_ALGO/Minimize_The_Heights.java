package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Minimize_The_Heights 
{
  public static void main(String[] args) 
  {

		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    func(arr,n,k);


  }

private static void func(int[] arr, int n, int k) 
{
	Arrays.sort(arr);
	int ans=arr[n-1]-arr[0];
	int small=arr[0]+k;
	int big=arr[n-1]-k;
	int temp=0;
	if(small>big)
	{
		temp=small;
		small=big;
		big=temp;
	}
	for (int i = 1; i < arr.length; i++)
	{
		int subtract=arr[i]-k;
		int add=arr[i]+k;
	    if(subtract>=small || add<=big)
	    {
	    	continue;
	    }
		if (big - subtract <= add - small) 
            small = subtract; 
        else
            big = add; 
	}
	int res=Math.min(ans,big-small);
	System.out.println(res);
	
}
}
