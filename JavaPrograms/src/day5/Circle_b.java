package day5;

public class Circle_b {

	public static void main(String[] args) {
		Circle_a cir = new Circle_a();
		
		cir.acceptData(5);
		System.out.println("Area : " +cir.calArea());
		
		//or
		
		float area = cir.calArea();
		System.out.println("AREA :" +area);
		
	}

}
