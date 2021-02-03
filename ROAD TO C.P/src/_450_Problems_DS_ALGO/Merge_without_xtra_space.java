package _450_Problems_DS_ALGO;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_without_xtra_space {

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
		int i=n-1;
        int j=0;
        while(j<m && i>=0)
        {
            if(arr1[i]>arr2[j])
            {
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            j++;
            i--;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
		
	}

}
