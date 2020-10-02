package ExceptionEx1;


public class Customer extends Exception {
	public Customer()
	{
		System.out.println("This is IOException from Customer class constructor");
	}
	public Customer(String name)
	{
		System.out.println("My Name is "+name);
	}
	public String toString()
	{
		return "This is New toString() Method";
	}
	public int hashCode()
	{
	return 20;	
	}
	public boolean equals()
	{
		return false;
	}
}
