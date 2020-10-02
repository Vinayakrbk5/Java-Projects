//  method can be called directly or using object if it is in the same class
//  if it is in the other class only object is used to call the method
//  we cannot call method directlypackage MethodExamples;

public class MethodOverloadingPractice1 {

	public static void main(String[] args) {
	//int a=10,b=20;
	//int sum=0;
	MethodOverloadingPractice1 scan=new MethodOverloadingPractice1(); //object is created
	
	//  here object is used to call method
	System.out.println("The sum of Numbers is 1: "+scan.add(20,35.65));
	System.out.println("The sum of numbers is 2: "+scan.add(10, 20));
	System.out.println("The sum of numbers is 3: "+scan.add(100,200,300));
	
	System.out.println();
	//here directly method is called 
	System.out.println("The sum of Numbers is 1: "+add(65,68.76));
	System.out.println("The sum of numbers is 2: "+add(15, 25));
	System.out.println("The sum of numbers is 3: "+add(50,20,75));
	}
	
	public static int add(int a, int b)
	{
		int sum=0;
		sum=a*b;
		return sum;
	}
	
	public static int add(int a, int b, int c)
	{
		int sum=0;
		sum=a+b+c;
		return sum;
	}
	
	public static double add(int a, double b)
	{
		return a+b;
	}
	/*public static double add(int a, int b) // This is not possible because
	{										 // it has same method name, same data types 
		double div=0;					     // and same number of arguments
		div=a*b;							 // method with same name. same data types
		return div;							 // and same number of arguments
	}*/										 // is not possible in java
}
