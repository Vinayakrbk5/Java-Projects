package CustomException;

public class CustomException1Tester {
	public static void main(String[] args) {
		try {
		throw new CustomExceptionEx1();
		}
		catch(CustomExceptionEx1 e)
		{
			System.out.println("This is Custom ExceptionEx");
			//System.out.println(e);  //  it will print fully qualified class name that is packagename.classname only if we have not overridden
			System.out.println(e.toString());
			System.out.println(e.hashCode());
		}
//		try {
//		throw new CustomExceptionEx("Vinayak");
//		}
//		catch(CustomExceptionEx e)
//		{
//			System.out.println("Exception is caught");
//		}
	}

}
