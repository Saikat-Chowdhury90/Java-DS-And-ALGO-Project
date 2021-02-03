package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Max_Min_Element_In_Array {

	
	private static void minmax(int[] arr)
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		System.out.print("Min"+min+" "+"Max"+max);
		
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    minmax(arr);

	}

	

}
