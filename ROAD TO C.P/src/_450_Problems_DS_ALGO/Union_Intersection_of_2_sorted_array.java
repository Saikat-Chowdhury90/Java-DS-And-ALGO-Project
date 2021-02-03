package _450_Problems_DS_ALGO;

import java.util.HashMap;
import java.util.Scanner;

public class Union_Intersection_of_2_sorted_array {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr1[]=new int[n];
		for (int i = 0; i < arr1.length; i++)
		{
		   arr1[i]=s.nextInt();	
		}
	
		
		int arr2[]=new int[m];
		for (int i = 0; i < arr2.length; i++)
		{
		   arr2[i]=s.nextInt();	
		}
		func(arr1,arr2,n,m);
	}

	private static void func(int[] arr1, int[] arr2, int n, int m) 
	{
		int A=n;
		int B=m;
		//int count_intersection=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(arr1[i]))
			{
				continue;
			}
			else
			{
				map.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) 
		{
			if(map.containsKey(arr2))
			{
				continue;
			}
			else
			{
				map.put(arr2[i], 1);
			}
		}
		
		System.out.println(map.size());
		
	}

}
