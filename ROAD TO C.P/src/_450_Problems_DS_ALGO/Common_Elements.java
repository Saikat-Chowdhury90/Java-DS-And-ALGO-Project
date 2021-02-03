package _450_Problems_DS_ALGO;

import java.util.ArrayList;
import java.util.Scanner;

public class Common_Elements {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
	    int n1=s.nextInt();
	    int A[]=new int[n1];
	    for(int i=0;i<n1;i++)
	    {
	    	A[i]=s.nextInt();
	    }
	    int n2=s.nextInt();
	    int B[]=new int[n2];
	    for(int i=0;i<n2;i++)
	    {
	    	B[i]=s.nextInt();
	    }
	    int n3=s.nextInt();
	    int C[]=new int[n3];
	    for(int i=0;i<n3;i++)
	    {
	    	C[i]=s.nextInt();
	    }
	    
	   ArrayList<Integer> output= func(A,B,C,n1,n2,n3);
	   System.out.println(output);

	}

	private static ArrayList<Integer> func(int[] A, int[] B, int[] C, int n1, int n2, int n3) 
	{
		if(n1==0 ||n2==0||n3==0)
	       {
	           return null;
	       }
	        ArrayList<Integer> output=new ArrayList<Integer>();
	        int i=0;int j=0;int k=0;int temp=0;
	        while(i<n1 && j<n2 && k<n3)
	        {
	            int num=A[i];
	            if(num<B[j] || num<C[k])
	            {
	                i++;
	            }
	            else if(A[i]!=B[j])
	            {
	                j++;
	            }
	            else if(B[j]!=C[k])
	            {
	                k++;
	            }
	            else
	            {
	            	if(temp==0)
	                {
	                 output.add(A[i]);
	                 temp++;
	                 
	                }
	                else if(output.get(temp-1)!=A[i])
	                {
	                    
	                        output.add(A[i]);
	                        temp++;
	                 
	                        
	                    
	                }
	                
	                i++;
	                j++;
	                k++;
	            }
	        }
	        
	        return output;
	}

}
