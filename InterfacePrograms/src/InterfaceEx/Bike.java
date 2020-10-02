package InterfaceEx;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("The Bike has auto and manual start");
	}

	@Override
	public void accelaration() {
	System.out.println("The bike speeds upto 150 km/h");	
	}

	@Override
	public void engine() {
		System.out.println("The bike has both 2 and 4 stroke engine");
	}

}
