package _450_Problems_DS_ALGO;

import java.util.Scanner;
class ele_count
{
	int e;
	int c;
}

public class More_Than_n_k_times_using_sorting {

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

	}

	private static void func(int[] arr, int k) 
	{
		ele_count temp[]=new ele_count[k-1];
		for(int i=0;i<k-1;i++)
		{
			temp[i]=new ele_count();
		}
		for (int i = 0; i < k-1; i++) 
		{
			temp[i].c=0;
		}
		/* Step 2: Process all 
	      elements of input array */
	    for (int i = 0; i < arr.length; i++) 
	    {
	        int j;
	 
	        /* If arr[i] is already present in
	           the element count array, 
	           then increment its count
	         */
	        for (j = 0; j < k - 1; j++) 
	        {
	            if (temp[j].e == arr[i]) 
	            {
	                temp[j].c += 1;
	                break;
	            }
	        }
	 
	        /* If arr[i] is not present in temp[] */
	        if (j == k - 1) {
	            int l;
	 
	            /* If there is position available 
	              in temp[], then place arr[i] in 
	              the first available position and 
	              set count as 1*/
	            for (l = 0; l < k - 1; l++)
	            {
	                if (temp[l].c == 0) 
	                {
	                    temp[l].e = arr[i];
	                    temp[l].c = 1;
	                    break;
	                }
	            }
	 
	            /* If all the position in the 
	               temp[] are filled, then decrease 
	               count of every element by 1 */
	            if (l == k - 1)
	                for (l = 0; l < k-1; l++)
	                    temp[l].c -= 1;
	        }
	    }
	 
	    /*Step 3: Check actual counts of 
	     * potential candidates in temp[]*/
	    for (int i = 0; i < k - 1; i++)
	    {
	       
	        // Calculate actual count of elements
	        int ac = 0; // actual count
	        for (int j = 0; j < arr.length; j++)
	            if (arr[j] == temp[i].e)
	                ac++;
	 
	        // If actual count is more than n/k,
	       // then print it
	        if (ac > arr.length / k)
	            System.out.print("Number:" +  temp[i].e
	                + " Count:" +  ac +"\n");
		
	    }

	}
}
