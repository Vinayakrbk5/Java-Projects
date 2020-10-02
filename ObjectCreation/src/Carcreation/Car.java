package Carcreation; // this is Carcreation packege

public class Car { // here Car is a class

	public String color;
	public String fueltype;
	public int cc;

	public void start() {
		System.out.println("car started");
	}

	public void move() {
		System.out.println("car is moving");
	}

	public void stop() {
		System.out.println(" Car stopped");
	}

	public void display(Car car) {
		System.out.println("The BMW car is " + car.color + " color, is of " + car.fueltype + " and it is " + car.cc);
	}

}
