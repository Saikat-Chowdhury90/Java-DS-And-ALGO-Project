package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Next_Permutation {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for (int i = 0; i < arr.length; i++)
		{
		   arr[i]=s.nextInt();	
		}
		func(arr,n);
        System.out.println(arr);
	}

	private static void func(int[] arr, int n) 
	{
		if(arr.length<=1)
        {
            
            return;
        }
        
        int i=n-2;
        while(i>=0 && arr[i]>=arr[i+1])
        {
            i--;
        }
        if(i>=0)
        {
            int j=n-1;
            while(j>=0 && arr[j]<=arr[i])
            {
                j--;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
        }
        reverse(arr,i+1);
		
	}

	private static void reverse(int[] arr, int start) 
	{
		
		int i=start;int j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
	}

}
