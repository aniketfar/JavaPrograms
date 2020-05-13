
public class StaticandNonStacticconcept {
	
//	Global variables --> the scope of variables will be available across all the functions with some conditions
	
	String name = "Tom"; //this is global non static variable
	static int age = 25; //this is global Static variable
	
	public static void main(String[] args) {
		
//		How to do you call static methods and vars
//		1. direct calling
		
		sum();
		
		 
//		2.Calling by class name
		
		StaticandNonStacticconcept.sum();
		
		
		System.out.println(age);
		System.out.println(StaticandNonStacticconcept.age)	;
		
		
//		How to call non static methods and var
		
		StaticandNonStacticconcept obj = new StaticandNonStacticconcept();

		obj.sendMail();
		System.out.println(obj.name);
				
		
//		Can I access static methods by using object reference? Yes
		
		obj.sum(); //Warning this static method has to called by static way.
		
		
	
	}
	
	
	public void sendMail(){ //Non Static method
		System.out.println("send mail method");
	}
	
	
	public static void sum() { //Static method
		System.out.println("Sum method");
	}
	

	
	
	

}
