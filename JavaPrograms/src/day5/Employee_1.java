package day5;

public class Employee_1 {
	
	int id, age, sal;
	String name;
	
	void acceptData(int id1, int age1 , String name1, int sal1)
	{
		id = id1;
		age = age1;
		name = name1;
		sal = sal1;
		
	}
	
	void display()
	{
		System.out.println("ID :" +id );
		System.out.println("AGE : " +age);
		System.out.println("NAME :" +name);
		System.out.println("SAL :" +sal);
	}
	

}
