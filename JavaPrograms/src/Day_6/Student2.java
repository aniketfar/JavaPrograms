package Day_6;

public class Student2 {

	public static void main(String[] args) {
		
	Student1 stud1 = new Student1("Aniket", 1, 12, 20);
	Student1 stud2 = new Student1("Aniket", 2, 12, 30);
	Student1 stud3 = new Student1("Aniket", 3, 12, 40);
	
		
		stud1.display();
		stud2.display();
		stud3.display();
		
		System.out.println("Name and id of the student which has highest percentage is ");
		
		if(stud1.percentage > stud2.percentage && stud1.percentage > stud3.percentage)
		{
			System.out.println(stud1.name+ "\t" +stud1.id);
		}
		else if(stud2.percentage > stud1.percentage && stud2.percentage > stud3.percentage)
		{
			System.out.println(stud2.name+ "\t" +stud2.id);
		}
		else{
			System.out.println(stud3.name+ "\t" +stud3.id);
		}

	}

}
