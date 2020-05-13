
		//finalize method is called just as a cleanup process when we use garbage collector


public class FinalizeConcept {

	public void finalize() {
		
		System.out.println("finalize method");
		
	}
	
	
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc(); /*Runs the garbage collector.Calling the gc method suggests that
		 			*  the Java VirtualMachine expend effort toward recycling unused objects in order tomake the memory 
		 			*/
	
	}

}
