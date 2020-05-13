package ConstructorConcept;

/*
 * Constrcutor is a class entity which is used to define some class features while creatoing the objects
 * Constructor is not a function
 * it does not return any value
 * Constructor name should be same as class name
 * it does not require any return type
 * Constructor can be method overloaded 
 * 
 * 
 */


public class Constructor1 {
	
	
//	default constrcutor 
	public Constructor1(){
		System.out.println("Default Constructor");
	}
 	 
	public Constructor1(int i){
		System.out.println("1 param");
		System.out.println("value of i" + i);	
	}
	
	
	public Constructor1(int i, int j)
	{
		System.out.println("2 param");
		System.out.println("value of i" + i);
		System.out.println("value of j" + j);
	}
	
	
	

	public static void main(String[] args) {

		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1(10);
		Constructor1 c3 = new Constructor1(20,30);
		
			
	}

}
