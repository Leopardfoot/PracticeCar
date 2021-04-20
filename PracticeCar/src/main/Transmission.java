package main;

public class Transmission extends CarPart implements CarFunction {
	public int gear;
	public void status() {
		System.out.println("The condition of the Transmission is: " + this.condition + "%");
	}
	public void function() {
		if (gear == 1) {
			System.out.println("Kicking it into first gear.");
			this.status();
		}
		else if (gear == 2 || gear == 3) {
			condition -= 12;
			System.out.println("Switching to low gear.");
			this.status();
		}
		else if (gear == 4 || gear == 5) {
			condition -= 45;
			System.out.println("Going to high gear, high speeds");
			this.status();
		}
		else {
			condition -= 75;
			System.out.println("Where we're going, we don't need roads.");
			this.status();
		}
	}
}
