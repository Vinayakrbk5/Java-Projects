package BikePackage;

public class Bike {
	int price;
	String name;
	int cc;
	
	 public Bike()
	{
		System.out.println("creating the bikes");
	}
	public Bike(int price,String name, int cc)
	{
		System.out.println("The bike "+name+" is "+cc+" CC and it's price is "+price);
	}
	public static void main(String[] args) {
		Bike Pulsar=new Bike();
		Bike karizma=new Bike(100000,"Karizma",150);
	}

}
