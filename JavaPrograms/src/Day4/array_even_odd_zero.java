package Day4;

public class array_even_odd_zero {

	public static void main(String[] args) {
		
		
		int even_cnt = 0 , odd_cnt = 0 , zero_cnt = 0;
		
		int arr2[] = {1,2,0,4,8}; 
		
		for (int i = 0; i < arr2.length; i++) {
			
			if (arr2[i]== 0) {
				zero_cnt++;
			
			}
			else if (arr2[i]%2 == 0) {
				
				even_cnt++;
			}
			else {
				odd_cnt++;
			}
			
		}
		System.out.println("Even count: " + even_cnt + "Odd count: " + odd_cnt + "Zero Count" + zero_cnt);
		
		

	}

}
