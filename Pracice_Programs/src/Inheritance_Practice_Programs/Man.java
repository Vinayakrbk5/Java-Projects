package Inheritance_Practice_Programs;

public class Man extends Animals{
	int nooflegs;
	int noofhands;
	
	void speak()
	{
		System.out.println("man can speak");
	}
	
	void walk()
	{
		System.out.println("Man can walk");
	}
	public static void main(String[] args) {
		Man man =new Man();
		man.noofhands=2;
		man.nooflegs=2;
		man.speak();
		man.walk();
		
		System.out.println("The man has "+man.noofhands+" hands and "+man.nooflegs+" legs");
		man.move();
		man.eat();
		
		man.color="white";
		System.out.println("The man has "+man.color+" color");
	}

}
