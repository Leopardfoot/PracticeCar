package main;

public class Wheel extends CarPart {
	public int rpm;
	public void status() {
		System.out.println("The wear on the tires is at: " + this.condition + "%");
	}
	public void rotation() {
		System.out.println("Tires are spinning at: " + rpm + " rotations per minute.");
	}
	public void function() {
		if (rpm < 50) {
			this.rotation();
			this.status();
		}
		else {
			this.condition -= rpm;
			this.rotation();
			this.status();
		}
	}
}
