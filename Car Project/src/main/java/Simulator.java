
public class Simulator {
	
	public static void main(String args[]) {
		Car theCar = new Car();
		for(int i=1; i<110; i++)
		{
			System.out.println("round "+i);
			theCar.run();
		}
	}

}
