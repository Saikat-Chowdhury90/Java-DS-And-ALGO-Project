package _450_Problems_DS_ALGO;

public class String_Rotation_of_each_other_or_not {

	public static void main(String[] args) 
	{
		String str1="ABCD";
		String str2="CDAB";
		String temp=str1+str1;
		
		if(str2.length()==str1.length())
		{
			int j=0;
			for(int i=(temp.length()/2)-1;i<temp.length();i++,j++)
			{
				System.out.print(temp.substring(j, i+1) +" ");
				if(str2.equals(temp.substring(j, i+1)))
				{
					
					System.out.println(true);
					return;
				}
			}
		}
		System.out.println(false);

	}

}
