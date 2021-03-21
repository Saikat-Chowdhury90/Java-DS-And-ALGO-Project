package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Rotate_Matrix_By_90_degree {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int res[][]=func(arr,r,c);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static int[][] func(int[][] arr,int r,int c) 
	{
		for(int i=0;i<r/2;i++)
		{
			for(int j=i;j<r-1-i;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[c-1-j][i];
				arr[r-1-j][i]=arr[r-1-i][r-1-j];
				arr[r-1-i][r-1-j]=arr[j][r-1-i];
				arr[j][r-1-i]=temp;
			}
		}
		return arr;
	}

}
