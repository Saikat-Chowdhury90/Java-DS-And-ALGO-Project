package _450_Problems_DS_ALGO;

import java.util.HashMap;
import java.util.Scanner;

public class Common_elements_in_all_rows {

	public static void Common_Elements(int arr[][],int m,int n)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(map.containsKey(arr[i][j]) && map.get(arr[i][j])==i)
				{
					int frequency=map.get(arr[i][j]);
					map.put(arr[i][j],frequency+1 );
					if(map.get(arr[i][j])==m)
					{
						System.out.print(arr[i][j]+" ");
					}
				}
				else
				{
					map.put(arr[i][j], 1);
				}
			}
		}
		
		
		
		
	}
	
	
	
	
	
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
		Common_Elements(arr,r,c);
	}

}
