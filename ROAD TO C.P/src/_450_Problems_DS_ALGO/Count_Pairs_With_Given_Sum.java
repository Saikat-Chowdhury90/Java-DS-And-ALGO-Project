package _450_Problems_DS_ALGO;

import java.util.HashMap;
import java.util.Scanner;

public class Count_Pairs_With_Given_Sum {

	public static void main(String[] args) 
	{
		try (Scanner s = new Scanner(System.in)) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			int k=s.nextInt();
			int ans=func(arr,n,k);
			System.out.println(ans);
		}
	}

	private static int func(int[] arr, int n, int sum) 
	{
		if(n<=1)
		{
			return 0;
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		 
        // Store counts of all elements in map hm
        for (int i = 0; i < n; i++) {
 
            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);
 
            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;
 
        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i < n; i++) {
            if (hm.get(sum - arr[i]) != null)
                twice_count += hm.get(sum - arr[i]);
 
            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (sum - arr[i] == arr[i])
                twice_count--;
        }
 
        // return the half of twice_count
        return twice_count / 2;
	}

}
