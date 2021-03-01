package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Bob_String {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0)
        {
            String str=s.next();
            func(str);
           

            t--;
            
        }

	}

	private static void func(String s)
	{
		 if(s==null)
	        {
	            return;
	        }
	        int maxcount=-1;
	        int freq[]=new int[26];
	        for(int i=0;i<26;i++)
	        {
	        	freq[i]=-1;
	        }
	        for(int i=0;i<s.length();i++)
	        {
	        	int index=s.charAt(i)-'a';
	        	if(freq[index]==-1)
	        	{
	        		freq[index]=i;
	        
	        	}	
	        	else
	        	{
	        		int distance=i-freq[index]-1;
	        		maxcount=Math.max(distance, maxcount);
	        	}
	        }
	        System.out.println(maxcount);

		
	}

}
