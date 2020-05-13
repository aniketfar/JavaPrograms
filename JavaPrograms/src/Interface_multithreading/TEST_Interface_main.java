package Interface_multithreading;

public class TEST_Interface_main {

	public static void main(String[] args){
		
		/*
		 * cannot print System.out.println(min_bal); directly because its static in nature
		 * for this give classname/interface_name.var_name 
		 */
		
		System.out.println(USbank.min_bal);
	
		HSBCbank hs = new HSBCbank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.carLoan();
		hs.educationLoan();
		
		
		// dynamic polymorphism
		//Child class object can be referred by parent interface reference variable
		//Only and Only Overridden methods will be called
	
		USbank b =  new HSBCbank();
		b.credit();
		b.debit();
		b.transfermoney();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

