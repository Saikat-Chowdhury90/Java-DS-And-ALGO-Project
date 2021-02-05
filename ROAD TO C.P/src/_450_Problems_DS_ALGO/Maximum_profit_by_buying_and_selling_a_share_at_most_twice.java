package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Maximum_profit_by_buying_and_selling_a_share_at_most_twice {

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
	    if(n==1)
	    {
	    	return arr[1];
	    }
	    else if(n==0)
	    {
	    	return 0;
	    }
	    int dp[]=new int[n];
	    dp[0]=0;
	    for(int i=1;i<arr.length;i++)
	    {
	    	dp[i]=Math.max(dp[i-1], dp[i-1]+(arr[i]-arr[i-1]));
	    	
	    }
	    return dp[n-1];
	}
	

}
