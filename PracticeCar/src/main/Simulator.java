package main;


public class Simulator {

	public static void main(String[] args) {
		// Create a specific Dodge vehicle into the car class vehicle constructor which can take particular specs and make your car.
		Car Dodge = new Car(75, 55, 3, 65, true, true, "V8");
		
		//troubleshooting the Dodge object
		System.out.println(Dodge.carList);
		
		Dodge.run();

	}

}
