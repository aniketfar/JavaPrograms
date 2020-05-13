
public class constructor3 {
	
	
	
	int empid;
	String empname;
	
	
	constructor3(int id, String name)
	{
			this.empid = id;
			this.empname = name;	
	}
		void info(){
			
			System.out.println("id : " + empid + "empname : " + empname);
		}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor3  obj1 = new constructor3(5, "Aniket");
		constructor3  obj2 =  new constructor3(6, "Shivani");
		obj1.info();
		obj2.info();
		

	}

}
