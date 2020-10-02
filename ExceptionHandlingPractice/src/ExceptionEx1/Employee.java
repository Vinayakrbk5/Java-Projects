package ExceptionEx1;


public class Employee {
	public static void main(String[] args)    {
		Employee emp=new Employee();
		int i=20;
		try {
		if(i<20)
		{
			System.out.println("i is less than 20");
		}
		else if(i>20)
		{
			System.out.println("i is greater than 20");
		}
		else
		{
			
			System.out.println("i is equal to 20");
			throw new Customer("Vinayak");
		}
		}
		catch(Customer e)
		{
			System.out.println(e.toString());
			System.out.println(e.hashCode());
			System.out.println(e.equals());
		}
		finally
		{
			System.out.println("this s finally block");
		}
		}
		
	}
