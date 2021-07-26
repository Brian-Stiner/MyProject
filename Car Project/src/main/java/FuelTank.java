
public class FuelTank extends CarPart {
	
	private double fuel;
	private double sentfuel;
	
	public FuelTank() {
		this.fuel = 10;
		this.sentfuel = 0;
		this.name = "fuel tank";
	}
	
	public void function() {
		super.function();
		if(fuel<.01) {
			System.out.println("Out of fuel!");
			this.fuelLeft();
		}
		else if(fuel>=1){
			this.fuel-=.001;
			
		}
		else {
			System.out.println("Warning: Low fuel!");
			this.fuel-=.001;
		}
	}
	
	//Overloaded function to use more fuel depending on 
	//how pressed the pedal is from 0.0 to 1.0 
	//max acceleration uses 10x fuel each tick
	public void function(double acceleration) {
		this.function();
		sendFuel(acceleration);
	}

	public void sendFuel(double acceleration) {
		this.sentfuel = .001* acceleration;
		this.fuel -= sentfuel;
	}
	
	public void fuelLeft() {
		System.out.println(fuel+" gallons of fuel left.");
	}
	
	public double getSentFuel() {
		System.out.println(" Fyel sent "+ sentfuel);
		return sentfuel;
	}
	
}