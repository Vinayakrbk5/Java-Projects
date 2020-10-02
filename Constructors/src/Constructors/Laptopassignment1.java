package Constructors;

public class Laptopassignment1 {
	int weight;
	String color;
	String brand;
	
	Laptopassignment1()
	{
		System.out.println("Creating Laptops");
	}
	
	Laptopassignment1(String brand, String color,int weight)
	{
	   this.brand=brand;
	  this. color=color;
	   this.weight=weight;
	}

	public static void main(String[] args) {
		
	Laptopassignment1 hp=new Laptopassignment1();  //defa
	hp.weight=10;
	hp.color= "silver";
	hp.brand="HP";
	
	System.out.println();
	System.out.println("about HP Laptop");
	System.out.println("The laptop "+hp.brand+" is "+hp.color+" color and it's weight is "+hp.weight+" Kg");
	
	Laptopassignment1 dell= new Laptopassignment1("Dell","Black",15);
	System.out.println();
	System.out.println("about Dell Laptop");
	System.out.println("The laptop "+dell.brand+" is "+dell.color+" color and it's weight is "+dell.weight+" Kg");
	}

}
