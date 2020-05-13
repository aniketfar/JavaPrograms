package Day_6;

public class Staticdemo {
	
	static {
		
		
		String OS = System.getenv("OS");
		if(OS.equals("Linux"))
		{
			System.out.println("you can proceed further");
		}
		else
		{
			System.out.println("Please check with your OS");
			System.exit(0);
		}
		
		
		
		
	}
	
	 public static void main(String[] args) {
		
		 System.out.println("In main");
	}
	

}
