package Day2;

public class nestedifelse {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;
		int c = 3;

		if (a > b) 
		{
			if (a > c)
			{
				System.out.println(a+"is largest of 3 numbers");
			}
			else 
			{

				System.out.println(c+"is largest of 3 nos");
			}
		}
		else
		{
			if(b > c)
			{
				System.out.println(b+"is largest of 3 no.");
			}
			else
			{
				System.out.println("end of code");
			}
		
		}
		
	}

}
