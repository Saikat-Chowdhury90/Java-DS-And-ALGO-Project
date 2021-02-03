package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Count_Inversion {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		
		long arr[]=new long[(int) n];
	    for (long i = 0; i < arr.length; i++) 
	    {
			arr[(int) i]=s.nextLong();
		}
       long count= inversionCount(arr,n);
       System.out.println(count);
	}

	// arr[]: Input Array
    // N : Size of the Array arr[]
    private static long mergesort(long[] arr, long[] temp, long left, long right) {
		long invCount=0;
		if(right>left) {
			long mid=(left+right)/2;

			invCount+=mergesort(arr, temp, left, mid);
			invCount+=mergesort(arr, temp, mid+1, right);
			invCount+=merge(arr, temp, left, mid, right);
		}
		return invCount;
	}

	private static long merge(long [] arr,long[] temp,long left,long mid,long right) {
		long ivCount=0;
		long i=left;
		long j=mid+1;
		long k=left;
		while(i<= mid && j<=right) {
			if(arr[(int)i]<=arr[(int)j]) {
				temp[(int)(k++)]=arr[(int)(i++)];
			}else {
				temp[(int)(k++)]=arr[(int)(j++)];
				ivCount+=(mid-i+1);
			}
		}
		while(i<=mid) {
			temp[(int)(k++)]=arr[(int)(i++)];;
		}
		while(j<=right) {
			temp[(int)(k++)]=arr[(int)(j++)];
		}
		for(i=left;i<=right;i++) {
			arr[(int)i]=temp[(int)i];
		}
		return ivCount;
	}
    
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        
        long temp[]= new long[(int)(N)];

		return mergesort(arr,temp,0,N-1);

    }

	

	
}
