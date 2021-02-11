package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Choclate_Distribution_Problem {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int students=s.nextInt();
		int ans=func(arr,n,students);
		System.out.println(ans);

	}

	private static int func(int[] arr, int n,int m) 
	{
		
		int mindiff=Integer.MAX_VALUE;
		Arrays.sort(arr);
		for (int i = 0; i+m-1 < arr.length; i++) 
		{
			int a=arr[i];
			int b=arr[i+m-1];
			mindiff=Math.min(mindiff, b-a);
		}
		return mindiff;
	}

}
