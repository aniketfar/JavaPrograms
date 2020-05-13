package Singleton_Concept;

public class Singleton {

	

		//Singleton class is a special class that can have only and only one object
		//		only single instance of the class at a time
		//	If try to create another object it point to the same earlier object
		
//		After first time, if we try to instantiate the Singleton class,
//		the new variable also points to the first instance created. 
		
//		Normal class vs Singleton class: Difference in normal and singleton 
//		class in terms of instantiation is that, For normal class we use constructor, 
//		whereas for singleton class we use getInstance() method.
		
		
//		how to design the singleton class
//		1. make constructor as private
//		2. write a public static method (getInstance) that has return type of object of this singleton class 
//		(lazy initialization)
		
		
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton(){
		str = "Hey I  am using singleton pattern";	
	}
	
	private static Singleton getInstance(){
		
		if(singleton_instance == null){
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
	
	x.str = (x.str).toUpperCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	z.str = (z.str).toLowerCase();
	
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	}
		 
	
	
	
	
	
	
}

	
