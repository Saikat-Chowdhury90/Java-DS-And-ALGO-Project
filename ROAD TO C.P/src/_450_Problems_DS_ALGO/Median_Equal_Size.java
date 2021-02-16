package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class Median_Equal_Size {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=s.nextInt();
	    }
	    int m=s.nextInt();
	    int b[]=new int[m];
	    for(int i=0;i<b.length;i++)
	    {
	    	b[i]=s.nextInt();
	    }
	    int ans=func(a,n,b,m);
	    System.out.println(ans);

	}

	private static int func(int[] a, int n, int[] b, int m) 
	{
		return getMedian(a,0,n-1,b,0,m-1);
	}

	private static int getMedian(int[] a, int sia, int eia, int[] b, int sib, int eib) 
	{
		if(eia-sia==1)
		{
			int ans=(Math.max(a[sia],b[sib])+Math.min(a[eia], b[eib]))/2;
			return ans;
		}
		int m1=Median(a,sia,eia);
		int m2=Median(b,sib,eib);
		if(m1==m2)
		{
			return m1;		
		}
		else if(m1<m2)
		{
			return getMedian(a,(sia+eia+1)/2, eia, b, sib,(sib+eib+1)/2 );
		}
		else
		{
			return getMedian(a,sia,(sia+eia+1)/2,b,(sib+eib+1)/2,eib);
		}
	}

	private static int Median(int[] arr, int si, int ei) 
	{
		int n=ei-si+1;
		if(n%2==0)
		{
			return (arr[si+n/2]+arr[si+(n/2-1)])/2;
		}
		else
		{
			return (arr[si+n/2]);
		}
		
	}

}
