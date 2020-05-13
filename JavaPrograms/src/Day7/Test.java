package Day7;

import Day7.Shape.Circle;
import Day7.Shape.Rectangle;
import Day7.Shape.Square;

public class Test {

	Shape createShape(int choice)
	{
		
		if (choice == 1) 
		{
			Circle c = new Circle();
			return c;
			
		} else if(choice == 2)
		{
			Rectangle r = new Rectangle();
			return r;
				

		}
		 else if(choice == 3)
		 {
			 Square s = new Square();
			 return s;
			 
		}
		 else{
			 Shape s1 = new Shape();
			 return s1;
			 
		 }
		
		
	}
	
	public static void main(String args[]) 
	{
		Test t = new Test();
		Shape ref = t.createShape(1);
		ref.draw();
		
	}
	
	
}
























