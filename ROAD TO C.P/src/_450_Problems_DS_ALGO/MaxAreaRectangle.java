package _450_Problems_DS_ALGO;

import java.util.Scanner;
import java.util.Stack;

public class MaxAreaRectangle {

	private static int func(int[][] mat, int r, int c)
	{
		int dp[]=new int[c];
		int maxArea=Integer.MIN_VALUE;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(mat[i][j] !=0)
				{
					dp[j]=dp[j]+mat[i][j];
				}
				else
				{
					dp[j]=0;
				}
			}
			int ans=maxareahist(dp);
			maxArea=Math.max(ans, maxArea);
		}
			return maxArea;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int maxareahist(int[] arr) 
	{
		Stack<Integer> s=new Stack<Integer>();
		int maxArea=Integer.MIN_VALUE;int area=0;
		int i=0;
		for( i=0;i<arr.length;)
		{
			if(s.isEmpty() || arr[s.peek()]<=arr[i])
			{
				s.add(i++);
			}
			else
			{
				
					int top=s.pop();
					if(s.isEmpty())
					{
						area=arr[top]*i;
					}
					else
					{
						area=arr[top]*(i-s.peek()-1);
					}
					maxArea=Math.max(area, maxArea);
					
					
				
			}
		}
		while(!s.isEmpty())
		{
			int top=s.pop();
			if(s.isEmpty())
			{
				area=arr[top]*i;
			}
			else
			{
				area=arr[top]*(i-s.peek()-1);
			}
			maxArea=Math.max(area, maxArea);
			
		}
		return maxArea;
	}














	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=s.nextInt();
			}
		}
		int ans=func(mat,r,c);
		System.out.println(ans);

	}

	

	

}
