package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Find_Duplicate_In_Array {

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
		int res=0;
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(visited[arr[i]]==false)
            {
                visited[arr[i]]=true;
            }
            else
            {
               res=arr[i];
            }
        }
        System.out.println(res);
		
	}

}
