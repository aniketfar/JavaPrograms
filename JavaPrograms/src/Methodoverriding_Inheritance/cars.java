package Methodoverriding_Inheritance;

public class cars extends Vehicle { //Has-a relationship
	
	public void start() {
		System.out.println("CAr --- start");
		
	}
	
	
	public void stop() {
		System.out.println("CAr --- stop");
		
	}

	
	public void refuel() {
		System.out.println("Car --- refuel");
		
	}
}
