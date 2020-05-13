package Interface_multithreading;

public class HSBCbank implements USbank, BrazilBank { // We are acheiving multiple inheritance
	
/*	 Is - a relationship
 * If a class is implementing any Interface, then its mandatory to define/override all the method of interface
 */


	
	//3 methods are overridding from USbank
	public void credit(){
		System.out.println("hsbc -- credit");		
	}
	
	public void debit(){
		System.out.println("hsbc -- debit");
	} 
	
	public void transfermoney(){
		System.out.println("transfer -- money");
	}
	
	
	//Seperate class methods
	public void educationLoan() {
		System.out.println("hsbc -- edu -- loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc -- car -- loan");
	}
	
	
	//Brazilbank bank method: overriding from Brazilbank
	
	public void Mutualfunds() {
		System.out.println("brazil bank -- mutual funds");
	}
	
	
	
	
}
