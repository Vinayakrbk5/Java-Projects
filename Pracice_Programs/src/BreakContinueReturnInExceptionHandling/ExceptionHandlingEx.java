package BreakContinueReturnInExceptionHandling;

public class ExceptionHandlingEx {
public static void main(String[] args) {
	int arr[]=new int[] {11,22,33,44,55,66};
	int p=0;
	for (int i=0;i<arr.length;i++)
	{
		System.out.println("Hi");
		try {
		
		if(arr[i]==44)
		{
			
			//System.out.println("inside try block");
			throw new ArithmeticException();
			//p=10/0;
			//continue;
			//break;
		}
		System.out.println("arr["+i+"] = "+arr[i]);
	}
		
		catch(ArithmeticException e)
		{
			
			System.out.println("This is Arithmetic Exception");
			continue;
			//break;
		}
		finally
		{
			
			System.out.println("This is finally block");
			//break;
		}
		
		//System.out.println("Hi");
}
	System.out.println("Hi");
}
}
