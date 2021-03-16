package _450_Problems_DS_ALGO;

public class Specific_Pair_in_A_Matrix {

	private static int findMaxValue(int n, int[][] mat) 
	{
		int maxArray[][]=new int[n][n];
		int maxValue=Integer.MIN_VALUE;
		maxArray[n-1][n-1]=mat[n-1][n-1];
		int maxv=Integer.MIN_VALUE;
		for(int j=n-1;j>=0;j--)
		{
			maxv=Math.max(maxv,mat[n-1][j]);
			maxArray[n-1][j]=maxv;
		}
		maxv=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--)
		{
			maxv=Math.max(maxv, mat[i][n-1]);
			maxArray[i][n-1]=maxv;
		}
		for(int i=n-2;i>=0;i--)
		{
			for(int j=n-2;j>=0;j--)
			{
				maxValue=Math.max(maxValue, maxArray[i+1][j+1]-mat[i][j]);
				maxArray[i][j]=Math.max(mat[i][j], Math.max(maxArray[i][j+1], maxArray[i+1][j]));
			}
		}
		return maxValue;
		
		
	}
	
	
	
	public static void main(String[] args) 
	{
		int N = 5; 
		  
        int mat[][] = { 
                      { 1, 2, -1, -4, -20 }, 
                      { -8, -3, 4, 2, 1 }, 
                      { 3, 8, 6, 1, 3 }, 
                      { -4, -1, 1, 7, -6 }, 
                      { 0, -4, 10, -5, 1 } 
                   }; 
  
        System.out.print("Maximum Value is " +  
                           findMaxValue(N,mat)); 
	}

	

}
