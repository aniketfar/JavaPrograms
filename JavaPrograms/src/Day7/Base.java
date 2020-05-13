package Day7;

public class Base {

	
	Base()
	{
		
		void show()
		{
		System.out.println("In base class show method");
		}
	}
	
	
	
	public class Derived extends Base
	{
		void show()
		{
			System.out.println("In derived class show method");
		}
		
	}
	
	
	void display()
	{
		show();
		super.show();
	}
	
	
		private void show() {
		// TODO Auto-generated method stub
		
	}


		public static void main(String args[])
		{
			Derived d = new Derived;
							
		}
		
		
		
}
