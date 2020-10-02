package InterfaceEx;

public class Car implements Vehicle {

	@Override
	public void start() {
	System.out.println("The car has auto start");	
	}

	@Override
	public void accelaration() {
		System.out.println("The car will run upto 200 km/h");
	}

	@Override
	public void engine() {
		System.out.println("The car has 4 stroke engine");
	}
	

}
