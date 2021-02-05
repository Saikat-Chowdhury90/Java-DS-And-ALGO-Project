package _450_Problems_DS_ALGO;

import java.util.HashSet;
import java.util.Scanner;

public class Array_Subset_Of_Another_Array 
{
   public static void main(String[] args) 
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int m=s.nextInt();
	   int arr1[]=new int[n];
	   int arr2[]=new int[m];
	   for (int i = 0; i < arr1.length; i++) 
	   {
		   arr1[i]=s.nextInt();
	   }
	   for (int i = 0; i < arr2.length; i++) 
	   {
		   arr2[i]=s.nextInt();
	   }
	   boolean res=func(arr1,n,arr2,m);
	   if(res==true)
	   {
		   System.out.println("Yes");
	   }
	   else
	   {
		   System.out.println("No");
	   }
	   
	
	
   }

private static boolean func(int[] arr1, int n, int[] arr2, int m) 
	{
		HashSet<Integer> s=new HashSet<Integer>();
		boolean ans=false;
		for(int i=0;i<n;i++)
		{
			s.add(arr1[i]);
		}
		for(int i=0;i<m;i++)
		{
			if(s.contains(arr2[i]))
			{
				ans=true;
			}
			else
			{
				ans=false;
				break;
			}
		}
		return ans;
	}
}
