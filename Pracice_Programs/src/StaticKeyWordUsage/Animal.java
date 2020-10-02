package StaticKeyWordUsage;

public class Animal {
	 String color="Yellow";
	static int noOflegs;
	
	Animal()
	{
		System.out.println("Details giving about animals");
	}
	public void display(String name)
	{
		System.out.println("The "+name+" is called king of forest");
		noOflegs=4;
	}
	public static void Char()
	{
		System.out.println("Lion has "+noOflegs+" legs");
	}

	public static void main(String[] args) {
		Animal tiger=new Animal();
		tiger.display("Lion");
		Char();
		System.out.println("The tiger is "+tiger.color+" color");
	}
}
