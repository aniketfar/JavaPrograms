package day5;

public class sample {
	
	
	int a,b;
	void accept(int a, int b)
	{
		System.out.println(a + "\t" + b);
		a = a;
		b = b;
	}

	
	//  "this" keyword
	
	
	void accept1(int a, int b)
	{
		System.out.println(a + "\t" + b);
		this.a = a;
		this.b = b;
	}
	
	void show()
	{
		System.out.println(a + "\t" + b);
		
	}
}
