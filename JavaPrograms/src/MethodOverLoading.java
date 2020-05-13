
	

//	Method overloading --> when the method name is same with different arguments (different data types)
//	or input parameters within the same class
//	you cannot create method inside a method
//	Duplicate methods -- i.e same method name with same number of arguments are not allowed
//	We cannot create duplicate methods
	
	

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj = new MethodOverLoading();
		obj.sum();
		obj.sum(10);
		obj.sum(2, 5);
		obj.main(4);

	}
	
	
	
	public void  main(int s) {
		System.out.println("duplicate main method");
		System.out.println(s);
	}
	
	
	
	public void sum() { //0 input param
		System.out.println("sum method --- zero parameter");
		

	}
	
	public void sum(int i) { //1 input param
		System.out.println("sum method --- one parameter");
		System.out.println(i);
		
	}
	
	public void sum(int k, int l) { //2 input param
		System.out.println("sum method --- two parameter");
		System.out.println(k + l);
	}
	
	
	
	
}
