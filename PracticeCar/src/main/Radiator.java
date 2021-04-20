package main;

public class Radiator extends CarPart {
	public int temp;
	
	public void status() {
		System.out.println("Radiator wear from heat: " + this.condition + "%");
	}
	
	public void function() {
		if (temp <= 50) {
			System.out.println("Radiator is cool.");
			this.status();
		}
		else if (temp > 50 && temp < 100) {
			this.condition -= 20;
			System.out.println("Radiator is warm");
			this.status();
		}
		else if (temp >= 100 && temp < 200) {
			this.condition -= 65;
			System.out.println("Radiator is overheating.");
			this.status();
		}
		else {
			this.condition -= 100;
			System.out.println("Radiator is blown out.");
			this.status();
		}
	}
	
}
