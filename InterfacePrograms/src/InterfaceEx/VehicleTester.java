package InterfaceEx;

public class VehicleTester {
	public static void main(String[] args) {
		Bike ktm=new Bike();
		Car maruthi=new Car();
		ktm.accelaration();
		ktm.engine();
		ktm.start();
		System.out.println();
		
		maruthi.accelaration();
		maruthi.engine();
		maruthi.start();
		
	}
	

}
