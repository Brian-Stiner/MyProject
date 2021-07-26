
public class Battery  extends CarPart{
	
	private boolean charge;
	
	public Battery() {
		this.charge = true;
		this.name = "battery";
	}
	
	public void function() {
		super.function();
		if(condition<1) {
			this.charge = false;
		}

	}
	
	public boolean getCharge() {
		return charge;
	}

}
