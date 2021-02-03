package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Largest_Sum_Contiguous_SubArray_Sum {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    LargestSum(arr,n);


	}

	private static void LargestSum(int[] arr, int n) 
	{
		// TODO Auto-generated method stub
		int maxatend=0;
	       int maxsofar=0;
	       for(int i=0;i<arr.length;i++)
	       {
	           
	            maxatend=maxatend+arr[i];
	            if(maxatend<0)
	            {
	                maxatend=0;
	            }
	            if(maxsofar<maxatend)
	            {
	                maxsofar=maxatend;
	            }
	            
	           
	           
	       }
	       System.out.println(maxsofar);
		
	}

}
