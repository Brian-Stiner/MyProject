
public class Wheel extends CarPart {
	
	private double rpm;
	private int tirepressure;
	private int wheeldiameter;
	
	public Wheel() {
		this.rpm = 0;
		this.tirepressure = 30;
		this.wheeldiameter = 17;
	}
	
	public void function(){
		super.function();
		if(condition<10 && tirepressure>0) {
			this.tirepressure--;
			System.out.println("Warning: losing tire pressure!");
		}
	}

	public void function(double sentrpm) {
		this.function();
		if(sentrpm > this.rpm) {
			this.rpm += (sentrpm-this.rpm)*.6 ;
		}
		else{
			this.rpm -= (this.rpm-sentrpm)*.6 ;
		}
	}
	
	public double getSpeed() {
		// 17 inch wheels and rotations per minute to miles per hour
		return wheeldiameter * 3.1415 * rpm *.0000157828 * 60 ;
		
	}
	
}
