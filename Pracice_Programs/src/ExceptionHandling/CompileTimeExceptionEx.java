package ExceptionHandling;

//import java.io.FileNotFoundException;
import java.sql.SQLException;

public class CompileTimeExceptionEx {
public static void main(String[] args) /*throws  SQLException*/   {
	System.out.println("Start of the program");
	
	try
	{
		if(10>20)
	{
		System.out.println("This is Vinayak");
	}
	else
	{
		throw new SQLException("SQLException occured");
	}
}
	catch(SQLException e)
	{
		System.out.println(e.toString());
		System.out.println("This is SQLException");
	}
	finally
	{
		System.out.println("This is finally block");
	}
	System.out.println("End of the program");
}
}
