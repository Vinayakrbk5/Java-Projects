package ExceptionEx;

public class ExceptionHandlingEx1 {
	public static void main(String[] args) {
		System.out.println("Start of the progrma");
		try {
			String str=args[0];
			int a=10/0;
		}
		catch(ArithmeticException e )
		{
			System.out.println(e);
		}
		catch( RuntimeException e)
		{
			System.out.println("This is rumntime Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of the progrma");
	}

}
