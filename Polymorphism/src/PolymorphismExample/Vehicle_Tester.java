package PolymorphismExample;

public class Vehicle_Tester {

	public static void main(String[] args) {
	Bike TVS=new Bike();   // object of Class Bike
	Bus KSRTC=new Bus();      // object of Class Bus
	Vehicle vehicl=new Vehicle();  //  object of Class Vehicle
	
	TVS.displaycapacity();
	KSRTC.displaycapacity();
	vehicl.displaycapacity();

	System.out.println(TVS.fuelType);
	}

}
