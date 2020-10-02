package DynamicPolymorphismEx;

public class Employee1  extends Customer{
	public Employee1()
	{
		System.out.println("This is Employee1 class Constructor");
	}
	
//	static
//	{
//		System.out.println("This is static block in Employee1 class");
//	}
//	
//	{
//		System.out.println("This is non static block in Employee1 class");
//	}

	String name="Bangalore";
	
	public void name(String str)
	{
		System.out.println("name in Employee1 class is "+str);
	}
	public void disemp1()
	{
		System.out.println("Empl1 "+name+" and "+super.name);
	}
}
