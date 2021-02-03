package _450_Problems_DS_ALGO;


	import java.util.ArrayList;

	public class MaxPriorityQueue {
		private ArrayList<Integer> heap;
	    public MaxPriorityQueue()
	    {
	        heap=new ArrayList<Integer>();
	    }
	    public int getSize()
	    {
	        return heap.size();
	    }
	    public boolean isEmpty()
	    {
	        if(getSize()==0)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	            
	    }
	    public void insert(int ele)
	    {
	        heap.add(ele);
	        int childindex=heap.size()-1;
	        int parentindex=(childindex-1)/2;
	        while(childindex>0)
	        {
	            if(heap.get(childindex)>heap.get(parentindex))
	            {
	                int temp=heap.get(parentindex);
	                heap.set(parentindex,heap.get(childindex));
	                heap.set(childindex,temp);
	                childindex=parentindex;
				    parentindex=(childindex-1)/2;
	            }
	            else
	            {
	                return;
	            }
	        }
	    }
	    public int getMax()
	    {
	        if(isEmpty())
	        {
	            return Integer.MAX_VALUE;
	        }
	        return heap.get(0);
	    }
	    public int removeMax()
	    {
	         if(isEmpty())
	        {
	            return Integer.MAX_VALUE;
	        }
	        int ans=heap.get(0);
	        heap.set(0,heap.get(heap.size()-1));
	        heap.remove(heap.size()-1);
	        int parentindex=0;
	        int leftchildindex=2*parentindex+1;
	        int rightchildindex=2*parentindex+2;
	        while(leftchildindex<heap.size())
	        {
	           int maxindex=parentindex;
	           if(heap.get(leftchildindex)>heap.get(maxindex))
	           {
	             maxindex=leftchildindex;
	           }
	         if(rightchildindex<heap.size()&&heap.get(rightchildindex)>heap.get(maxindex))
	           {
	            maxindex=rightchildindex;
	           }
	            if(maxindex==parentindex)
	            {
	                break;
	            }
	        int temp=heap.get(parentindex);
	        heap.set(parentindex,heap.get(maxindex));
	        heap.set(maxindex,temp);
	        parentindex=maxindex;
	        leftchildindex=2*parentindex+1;
		    rightchildindex=2*parentindex+2;
	        }
	        return ans;
	    }
	}


