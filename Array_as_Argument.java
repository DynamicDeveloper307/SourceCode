class Array_as_Argument
{
	void get(int p[])
	{
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]);
		}
	}
	
	public static void main(String args[])
	{
		int arr[]=new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		Array_as_Argument ap=new Array_as_Argument();
		ap.get(arr);
		
	}
	
}
