package CustomException;

public class CustomExceptionExTester {
	public static void main(String[] args)  {
		System.out.println("Start of the program");
	try {
		throw new CustomExceptionEx();
	}
	catch(CustomExceptionEx e)
	{
		//e.toString();
		System.out.println(e);
		e.printStackTrace();   //  it prints the how trace has been happened at the end
	}
	System.out.println("End of the program");
	}
}
