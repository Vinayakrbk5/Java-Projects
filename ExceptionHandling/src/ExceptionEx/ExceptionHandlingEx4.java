package ExceptionEx;

import java.io.IOException;
//import java.sql.SQLException;
import java.sql.SQLException;

public class ExceptionHandlingEx4 {
public static void main(String[] args)   
{
	System.out.println("Start of the program");
	try {
		check(10,10);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("End of the program");
}
public static void check(int a,int b) throws   SQLException
{
	if(a>b)
	{
		System.out.println("a is greater than b");
	}
	else if(a<b)
	{
		System.out.println("a is less than b");
	}
	else
	{
		throw new SQLException("This is SQL Exception");
	}
}
}
