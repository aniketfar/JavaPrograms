package Methodoverriding_Inheritance;



/*
 * When same methods is present in parent class as well as in child class with same name 
 * and same no. of arguments is called Method Overriding 
 * 
 */
	
public class Methodoverriding_Inheritance {

	public static void main(String[] args) {

		
		// Static polymorphism - compile time polymorphism
		
		BMW b = new BMW();
		b.start(); //this is BMW start method OVERRIDEN METHOD
		b.stop();
		b.refuel();	
		b.theftsafety();	
		
		
		System.out.println("********");
		
		cars c = new cars();
		c.start();
		c.stop();
		c.refuel();
		//c.theftsafety
		//parent class cannot access all child class methods
		
		
		System.out.println("*****");
		
		
		//Top casting
		cars c1 = new BMW(); //Child class object can be referred to as parent class reference variable
							//dynamic polymorphism ---- run-time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.theftsafety
		//parent class cannot access all child class methods
		
		//down Casting - degrading the parent class into child class object and referred by child class reference
		BMW b1 = (BMW) new cars(); // ClassCastException:
		
		
		
		
		
	}

}
