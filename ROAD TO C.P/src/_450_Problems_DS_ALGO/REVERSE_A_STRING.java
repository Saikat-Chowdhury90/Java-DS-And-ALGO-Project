package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class REVERSE_A_STRING {

	
	 public static void reverseString(char[] s) 
	    {
	        int si=0;
	        int ei=s.length-1;
	        while(si<ei)
	        {
	            
	            char temp=s[si];
	            s[si]=s[ei];
	            s[ei]=temp;
	            
	            
	            si++;
	            ei--;
	            
	        }
	        System.out.print(s);
	    }
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		
		char[] str=s.next().toCharArray();
		
		
		reverseString(str);
		
		

	}

}
