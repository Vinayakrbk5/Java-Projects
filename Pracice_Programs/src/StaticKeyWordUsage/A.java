package StaticKeyWordUsage;

public class A {
	//int a=25;
	int b=35;
	Nation india;
	
	A()
	{
		System.out.println("This is Class A Constructor");
	}

	public static void display()
	{
		System.out.println("Hello A Class ");
	}
	public void state()
	{
		System.out.println("This is A class state");
	}
	public static void main(String[] args) {
		A a=new Nation();
		a.state();
		a.display();
	}

}
