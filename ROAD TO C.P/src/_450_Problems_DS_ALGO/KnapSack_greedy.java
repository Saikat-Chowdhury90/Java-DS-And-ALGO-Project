package _450_Problems_DS_ALGO;

import java.util.Scanner;

public class KnapSack_greedy {

	
	private static void knapsack(int num, float[] weight, float[] profit, float capacity) 
	{
		float x[]=new float[20];
		float total_profit=0;
		int i,j;
		float u=capacity;
		for(i=0;i<num;i++)
		{
			x[i]=(float) 0.0;
		}
		for(i=0;i<num;i++)
		{
			if(weight[i]>u)
			{
				break;
			}
			else
			{
				x[i]=(float) 1.0;
				total_profit=total_profit+profit[i];
				u=u-weight[i];
			}
				
		}
		if(i<num)
		{
			x[i]=u/weight[i];
		}
		total_profit=total_profit+(x[i]*profit[i]);
		System.out.println("The result is:-");
		for(i=0;i<num;i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println(total_profit);
			
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float weight[]=new float[n];
		float profit[]=new float[n];
		float capacity;
		float ratio[]=new float[n];
		int num,i,j;
		float temp;
		System.out.println("Enter the number of objects ");
		num=s.nextInt();
		System.out.println("Enter the weights and profits of each objects :-");
		for (i = 0; i < num; i++)
		{
			weight[i]=s.nextFloat();
			profit[i]=s.nextFloat();
			
		}
		System.out.println("Enter the capacity of Knapsack");
		capacity=s.nextFloat();
		for(i=0;i<num;i++)
		{
			ratio[i]=profit[i]/weight[i];
		}
		for(i=0;i<num;i++)
		{
			for(j=i+1;j<num;j++)
			{
				if(ratio[i]<ratio[j])
				{
					temp=ratio[j];
					ratio[j]=ratio[i];
					ratio[i]=temp;
					
					temp=weight[j];
					weight[j]=weight[i];
					weight[i]=temp;
					
					
					temp=profit[j];
					profit[j]=profit[i];
					profit[i]=temp;
				}
			}
		}
		knapsack(num,weight,profit,capacity);
	}

	

}
