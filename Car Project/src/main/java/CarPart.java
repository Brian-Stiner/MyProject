
public class CarPart implements Functional{
	
	double condition;
	String name;
	
	public CarPart() {
		this.condition = 100;
		this.name = "car part";
	}
	public void status() {
		System.out.println("The "+name+"'s condition is at "+condition+"%");
	}

	public void function() {
		this.condition-=.001;
		if(condition<1) {
			System.out.println(this.name+" failure!");
			this.status();
		}

	}
}
