package FinalKewordPrograms;

public class FinalKeywordwithVariables {
	final static int a=25;     //  variable declared as a final
	
	public static void main(String[] args) {
		final int x=10;
		FinalKeywordwithVariables obj=new FinalKeywordwithVariables();
		System.out.println(a);
//		a=a+10;              //  final variable cannot be assigned
//		System.out.println(a);
		System.out.println(x);
		display();
	}
	public static void display()
	{
		int a=20;
		System.out.println("Value of a is "+a);
	}
}
