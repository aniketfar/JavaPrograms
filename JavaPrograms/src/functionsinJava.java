
public class functionsinJava {

	public static void main(String[] args) {

		functionsinJava obj = new functionsinJava();

		obj.test();

		int d = obj.sum();
		System.out.println(d);

		String s = obj.PQR();
		System.out.println(s);

		int x = obj.div(30, 10);
		System.out.println(x);

		int z = obj.div(50, 5);
		System.out.println(z);

	}

	// 1. Cannot create a function inside a function
	// 2. fcuntions are independent to each other
	// 3. functions are parallel to each other

	/*
	 * 1. No input No output void -- does not return any value
	 */
	public void test() { // 0 param
		System.out.println("TEST Method");
	}

	public void test(int i) { // 1 param
		System.out.println("TEST Method");
	}

	public void test(int i , int j) { // 2 param
		System.out.println("TEST Method");
	}

	// 2. No input some output
	// Return type - int
	public int sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public String PQR() {
		System.out.println("PQR method");
		String S = "Selenium";
		return S;
	}

	// 3. some input some output
	public int div(int x, int y) {
		System.out.println("div method");
		int z = x / y;
		return z;
	}

	public String sendmail(int p, String q) {
		System.out.println("SEnd mail methiod");
		String h = p + q;
		return h;
	}

}
