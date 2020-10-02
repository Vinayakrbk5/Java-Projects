package ExceptionEx;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Start of the program");
		try
		{
			System.out.println("inside try catch");
			//int a=10/0;
			String str=args[0];   //  all the statements after the error statements are skipped
			System.out.println("end of try catch");
			
		}catch(ArithmeticException e)
		{
			System.out.println("inside the catch");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getStackTrace());
		}
	System.out.println("End of the program");
	}
}
