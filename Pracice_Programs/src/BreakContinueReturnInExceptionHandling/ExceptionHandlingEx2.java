package BreakContinueReturnInExceptionHandling;

public class ExceptionHandlingEx2 {
public static void main(String[] args) {
	System.out.println("Start of the program");
	System.out.println(display());
	System.out.println("End of the program");
}
public static int display()
{ 
	int a=10;
	try
	{
 a=10/0;
 	
}
catch(ArithmeticException e)
{
	System.out.println("Arithmetic Exception occured");
}
	return a;
}
}
