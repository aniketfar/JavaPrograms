package day5;

public class Area_overload {
	
	
void area(int radius)
{
	System.out.println("Area of Circle" + (3.14f*radius*radius));
}
	
void area(int len, int breadth)
{
	System.out.println("Area of rectangle is: " +(len*breadth));
}

void area(float side)
{
	System.out.println("Area of square is:" +(side*side));
}

void area(int base , float height)
{
	System.out.println("Area of triangle is: "+(0.5*base*height));
}


}
