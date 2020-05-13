
public class consample {

	
	private int var;
	
	public consample(int num){
		
		this.var =  num;
		  
	}
	
	
	public int getValue(){
		return var;
	}
	
	
	
	public static void main(String[] args) {
		
		consample obj = new consample();
		System.out.println(obj.getValue());
		

	}

}
