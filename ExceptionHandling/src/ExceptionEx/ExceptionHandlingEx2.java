package ExceptionEx;

public class ExceptionHandlingEx2 {
	public static void main(String[] args) {
		int i=25;
		//String str=args[0];
		//int a=Integer.parseInt(str);
		try
		{
			String str1=args[0];   //  this will execute perfectly for i to be any number
		i=Integer.parseInt(str1);
		}
		
		catch(ArrayIndexOutOfBoundsException e)  //  exception for i to be null
		{
			System.out.println("ArrayIndexOutOfBoundsException,we will get this exception when we didnot give anything");
		}
		catch(NumberFormatException e)   //  exception for i to be any name
		{
			System.out.println("NumberFormatException, we will get this exception when we give any name that is string format");
		}
		catch(Exception e)
		{
			System.out.println("This is general exception");
		}
		finally {
		System.out.println(i);
	}
	}
}
