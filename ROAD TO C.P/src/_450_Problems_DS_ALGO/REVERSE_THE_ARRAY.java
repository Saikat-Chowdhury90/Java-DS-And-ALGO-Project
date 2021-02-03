package _450_Problems_DS_ALGO;
import java.util.Scanner;
public class REVERSE_THE_ARRAY {

	
	public static void reverse(int[] arr) 
	{
		int temp=0;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-i-1]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
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
	   reverse(arr);
	   
	}

	

	

}
