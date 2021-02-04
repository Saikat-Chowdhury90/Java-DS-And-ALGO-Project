package _450_Problems_DS_ALGO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class More_Than_n_k_times {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		func(arr,k);
		//System.out.println(ans);

	}
	public static void func(int[]arr,int k)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i], 1);
			}
		}
		int limit=arr.length/k;
		for (Map.Entry m : map.entrySet()) 
        {
            Integer temp = (Integer)m.getValue();
            if (temp > limit)
                System.out.println(m.getKey());
        }
		
		
		//return res;
		
	}

}
