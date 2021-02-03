package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Factorial_Of_Large_Numbers {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0)
		{
		  int n=s.nextInt();
		  Factorial(n);
		  t--;
		}

	}

	private static void Factorial(int n) 
	{
		String num="";
		int fact=1;
		for(int i=2;i<=n;i++)
		{
			fact=fact*i;
		}
		num=num+fact;
		System.out.println(num);
		
	}

}
