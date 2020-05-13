
public class parentclass {
	
	public parentclass() {
		// TODO Auto-generated constructor stub
	
		System.out.println("This is parent go home");
	
	
	}
	
	
		class child extends parentclass
		{
			
					 child(){
						
						System.out.println("I am not going");
						
					}
			
				
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parentclass obj = new parentclass();
		child obj2 = new child();
		
		new child();

	}

}
