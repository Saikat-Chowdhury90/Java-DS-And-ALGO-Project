package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class String_Pallindrome {

	private static int CheckPallinDrome(String s) 
	{
		 for(int i=0;i<s.length()/2;i++)
	        {
	            if(s.charAt(i)!=s.charAt(s.length()-1-i))
	                {
	                    return 0;
	                }            
	            
	        }
	        return 1;
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		int o=CheckPallinDrome(str);
		System.out.println(o);
		

	}

	

}
