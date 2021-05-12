package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Longest_Pallindrome_String {

	private static String LongestPallindrome(String str) 
	{
		//Using DP

        int  n=str.length();
        boolean table[][]=new boolean[n][n];
        int maxlength=1;
        for(int i=0;i<n;i++)
        {
            table[i][i]=true;
        }
        int start=0;
        for(int i=0;i<n-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            {
                table[i][i+1]=true;
                start=i;
                maxlength=2;
            }
        }
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;
                if(table[i+1][j-1] &&str.charAt(i)==str.charAt(j))
                {
                    table[i][j]=true;
                    if(k>maxlength)
                    {
                        start=i;
                        maxlength=k;
                    }
                }
            }
        }
        return str.substring(start,start+maxlength);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String res=LongestPallindrome(str);
		System.out.println(res);

	}

	

}
