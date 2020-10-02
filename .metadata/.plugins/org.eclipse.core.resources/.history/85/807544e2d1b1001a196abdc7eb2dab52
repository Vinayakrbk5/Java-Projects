package StackUnwinding;

public class StackUnwindingEx {
	public static void main(String[] args) {
		System.out.println("Start of the program");
		A();
		System.out.println("End of the program");
	}

	public static void A()
	{
//		try {
		B();
//		}
//		catch(ArithmeticException e){
//			System.out.println("This is Arithmetic Exception");
//		System.out.println("This is A  catch Method");
//		}
		
	}
	public static void B()
	{
		C();
		System.out.println("This is B Method");
	}
	public static void C()
	{
		System.out.println("Inside start of C Method");
//		try {
		int a=10/0;
		System.out.println(a);
//	}
//		catch(ArithmeticException e){
//			System.out.println(" this is Arithmetic Exception");
//		}
		System.out.println("End of C Method");
}
}
