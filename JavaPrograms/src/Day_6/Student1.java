package Day_6;

public class Student1 {
	
	String name;
	int id,age,percentage;
	
	
	public Student1(String name,int id,int age, int percentage) {
		
		this.name = name;
		this.id = id;
		this.age = age;
		this.percentage = percentage;
		
	}


	
	void display(){
		
		System.out.println("ID" + id);
		System.out.println("Name" +name);
		System.out.println("Age" +age);
		System.out.println("Percentage: " +percentage);
		
		
		
	}	
	
	
	

}
