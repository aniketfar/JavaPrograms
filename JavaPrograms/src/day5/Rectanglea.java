package day5;

public class Rectanglea {
		
		int length, breadth; 
		
		public void accept_data(int n1, int n2)
		{
			length = n1;
			breadth = n2;
		}
		
		public int calArea()
		{
			int area = length * breadth;
			return area;
			
		}
		
		
		public int calPerimeter()
		{
			int perimeter = 2*(length+breadth);
			return perimeter;
		}
		
		public void show()
		{
			System.out.println("Lenghth : " +length);
			System.out.println("breadth : " +breadth);
			System.out.println("Area : " +calArea());
			System.out.println("Perimeter : " +calPerimeter());
			
		}
		

	}


