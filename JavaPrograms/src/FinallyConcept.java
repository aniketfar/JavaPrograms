
public class FinallyConcept {

	public static void main(String[] args) {
		
		
		// static methods can be directly called without any object creation	
		test1();
		test2();
		division();
		division_nullexception();
	
	}
	
	
	// Interview questions
	
	public static void division_nullexception() {
		int l = 10;
		try{
			
			System.out.println("inside try block!");
			int k = 1/0;
					
		}
		catch (NullPointerException e) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
			System.out.println("Inside finally block div2");
		}
		
		
	}
		
	
	
	public static void division() {
		int i = 10;
		try{
			System.out.println("inside try block");
			int k = i/0;
			
		}
		catch (ArithmeticException e) {
			System.out.println("Inside catch block");
			System.out.println("divide by zero exception");
			
		}
		finally{
			System.out.println("execute this code even after exceptions");
		}
		
	}
	
	public static void test1() {
		try {
			
			System.out.println("inside test1 method");
			throw new RuntimeException();
		} 
		catch (Exception e) {
			System.out.println("inside catch block");
			
		}
		finally {
			
			System.out.println("inside finally block");
			
		}
		
	}
		
	public static void test2() {
		
		try{
			System.out.println("inside test2 try block");
		}
		finally{  // finally block does not require any execption
			System.out.println("inside finally test2");
		}
	}


}
