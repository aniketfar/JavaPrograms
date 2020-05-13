import java.util.Scanner;

/*
 
 *                 * 
 * *             * *
 * * *         * * *  
 * * * *     * * * *
 * * * * * * * * * *


	1. number of lines.
	2. Starts with 1 * and increment by one.
	3. Spaces in first line = (lines * 2) - 2


 */
	

public class Print_Pattern {

	public static void main(String[] args) {

	int lines = 0;
	int space = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter number of lines");
	
	lines = sc.nextInt();
	space = (lines*2)-2;
	
//	code 
	
	for (int i = 1; i <= lines ; i++) {  // number of lines
		
		//Left
		for (int L = 1; L <= i ; L++) {
			
			System.out.print("*");			
		}
		
		//space
		for (int S = 1; S <= space; S++) {
			
			System.out.print(" ");	
		}
		
		
		//right
		for (int R = 1; R <= i; R++) {
			System.out.print("*");	
		}
		
		space = space - 2;	
		
	}	
	
	}

}
