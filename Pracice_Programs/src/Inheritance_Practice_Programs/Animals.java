package Inheritance_Practice_Programs;

public class Animals {
	String color;
	int nooflegs;
	
	void move()
	{
		System.out.println("Animal is moving");
	}
	
	void eat()
	{
		System.out.println("Animal is eating");
	}

	public static void main(String[] args) {
		Animals animal=new Animals();
		animal.color="Yellow";
		animal.nooflegs=4;
		
		animal.move();
		animal.eat();
		
		System.out.println("The Animal has "+animal.color+" color and "+animal.nooflegs+" legs");
	
	}

}
