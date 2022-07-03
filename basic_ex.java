class first
{
	void display()
	{
		System.out.println("Base class");
	}
}

class second extends first
{
		void msg()
		{
			System.out.println("child class");
		}
}



class basic_ex
{
	public static void main(String args[])
	{
		first s=new second();
		s.display();
		s.msg();
	}
}