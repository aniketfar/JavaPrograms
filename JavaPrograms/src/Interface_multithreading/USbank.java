
/*
 * 1. Only method declaration
 * 2. no body method -- only prototype
 * 3. In interface, we can declare the variables, vars are default static in nature
 * 4. vars value will not be changed
 * 5. No static method in interface
 * 6. no main method
 * 7. We cannot create the object of interface
 * 8. Interface is abstract in nature
 *  
 */
		



package Interface_multithreading;

public interface USbank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	
	
}
