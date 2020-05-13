
public class CallbyvalorCallbyref {
	
	int p;
	int q;
	
	public static void main(String[] args) {

		CallbyvalorCallbyref obj = new CallbyvalorCallbyref();
		
		
		int x = 10;
		int y = 20;
		
		int result = obj.sum(x, y); // Call by value or pass by  value
					   // photocopy of input parameters	
		
		System.out.println(result);
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		//after swap 
		
		System.out.println(obj.p);
		System.out.println(obj.q);			
	}
	
	
	public int sum(int a, int b) {
		a = 40;
		b = 30;
		
		int c = a + b;
		return c;
	}
	
	//Call by reference
	public void swap(CallbyvalorCallbyref t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
		
	}
}
