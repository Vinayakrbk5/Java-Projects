package PolymorphismExample;

public class Bike extends Vehicle {
	int noofwheels;
	//String fuelType="Petrol";
	
	@Override    //   this is keyword to indicate overriding
	public void displaycapacity()
	{
		System.out.println("The fuel capacity of Bike is 15 ltrs");
	}
}
