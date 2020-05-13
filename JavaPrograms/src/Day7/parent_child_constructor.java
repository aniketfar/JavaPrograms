package Day7;

public class parent_child_constructor {


	 parent_child_constructor() {

		 System.out.println("In class A");
		 
	}
	 
	 public class Child extends parent_child_constructor
	 {
		
		  Child() {
		
			super(10); 
			 System.out.println("In child class constructor");
			 
		
		 
		 }
		  
		  public static void main() {
			  
			  parent_child_constructor obj = new parent_child_constructor();
			
		}
		 
	 }

}