package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Three_way_partioning {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    int a=s.nextInt();
	    int b=s.nextInt();
	    int arr1[] =func(arr,a,b);
	   for (int j = 0; j < arr1.length; j++) 
	   {
		   System.out.print(arr1[j]+" ");
	   }
	   

	}

	private static int[] func(int[] arr, int a, int b)
	{
		int n=arr.length;
        int start=0;int end=n-1;
        for(int i=0;i<=end;)
        {
            if(arr[i]<a)
            {
                int temp=arr[start];
                arr[start]=arr[i];
                arr[i]=temp;
                start++;
                i++;
            }
            else if(arr[i]>b)
            {
                int temp=arr[end];
                arr[end]=arr[i];
                arr[i]=temp;
                end--;
            }
            else
            {
                i++;
            }
        }
       return arr;
	}

}
