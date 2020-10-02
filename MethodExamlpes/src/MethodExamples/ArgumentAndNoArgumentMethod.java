// No Argument Method can be called using an object of class without giving arguments or parameters
// they must be of void return type
// Argument Method can be called using an obect of class by giving  arguments or parameter 
// they must be of any return type except void

package MethodExamples;

public class ArgumentAndNoArgumentMethod {
	public static void city()								//No Argument Method
	{
		System.out.println("This is Bangalore city");
	}
	public static void name()								//No Argument Method
	{
		System.out.println(" My name is shankar");
	}
	public static int add(int a, int b)					     // Argument Method
	{
		System.out.println("The sum of two numbers is :");
		int sum=a+b;
		return sum;
	}
	public static void main(String[] args) {
		ArgumentAndNoArgumentMethod obj=new ArgumentAndNoArgumentMethod();   //object creation
		obj.city();												   // calling No Argument Methods city() and name() using object
		obj.name();
		//System.out.println("The sum of two numbers is : "+obj.add(25, 55)); //this statement is also possible
		System.out.println(obj.add(25, 55));				       // calling Argument Method add( int, int) using object obj
	}

}
