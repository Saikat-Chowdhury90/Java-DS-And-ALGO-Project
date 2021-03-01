package _450_Problems_DS_ALGO;

import java.util.Arrays;

public class Median_row_wise_sorted_Matrix {

	public static void main(String[] args) 
	{
		 int r = 3, c = 3; 
	        int m[][]= { {1,3,5}, {2,6,9}, {3,6,9} }; 
	          int ans=binaryMedian(m, r, c);
	        System.out.println("Median is " + ans); 

	}

	private static int binaryMedian(int[][] m, int r, int c) 
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<r;i++)
		{
			min=Math.min(min, m[i][0]);
		}
		for(int i=0;i<r;i++)
		{
			max=Math.max(max, m[i][c-1]);
		}
		int midindex=((r*c)+1)/2;
		while(min<max)
		{
			
			int place=0;
			int mid=min+(max-min)/2;
			int get=0;
			for(int i=0;i<r;i++)
			{
				get=Arrays.binarySearch(m[i], mid);
				if(get < 0) 
	                get = Math.abs(get) - 1; 
				 else
	             { 
	                 while(get < m[i].length && m[i][get] == mid) 
	                     get += 1; 
	             } 
	             place+=get;
			}
			if (place < midindex) 
                min = mid + 1; 
            else
                max = mid; 
		}
		return min;
	}

}
