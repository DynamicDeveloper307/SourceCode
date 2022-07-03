import java.util.*;

class employee
{
	int salary;
	String name;
	int age;
	
	public employee(int salary,String name,int age)
	{
		this.salary=salary;
		this.name=name;
		this.age=age;
	}
}

class arraylist_with_object
{
	public static void main(String args[])
	{
		employee e1=new employee(15000,"paras",21);
		employee e2=new employee(9000,"jaydeep",23);
		employee e3=new employee(5000,"kuldeep",17);
		
		ArrayList<employee> al=new ArrayList<employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			employee em=(employee)itr.next();
			System.out.print(em.salary + " " + em.name + " " + em.age);
			System.out.println();
		}
		
		
		
	}
}