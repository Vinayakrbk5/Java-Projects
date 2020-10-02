package MethodExamples;

public class CallingMthodInsideMethod {

	public static void main(String[] args) {
	int a= 10, b=20;
	mul(a,b);
	}
	public static int add(int x,int y)
	{
		return x*y;
	}
	public static void mul(int x,int y)  // in this method we have called 
	{								// two other methods display() and add()
		dislpay();					//so we can call one method inside other method 
		System.out.println("Multiplying two numbers");  // but we cannot define 
		int mul=add(x,y);					// entire Method inside other method
		System.out.println("result is : "+mul);
	}
	public static void dislpay()
	{
	    System.out.println("Combining two methods");
	}
	

}
