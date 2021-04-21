package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Count_Say_Problem {

	
	private static String Count(int n) 
	{
		String val="1";
        for(int i=0;i<n-1;i++)
        {
            char c=val.charAt(0);
            StringBuilder s=new StringBuilder();
            int count=1;
            for(int j=1;j<val.length();j++)
            {
                if(c!=val.charAt(j))
                {
                    s.append(count);
                    s.append(c);
                    count=0;
                    c=val.charAt(j);
                }
                count++;
            }
            s.append(count);
            s.append(c);
            val=s.toString();
        }
        return val;
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		String s1=Count(n);
		System.out.println(s1);
	}

	

}
