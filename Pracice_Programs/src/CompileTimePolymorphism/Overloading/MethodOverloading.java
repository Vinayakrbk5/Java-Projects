package CompileTimePolymorphism.Overloading;

public class MethodOverloading {
	int a;
	int b;
	 
	public void displaysum()
	{
		System.out.println("Sum of a and b is :"+(a+b));
	}
	public  void displaysum(int a)
	{
		System.out.println("The value of a is :"+a);
	}
	public void displaysum(int a, int b)
	{
		System.out.println("The sum is :"+(a+b));
	}
	public void displaysum(int a, int b,int c)
	{
		System.out.println("The sum of three numbers is :"+(a+b+c));
	}
	
	public static void main(String[] args)
	{
		MethodOverloading sum=new MethodOverloading();
//      int x=10;   // we can give this x value to the reference because it is defined in the static method so it is static variable
		sum.a=5;
		sum.b=10;
		sum.displaysum();
//      sum.displaysum(a);  //  this will give compile time error because Cannot make a static reference to the non-static field a
//		whenever we are giving value as a variable using reference or object variable must be static  
//      sum.display(x);   //  this will execute successfully because x is a static variable
	}

}
