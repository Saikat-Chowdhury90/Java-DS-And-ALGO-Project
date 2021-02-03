package _450_Problems_DS_ALGO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Merge_Intervals {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]arr= new int[n][2];
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				arr[i][j]=s.nextInt();
			}
		}
		int[][] res=func(arr);
		for (int i = 0; i < res.length; i++) 
		{
			for (int j = 0; j < res[0].length; j++) 
			{
				System.out.print(res[i][j]);
			}
		}
		

	}

	private static int[][] func(int[][] intervals) 
	{
		
		        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//		        LinkedList<int[]> merged = new LinkedList<>();
//		        for (int[] interval : intervals) {
//		            // if the list of merged intervals is empty or if the current
//		            // interval does not overlap with the previous, simply append it.
//		            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
//		                merged.add(interval);
//		            }
//		            // otherwise, there is overlap, so we merge the current and previous
//		            // intervals.
//		            else {
//		                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
//		            }
//		        }
//		        return merged.toArray(new int[merged.size()][]);
		        List<int[]>merged=new ArrayList<>();
		        int[]temp=intervals[0];
		        for(int i=1;i<intervals.length;i++){
		            if(temp[1]>=intervals[i][0]){
		                temp[1] = Math.max(temp[1],intervals[i][1]);
		            }else{
		                merged.add(temp);
		                temp=intervals[i];
		            }
		        }
		        merged.add(temp);
		        return merged.toArray(new int[merged.size()][]);
		    }
		}
		
	


