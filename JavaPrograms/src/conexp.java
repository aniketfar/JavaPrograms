
public class conexp {
	
	
	
		private int var;
		
		
		public conexp() {
			
			this.var = 10;
			}
		
		
		
		public conexp(int num){
			
			this.var =num;
		}
		
		
		
		
		
		public int getValue(){
			return var;
			
		}	

	public static void main(String[] args) {
		
		conexp obj1 = new conexp();
		conexp obj2 = new conexp(100);
		
		
		System.out.println(obj1.getValue());
		System.out.println(obj2.getValue());

	}

}
