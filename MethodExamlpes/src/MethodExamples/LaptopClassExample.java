package MethodExamples;

public class LaptopClassExample {
	// fields of class
	String color;    //Instantiation of class
	int size;
	String brand;//="HP";  //it is the default value assigned to all the objects
	
	static  String name ="xyz"; // using static keyword the variable act as a global variables 
    //default value for numeric value is zero,for String or char is null and for boolean is false
	
	LaptopClassExample()  //it is a constructor
	{
		System.out.println("Creating the laptops");
		this.name="Bangalore";  //reinitializing the static variable
		System.out.println(" The name in Constructor is :"+name);
	}
	public static void main(String[] args) {
	LaptopClassExample hp=new LaptopClassExample();//creating an instance of the class LaptopClassExample()
		
	hp.color="Black";   // Instance variables intialization
	//hp.size=19;
	//hp.brand="HP";
	name="Karnataka";
	System.out.println("The name is :"+hp.color);
	System.out.println("The name is "+name);
	LaptopClassExample.name="India";
	System.out.println("The name is :"+name);
	System.out.println(name);
	System.out.println(hp.size);  //it prints default  as zero
	System.out.println("The brand is : "+hp.brand);  //it prints null as a default value bcz it is not initialized
	
	}
	

}
