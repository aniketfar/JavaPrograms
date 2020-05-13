package Day2;

public class factorial {

	public static void main(String[] args) {
		
		int a = 4;
		int fact;
		
		while (a > 1) 
		{
			
			fact = fact * a;
			a--;
		}
			System.out.println(fact);
	}

}
