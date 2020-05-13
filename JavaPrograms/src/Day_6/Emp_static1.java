package Day_6;

public class Emp_static1 {
	
	int id,age,sal;
	String name;
	static String company_name = "Etan tech";
	static int count;
	
	public Emp_static1(int id,int age, int sal, String name) {
		
		this.id = id;
		this.age = age;
		this.sal = sal;
		this.name = name;
		count++;
	
	}
	
	void display()
	{
		System.out.println("Id" + id);
		System.out.println("Name" +name);
		System.out.println("Age" +age);
		System.out.println("sal" +sal);
		System.out.println("Company_name :" +company_name);
		System.out.println("....................................................");
		
	}

	
	static void print()
	{
		System.out.println("In static method");
		
	}

}
