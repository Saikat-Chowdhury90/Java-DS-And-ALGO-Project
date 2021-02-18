package _450_Problems_DS_ALGO;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_Traversal_of_Matrix {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for (int j = 0; j < c; j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		ArrayList<Integer> ans=func(arr,r,c);
		System.out.print(ans);
		

	}

	private static ArrayList<Integer> func(int[][] arr, int r, int c) 
	{
		ArrayList<Integer> output=new ArrayList<Integer>();
		int i=0;
		int j=0;
		int l=0;
		int k=0;
		while(k<r && l<c)
		{
			
			//First Row Traversal
			for(j=k;j<c;j++)
			{
				output.add(arr[k][j]);
			}
			k++;
			//Last Column Traversal
			
			for(i=k;i<r;i++)
			{
				output.add(arr[i][c-1]);
			}
			c--;
			
			if(k<r)
			{
				for(i=c-1;i>=l;i--)
				{
					output.add(arr[r-1][i]);
				}
				r--;
			}
		
			//First Column Traversal
			if (l < c) 
			{
                for (i = r - 1; i >= k; --i) 
                {
                    output.add(arr[i][l]);
                }
                l++;
            }
		}
		return output;
	}

}
