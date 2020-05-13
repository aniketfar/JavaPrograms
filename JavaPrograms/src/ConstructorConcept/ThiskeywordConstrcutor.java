package ConstructorConcept;

public class ThiskeywordConstrcutor {

	String name;
	int age;
	
	
	public  ThiskeywordConstrcutor(String name, int age){
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		
		ThiskeywordConstrcutor ob = new ThiskeywordConstrcutor("Aniket",30);
		
		
	}

}
