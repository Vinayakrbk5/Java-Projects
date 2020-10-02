package CustomException;

import java.sql.SQLException;

public class CustomExceptionEx1 extends Exception{
	
	CustomExceptionEx1()
	{
		this("Vinayak");
		System.out.println("This  is basic Custom ExceptionEx");
	}
	CustomExceptionEx1(String str)
	{
		System.out.println("This is "+str+" created Constructor");
	}
	public int hashCode()   //  we have overridden hashCode() here with parent class hashCode() of class Exception()
	{
		return 20;
	}
	public String toString()   // we have overridden toString() method here with parent class toString() method of class Exception()
	{
		return "This is Vinayak created toString() Method";
	}
}
