package DynamicPolymorphismEx;

public class Customer {
//	static
//	{
//		System.out.println("This is static block in Customer class");
//	}
//	
//	{
//		System.out.println("This is non static block in Customer class");
//	}
	String name="Karnataka";
	public Customer()
	{
		System.out.println("This is Customer class Constructor");
	}
	
	public Customer(String x)
	{
		System.out.println("This is Customer class Constructor "+x);
	}
	
	public void name(String str)
	{
		System.out.println("name in Customer class is "+str);
	}

	public void discust()
	{
		System.out.println("This is India");
	}
}
