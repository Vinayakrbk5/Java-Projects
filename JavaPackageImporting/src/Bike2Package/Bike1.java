package Bike2Package;

//import Bike1Package.Bike1;  // if we took both package and class name for creating object 
 // then there is no need of importing package it automatically import when we use both name while creating the object
import BikePackage.Bike;

public class Bike1 {
	public Bike1()
	{
		System.out.println("Bikes are imorting from the USA");
	}
	

	public static void main(String[] args) {
		BikePackage.Bike java1=new BikePackage.Bike();
		Bike java=new Bike(400000,"Java",500); 
		Bike1Package.Bike1 comp=new Bike1Package.Bike1("Western");// here  both package and class name are taken to create object
																  // because of same class names
	}

}
