package _450_Problems_DS_ALGO;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_Element_in_2_D_ARRAY {

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
		int target=s.nextInt();
		boolean ans=func(arr,r,c,target);
		System.out.print(ans);

	}
	
	private static boolean func(int[][] arr, int n, int m,int target) 
	{
		int l=0	,r=n-1,mid=0;
		while(l<=r)
		{
			mid=(l+r)/2;
			if(target==arr[mid][0])//Search in First Column
			{
				return true;
			}
			if(target==arr[mid][m-1])//Search in Last Column
			{
				return true;
			}
			if(target>arr[mid][0] && target<arr[mid][m-1])
			{
				return binarySearch(arr,0,m-1,n,m,target,mid);
			}
			if(target>arr[mid][0])
			{
				l=mid+1;
			}
			else if(target<arr[mid][m-1])
			{
				r=mid-1;
			}
		}
		return false;
	}

	private static boolean binarySearch(int[][] arr, int low, int high, int n, int m, int target, int row) 
	{
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[row][mid]==target)
			{
				return true;
			}
			if(arr[row][mid]<target)
			{
				low=mid+1;
			}
			else if(arr[row][mid]>target)
			{
				high=mid-1;
			}
			
		}
		return false;
			
	}
	

}
