import java.util.*;
class array_to_arraylist
{
	public static void main(String args[])
	{
		int ar[]={1,2,3,4,5};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int temp : ar)
		{
				al.add(temp);
		}
		
		for(int gg : al)
		{
			System.out.println(gg);
		}
		
	}
}