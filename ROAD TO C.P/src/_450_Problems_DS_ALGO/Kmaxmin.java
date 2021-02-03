package _450_Problems_DS_ALGO;


import java.util.ArrayList;
import java.util.Scanner;

public class Kmaxmin extends MaxPriorityQueue {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    int k=s.nextInt();
	    Ksmallest(arr,k);

	}

	private static void Ksmallest(int[] arr, int k) 
	{
		MaxPriorityQueue pq= new MaxPriorityQueue();
		//ArrayList<Integer> output=new ArrayList<>();
		for(int i=0;i<k;i++)
		{
			pq.insert(arr[i]);
		}
		for(int i=k;i<arr.length;i++)
		{
			int temp=pq.getMax();
			if(temp>arr[i])
			{
				pq.removeMax();
				pq.insert(arr[i]);
			}
				
		}
		System.out.println(pq.getMax());
	}

}
