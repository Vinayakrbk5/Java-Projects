package Bike1Package;

import BikePackage.Bike;

public class Bike1 {
	 public Bike1(String comp)
	{
		System.out.println("The "+comp+" company is manufacturing the bikes");
	}
	 public static void add(int a,int b)
	 {
		 System.out.println("Sum of two numbers is : "+(a+b));
	 }
	 
	 public static void mul(int a,int b)
	 {
		 System.out.println("Multiplication  of two numbers is : "+(a*b));
	 }
	 

	public static void main(String[] args) {
	Bike enfield =new Bike();
	Bike fz=new Bike(150000,"YAMAHA-FZ",200);
	Bike1 comp=new Bike1("Indian");
	add(20,45);
	mul(10,14);
	}

}
