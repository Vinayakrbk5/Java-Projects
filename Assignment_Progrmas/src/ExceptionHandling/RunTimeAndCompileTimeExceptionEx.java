package ExceptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class RunTimeAndCompileTimeExceptionEx {
public static void main(String[] args) throws SQLException {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Start of the program");
	try
	{
		if(a>b)
	{
		throw new ArithmeticException("ArithmeticException has thrown");
		
	}
		else if(a<b)
		{
			
			throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException has thrown");
		}
		else
		{
			throw new SQLException("SQLException has thrown");
		}
}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(SQLException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("This is finally block");
	}
	System.out.println("End of the program");
}
}
