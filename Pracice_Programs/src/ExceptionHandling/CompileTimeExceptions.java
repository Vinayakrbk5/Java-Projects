package ExceptionHandling;

import java.io.IOException;

public class CompileTimeExceptions {
public static void main(String[] args){
	try {
		System.out.println("Start of the program");
		display();
		//throw new IOException("This is IOException");
	}
	catch(IOException e)
	{
		System.out.println("IOException is caught");
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException is caught");
	}
	finally
	{
		System.out.println("Finally block");
	}
}
public static void display() throws IOException
{
//int a=10/0;
//return a;
throw new IOException();
}
}
