package main;

public class CarPart implements CarFunction {
	public int condition = 100;
	
	public void status() {
		System.out.println("status of car" + condition + "%");
	}
	
	/*public interface carFunction {
		public void function();
	}*/
	
	public void function() {
		
	}
}
