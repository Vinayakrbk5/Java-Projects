package StaticKeyWordUsage;

public class B extends Nation{
	  int x=25;
	  B()
		{
			System.out.println("This is Class B Constructor");
		}
	  
	public static void display()
	{
		System.out.println("Hello B Class ");
	}
	public int sum()
	{
		return this.x;
	}
	
	public void state()
	{
		super.state();
		System.out.println("This is B class state");
	}


}
