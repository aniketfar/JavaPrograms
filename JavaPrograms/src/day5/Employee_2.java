package day5;



public class Employee_2 {

	public static void main(String[] args) {
		
		Employee_1 emp1 = new Employee_1();
		emp1.acceptData(1, 29, "Aniket", 100);
		emp1.display();
		
		Employee_1 emp2 = new Employee_1();
		emp2.acceptData(2, 25, "TROY", 200);
		emp2.display();
		
		
		if (emp1.sal>emp2.sal) {
			
			System.out.println(emp1.id + "\t" + emp1.name);
		}
		else {
			System.out.println(emp2.id + "\t" + emp2.name);
		}
		
	}

}
