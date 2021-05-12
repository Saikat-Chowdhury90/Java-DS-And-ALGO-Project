package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class XOR_EQUALITY {

	public static void main(String[] args) 
	{
		try 
		{
			Scanner s=new Scanner(System.in);
			int t=s.nextInt();
			while(t-->0)
			{
				int n=s.nextInt();
				//long ans=1;
				long temp=1;
				long x=2;
				long y=n-1;
				long M=(long)(Math.pow(10, 9)+7);
				while(y>0)
				{
					if(y%2!=0)
					{
						temp=(x*temp)%M;
					}
					x=(x*x)%M;
					y=y/2;
				}
				System.out.println(temp);
			}
		}
		catch (Exception e) 
		{
			
		}

	}

}
