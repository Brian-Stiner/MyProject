import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
	
	private double speed;
	private List<CarPart> partlist;
	private Scanner scan;
	double gaspedal;
	
	public Car() {
		partlist = new ArrayList<>();  
		         
		partlist.add(new FuelTank()); 
		partlist.add(new Battery());
		partlist.add(new Engine());
		partlist.add(new Radiator());
		partlist.add(new Transmission());
		partlist.add(new Wheel());
		
		this.speed = 0;
		
		scan= new Scanner(System.in);
		
		gaspedal = 0.0;
		
	}

	public void run() {
		
		System.out.println("What percentage pressed is the gas pedal?");
		gaspedal = scan.nextDouble();
		if(gaspedal > 100) { gaspedal = 100;}
		if(gaspedal <.01) {
			
			//iterate through list with function();
			partlist.forEach(part -> part.function());
		}
		else {
			//iterate through with function( variables );
			((FuelTank) partlist.get(0)).function(gaspedal);
			((Battery) partlist.get(1)).function();
			((Engine) partlist.get(2)).function(((FuelTank) partlist.get(0)).getSentFuel(), ((Battery) partlist.get(1)).getCharge());
			((Radiator) partlist.get(3)).function(((Engine) partlist.get(2)).getPower());
			((Transmission) partlist.get(4)).function(((Engine) partlist.get(2)).getPower());
			((Wheel) partlist.get(5)).function(((Transmission) partlist.get(4)).getRPM());
			
			speed = ((Wheel) partlist.get(5)).getSpeed();
			
			
		}
		
		this.showSpeed();
		
	}
	
	public void showSpeed() {
		System.out.println(speed+" mph");
	}
	
}
