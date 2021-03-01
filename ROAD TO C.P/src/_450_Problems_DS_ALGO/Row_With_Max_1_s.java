package _450_Problems_DS_ALGO;

public class Row_With_Max_1_s {

	public static void main(String[] args)
	{
		    int r = 4, c = 4; 
	        int m[][]= { {0,1,1,1}, {0,0,1,1}, {1,1,1,1},{0,0,0,0} }; 
	          int ans=func(m, r, c);
	        System.out.println("Output is" + ans); 

	}

	private static int func(int[][] arr, int r, int c) 
	{
		int j=0;
        int ans=-1;
        while(j<c)
        {
            for(int i=0;i<r;i++)
            {
                if(arr[i][j]==1)
                {
                    ans=i;
                    break;
                }
            }
            if(ans>-1)
            {
                break;
            }
            
           j++;
        }
        return ans;
	}

}
