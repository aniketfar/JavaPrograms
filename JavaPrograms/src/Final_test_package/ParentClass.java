
/*
 * if we dont want child to inherit from child class the simply type final keywd
 * 1. To prevent inheritance --- "public final class ParentClass"
 * 2. To prevent method overriding -----  "public final void start()"
 * 
 */


package Final_test_package;

public class ParentClass {	
	
	public final void start()
	{
		System.out.println("Parent -- start");
	}
	
}
