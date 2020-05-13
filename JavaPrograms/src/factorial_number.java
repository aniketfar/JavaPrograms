import Day2.factorial;

public class factorial_number {

		
	
	//fact of 3 = 3 * 2 * 1 = 6
//	fact of 4 = 4 * 3 * 2 * 1 = 24
//	fact of 5 = 5 * 4 * 3 * 2 * 1 = 120
//	fact of 1 = 1
//	fact 0 = 1
	
	
//	1. without recursive for loop
	
	
public static int factorials(int num){
	int fact = 1;
	if(num == 0)
		return 1;
	for(int i = 1;i <= num; i++){
		fact = fact * i;
	}
	
	return fact;
	
}




//2. recursive function -  function calling itself

	public static int factorial2(int num){
		if (num == 0)
		return 1;
		
		else
			return(num * factorial2(num - 1));
	}



	
	public static void main(String[] args) {
		
		System.out.println(factorials(4));
		System.out.println(factorials(1));
		System.out.println(factorials(0));
		
		
		System.out.println(factorials(3));
		System.out.println(factorials(0));
		System.out.println(factorials(1));
		
		
		
		
		}
	}
