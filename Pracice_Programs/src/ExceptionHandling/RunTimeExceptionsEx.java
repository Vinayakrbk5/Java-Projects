package ExceptionHandling;

//import java.sql.SQLException;

public class RunTimeExceptionsEx {
	public static void main(String[] args)
	{
		try //throws SQLException
		{
			if(10>20)
		{
			System.out.println("This is Vinayak");
		}
		else {
			System.out.println("Start");
			
			//throw new ArrayIndexOutOfBoundsException("Exceptions occure");
			int a=10/0;	
		}
			
	}
		
	catch(Exception e)
	{
		//System.out.println("");
		System.out.println("End of the program");
	}
		
		finally
		{
			System.out.println("hi");
		}
		System.out.println("This is Vinayak");
}
}

