package javapackage;

public class car {
	String color;
	int speed;
	int weight;
	car()
	{
		 
		System.out.println("The program is to create car");
		/*System.out.println();                                   //class constructor is created
		System.out.println("The car is started moving");		//class constructor is executed first without calling it at all
		System.out.println("The car is getting accelerated");
		System.out.println("The car is in rest position");*/
	}
	 public static void move()
	 {
		 System.out.println("The car is started moving");
	 }
	 
	 public static void speed()
	 {
		 System.out.println("The car is getting accelerated");
	 }
	 public static void stop()
	 {
		 System.out.println("The car is in rest position");
	 }
	public static void main(String[] args) {
		car maruthisuzuki=new car();
		car honda=new car();
		maruthisuzuki.color= "White";
		maruthisuzuki.speed=120;
		maruthisuzuki.weight=500;
		System.out.println();
		System.out.println("Maruthi Suzuki car color is : "+maruthisuzuki.color);
		System.out.println("Maruthiu Suzuki car will run at speed of "+maruthisuzuki.speed+" KMPH");
		System.out.println("Maruthi Suzuki car weighing  "+maruthisuzuki.weight+" Kg");
		
		System.out.println();
		maruthisuzuki.move();
		maruthisuzuki.speed();
		maruthisuzuki.stop();
		System.out.println("--------------------------------------------------------");
		honda.color="Blue";
		honda.speed=150;
		honda.weight=550;
		
		System.out.println();
		System.out.println("Honda car color is : "+honda.color);
		System.out.println("Honda car will run at speed of "+honda.speed+" KMPH");
		System.out.println("Honda car weighing  "+honda.weight+" Kg");
		System.out.println();
		honda.move();
		honda.speed();
		honda.stop();
	}

}
