package Super_Key_Usage;

public class TV extends Display {
	int pixel;
	
	/*TV()
	{
		//super();
		System.out.println("Displaying the Tv Constructor");
	}*/
	TV(String name)
	{
		//super(name);
		System.out.println("Name in Display is : "+name);
	}
	public void Turn_On()
	{
		super.turnon();
		System.out.println("Turn on TV");
	
	super.pixel=100;
	
		System.out.println("The Pixel in Display constructor is "+super.pixel);
	}


}
