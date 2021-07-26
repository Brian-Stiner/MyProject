
public class Radiator extends CarPart{
	
	private double heat;
	private double maxheat;
	
	public Radiator() {
		this.heat = 0;
		this.maxheat = 200;
		this.name = "radiator";
	}
	
	public void function() {
		super.function();
		if(heat<maxheat && heat>0) {
			heat -= 1 + heat/50;
		}
		else if(heat<0) {
			heat = 0;
		}
		else if(heat>maxheat) {
			this.condition--;
			System.out.println("Warning: radiator overheating!");
		}
	}
	
	public void function(double power) {
		this.function();
		this.heat += power;
	}
	
	public void showHeat() {
		System.out.println("radiator at "+ (heat/maxheat) +"%");
	}
	

}
