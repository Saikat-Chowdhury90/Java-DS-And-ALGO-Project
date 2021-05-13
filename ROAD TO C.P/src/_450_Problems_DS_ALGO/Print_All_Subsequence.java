package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Print_All_Subsequence {

	public static void PrintAllSubsequence(String input,String outputsofar)
	{
		if(input.length()==0)
		{
			System.out.println(outputsofar +" ");
			return;
		}
		//not including x
		PrintAllSubsequence(input.substring(1),outputsofar);
		//including x
		PrintAllSubsequence(input.substring(1), outputsofar+input.charAt(0));
	}
	
	
	private static void PrintAllSubsequence(String str)
	{
		PrintAllSubsequence(str, " ");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		PrintAllSubsequence(str);
		//System.out.println(res);
	}

	

}
