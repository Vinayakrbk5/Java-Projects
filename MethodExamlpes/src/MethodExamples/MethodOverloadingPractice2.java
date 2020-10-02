package MethodExamples;

public class MethodOverloadingPractice2 {

	public static void main(String[] args) {
	System.out.println("The multiplication of two numbers is : "+add(25l, 15l));  //long integer type
	System.out.println("The sum of two numbers is : "+add(2.5f,5.9f));  //float type
	}
	public static int add(int a, int b)
	{
		return a*b;
	}
	public static float add(float a, float b)
	{
		return a+b;
	}

}
