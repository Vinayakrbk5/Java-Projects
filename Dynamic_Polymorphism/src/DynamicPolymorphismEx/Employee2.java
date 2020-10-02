package DynamicPolymorphismEx;

public class Employee2 extends Employee1 {
	String name="Bagalkot";
//	static
//	{
//		System.out.println("This is static block in Employee2 class");
//	}
//
//	
//	{
//		System.out.println("This is non static block in Employee2 class");
//	}

	public Employee2()
	{
		System.out.println("This is Employee2 class Constructor");
	}
	public void name(String str)
	{
		System.out.println("name in Employee2 class is "+str);
	}
	
	public void displayemp2()
	{
		System.out.println("This is Bangalore city");
	}
}
