package StaticKeyWordUsage;

public class Nation  extends A{
	int a=50;
	int b=100;
	String name;
	int noofstates;
	Nation()
	{
		System.out.println("This is Class Nation Constructor");
	}
	public void state()
	{
		System.out.println("This is Nation class state");
	}
	public int mul()
	{
		return a+super.b;
	}
	

}
