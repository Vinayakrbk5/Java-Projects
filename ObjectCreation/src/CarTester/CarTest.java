package CarTester;
//com.xworkz.facebookproject.login

//com=company.companyname.projectname.functionality

import Carcreation.Car; //importing Car class from CarCreation package
import CarDevolop.NewCar; // Importing NewCar class from CarDevolop package
import CarDevolop1.Car;

public class CarTest {

	public static void main(String[] args) {
		Carcreation.Car BMW = new Carcreation.Car();
		BMW.color = "Black";
		BMW.fueltype = "Deisel";
		BMW.cc = 1000;

		BMW.display(BMW); // calling display() from car() class from carcreation package

		NewCar toyoto = new  NewCar();
		System.out.println();
		
		toyoto.display(); // calling display() method from NewCar() class from CarDevolop package
		System.out.println();

		CarDevolop1.Car newcar1 = new CarDevolop1.Car();  // creating an object of class Car 
		                                                 //  from  CarDevolop1 package
	 	newcar1.newcar = "Maruthi Suzuki";
		newcar1.display(); //  calling display() method from car class 
						  //  from CarDevolop1 package
	}

}
