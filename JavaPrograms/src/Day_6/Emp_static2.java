package Day_6;

public class Emp_static2 {

	public static void main(String[] args) {
		
		
		System.out.println("Total no. of objects are created" +Emp_static1.count);
		Emp_static1 emp1 = new Emp_static1(1, 22, 100, "Aniket");
		emp1.display();
		
		System.out.println("Total no. of objects created are"+ Emp_static1.count);
		Emp_static1 emp2 = new Emp_static1(2, 23, 200, "Pratik");
		emp2.display();
		
		System.out.println("Total no. of objects created are"+ Emp_static1.count);
		Emp_static1 emp3 = new Emp_static1(3, 24, 345, "Troy");
		emp3.display();
		

	}

}
