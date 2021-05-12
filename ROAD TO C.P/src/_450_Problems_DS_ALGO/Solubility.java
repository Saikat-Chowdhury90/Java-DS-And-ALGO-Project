package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Solubility {

	public static void main(String[] args) throws java.lang.Exception
	{
		 try
		 {
			Scanner s = new Scanner(System.in);
			int t=s.nextInt();
			while(t>0)
			{
				int x=s.nextInt();
				int a=s.nextInt();
				int b=s.nextInt();
				
				int ans=a+(100-x)*b;
				ans=ans*10;
				System.out.println(ans);
				t--;
			}
		 }
		 catch(Exception e)
		 {
			 
		 }
		 
		
			
		

	}

}
