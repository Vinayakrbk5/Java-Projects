
package ExceptionEx;

public class StackUnWinding {
	public static void main(String[] args) {
		System.out.println("Start of the program");
		//throw new ArithmeticException();
		m1();
//		try
//		{
//			m1();
//		}catch(ArithmeticException e)
//		{
//			System.out.println("Arithmetic Exception is occured");
//		}
		System.out.println("End of the program");
	}
	public static void m1()
	{
		m2();
		System.out.println("Printing from m1");
		                                             
	}
	public static void m2()
	{
		m3();
	}
	public static void m3()
	{
		int a=10/0;
		System.out.println("Exception Statement");
	}

}
