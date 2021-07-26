import java.util.HashMap;

public class Transmission extends CarPart{
	
	private int engineRPM;
	private int gear;
	HashMap<Integer, Double> gearbox;
	
	public Transmission() {
		this.engineRPM = 0;
		this.name = "transmission";
		this.gear = 1;
		
		gearbox = new HashMap<Integer, Double>();
		gearbox.put(1, 4.78);
		gearbox.put(2, 2.39);
		gearbox.put(3, 1.37);
		gearbox.put(4, 1.00);
	}
	
	public void function(){
		super.function();
		this.engineRPM *=.95;
		if(gear>1 && engineRPM <1100) {
			engineRPM+=1000;
			this.gear--;
		}
	}
	public void function(double power) {
		this.function();
		
		double enginepower = power * 1000;
		if(enginepower > this.engineRPM) {
			this.engineRPM += (enginepower - this.engineRPM)*.6 ;
		}
		else{
			this.engineRPM -= (this.engineRPM - enginepower)*.6 ;
		}
		if(gear<4 && engineRPM >3000) {
			engineRPM-=1500;
			this.gear++;
		}
		System.out.println("engineRPM" +  engineRPM);
	}
	public double getRPM() {
		System.out.println("getRPM" + engineRPM * ( 1/gearbox.get(gear) ));
		return engineRPM * ( 1/gearbox.get(gear) );
	}
	

}
