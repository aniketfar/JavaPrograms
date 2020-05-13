package Day4;

public class array_max_element {

	public static void main(String[] args) {

			int arr3[] = {10,1,53,9,70,8};
			
			int max = 0;
			
			for (int i = 0; i < arr3.length; i++) {
				
				//System.out.println(arr3[i]);
				
				if (arr3[i]>max) 
				{
					max = arr3[i];
					
				}
			
				
			}
			
			System.out.println(max);

	}

}
