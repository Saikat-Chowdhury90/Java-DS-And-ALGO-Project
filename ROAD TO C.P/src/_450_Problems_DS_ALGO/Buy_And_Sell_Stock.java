package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Buy_And_Sell_Stock {

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

	private static void func(int[] prices, int n) 
	{
		
			if(n==0)
			{
				return;
			}
			int dp[]=new int[n];
			dp[0]=0;
			int min=prices[0];
			for (int i = 1; i < prices.length; i++) 
			{
			   if(min>prices[i])
			   {
				   min=prices[i];
			   }
			   dp[i]=Math.max(dp[i-1],prices[i]-min);
			}
			
	        
			
	        System.out.println(dp[n-1]);
	}
		
		
}


