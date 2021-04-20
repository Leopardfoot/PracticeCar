package main;

public class Engine extends CarPart implements CarFunction {
	public String displacement;
	public boolean ignition;
	public boolean oiled;
	
	public void status() {
		System.out.println("status of Engine is: " + condition + "%");
	}
	
	public void function() {
		//Engine.start(CarPart.Fueltank.fuel, CarPart.Transmission.gear );
		
		if (ignition == true && displacement == "V8" && oiled == true) {
			this.condition -= 8;
			
			this.status();
			System.out.println("Engine in the green.");
		}
		
		else if (ignition == true && oiled == true) {
			this.condition -= 12;
			this.status();
			System.out.println("Engine in the yellow.");
		}
		
		else if (ignition == true) {
			this.condition -= 26;
			System.out.println("Engine in the red.");
		}
		else {
			this.status();
			System.out.println("Engine is off.");
		}
	}
	
	/*public void start(int fuel, int gear) {
		if (fuel > 0 && gear == 1) {
			ignition = true;
		}
		else {
			ignition = false;
		}
	}*/
}
