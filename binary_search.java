import java.util.*;

class binary_search
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int search=sc.nextInt();
		
		int arr[]={2,4,8,9,12,47,56};
		
		int first=0;
		int last=arr.length-1;             // suppose 45 input 
		int middle=(first+last)/2;
		
		while(first<=last)
		{
			if( arr[middle] < search )
			{
				first = middle + 1;
			}
			else if(arr[middle] == search)
			{
				System.out.println(search + " search found at location " + (middle + 1));
				break;
			}
			else
			
					last = middle -1;
					middle = (first + last)/2;
			
		}
		if(first > last)
		{
			System.out.print("Value not found in list");
		}
			
		}
		
		
		
	}
