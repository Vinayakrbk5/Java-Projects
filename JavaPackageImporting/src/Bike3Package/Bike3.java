package Bike3Package;

import BikePackage.Bike;; //two classes from same package
//import BikePackage.BikeCompany;;

//import Bike2Package.Bike1;
//import Bike1Package.Bike1;

public class Bike3 {

	public static void main(String[] args) {
		Bike1Package.Bike1  discover=new Bike1Package.Bike1("Japan");	// full package and class name are used here
		Bike2Package.Bike1 comp=new Bike2Package.Bike1();
		Bike1Package.Bike1.add(56,89);
		Bike1Package.Bike1.mul(25, 15);
		Bike name=new Bike(65000,"Yamaha",125);
		BikePackage.BikeCompany com=new BikePackage.BikeCompany();
	}

}
