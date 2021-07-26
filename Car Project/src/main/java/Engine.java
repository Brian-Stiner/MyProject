
public class Engine extends CarPart{
	
	private double power;
	private int cylinders;
	
	public Engine() {
		this.power = 0;
		this.cylinders = 4;
		this.name = "engine";
	}
	
	public void function(){
		super.function();
		this.power*=.8;
		
	}
	public void function(double fuel, boolean charge) {
		super.function();
		if(charge) {
			this.power = fuel * 10 * cylinders;
		}	
	}
	public double getPower() {
		System.out.println("power generated" + power);
		return power;
	}
	

}
