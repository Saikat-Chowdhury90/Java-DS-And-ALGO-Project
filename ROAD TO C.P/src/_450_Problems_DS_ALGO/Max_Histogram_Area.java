package _450_Problems_DS_ALGO;

import java.util.Stack;

public class Max_Histogram_Area {

	private static int func(int[] arr)
	{
		Stack<Integer> s=new Stack<Integer>();
		int area=0;
		int maxarea=Integer.MIN_VALUE;
		int i=0;
		for( i=0;i<arr.length;)
		{
			if(s.isEmpty() || arr[i]>=arr[s.peek()])
			{
				s.add(i++);
			}
			else 
			{
				
					int top=s.pop();
					if(s.isEmpty())
					{
						area=arr[top]*i;
					}
					else {
						area=arr[top]*(i-s.peek()-1);
					}
					maxarea=Math.max(maxarea, area);
				
			}
			
		}
		while(!s.isEmpty())
		{
			int top=s.pop();
			if(s.isEmpty())
			{
				area=arr[top]*i;
			}
			else {
				area=arr[top]*(i-s.peek()-1);
			}
			maxarea=Math.max(maxarea, area);
		}
		return maxarea;
	}
	
	
	
	
	public static void main(String[] args) 
	{
		int arr[]= {2,1,2,3,1};
		int ans=func(arr);
		System.out.println(ans);

	}

	

}
