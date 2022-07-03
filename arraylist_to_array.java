import java.util.*;
class arraylist_to_array
{
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		int ar[]=new int[al.size()];
		
		for(int i=0;i<al.size();i++)
		{
			ar[i]=al.get(i);
		}
		
		for(int temp : ar)
		{
			System.out.println(temp);
		}
		
	}
}