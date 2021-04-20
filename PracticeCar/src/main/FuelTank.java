package main;

public class FuelTank extends CarPart {
	public int fuel;
	public void status() {
		System.out.println("Wear on fueltank:" + condition + "%");
	}
	public void function() {
		if (fuel >= 100) {
			this.status();
			System.out.println("Fuel is full.");
		}
		else if (fuel > 50) {
			this.status();
			System.out.println("Above half fuel.");
		}
		else if (fuel < 50 && fuel > 0) {
			this.status();
			System.out.println("Fuel is running out.");
		}
		else {
			this.status();
			System.out.println("Fuel is empty.");
		}
	}
}
