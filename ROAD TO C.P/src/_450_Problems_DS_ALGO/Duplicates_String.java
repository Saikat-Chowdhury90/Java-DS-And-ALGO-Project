package _450_Problems_DS_ALGO;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicates_String {

	private static void Duplicate(String str) 
	{
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.contains(str.charAt(i)))
			{
				set.add(str.charAt(i));
			}
			else
			{
				System.out.println(str.charAt(i));
			}
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str;
		str=s.next();
		Duplicate(str);

	}

	

}
