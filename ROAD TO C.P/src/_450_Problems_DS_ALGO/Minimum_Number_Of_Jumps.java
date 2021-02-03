package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Minimum_Number_Of_Jumps {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    func(arr);
	}

	private static void func(int[] arr)
	{
		if(arr.length<=1)
	      {
	          System.out.println(0);
	      }
	      if(arr[0]==0)
	      {
	         System.out.println(-1);
	      }
	      int maxrange=arr[0];
	      int step=arr[0];
	      int jump=1;
	      for(int i=1;i<arr.length;i++)
	       {
	           if(i==arr.length-1)
	           {
	               System.out.println(jump);
	           }
	           maxrange=Math.max(maxrange,i+arr[i]);
	           step--;
	          
	           if(step==0)
	           {
	               jump++;
	               if(i>=maxrange)
	               System.out.println(-1);
	               step = maxrange - i;
	           }
	           
	       }
	       
	       System.out.println(jump);
	}

}
