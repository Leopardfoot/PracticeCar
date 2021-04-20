package main;

import java.util.ArrayList;

public class Car {
	
	ArrayList<CarPart> carList = new ArrayList<>();
	
	public Car(int gas, int celsius, int stick, int rate, boolean start, boolean oil, String power) {
		super();
		FuelTank Tank = new FuelTank();
		Tank.fuel = gas;
		Radiator Cooler = new Radiator();
		Cooler.temp = celsius;
		Transmission Gearbox = new Transmission();
		Gearbox.gear = stick;
		Wheel Tire = new Wheel();
		Tire.rpm = rate;
		Engine Motor = new Engine();
		Motor.ignition = start;
		Motor.oiled = oil;
		Motor.displacement = power;
		
		this.carList.add(Tank);
		this.carList.add(Cooler);
		this.carList.add(Gearbox);
		this.carList.add(Tire);
		this.carList.add(Motor);
	}
	
	
	public void run() {
		System.out.println("I am running.");
		for (int i = 0; i < carList.size(); i++ ) {
			this.carList.get(i).function();
		}
		//this.carList.get(1).function();
	};
}
