
public class fibonnacitest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonnaci_test2();


	}
	
	public static void fibonnaci_test2()
	{
		int n1 = 0,n2 = 1, n3, count = 10;
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<=count;++i)
		{
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
			System.out.println(n3);
		}
		
		
	}
	

}
