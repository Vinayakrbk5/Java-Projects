package LamdaFunctionAndAnonymousClass;

public class Employee {
	private String name;
	public Employee(String name)
	{
		System.out.println("This is Employee Class Constructor");
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
	return name;
			
	}
	public void print() {
		System.out.println("This is "+name);
	}

}
