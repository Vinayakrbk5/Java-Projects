package FunctionalInterface;

public class MathOpeartionTester {
	public static void main(String[] args) {
		MathOperation<Integer> sum=(a,b)->a+b;
		System.out.println("Sum is :"+sum.ops(10,20));
		
		MathOperation<Double> mul=(a,b)->a*b;
		System.out.println("Multiplication is :"+mul.ops(15.3, 25.8));
		
		MathOperation<String> str=(a,b)->a+b;
		System.out.println("My name is :"+str.ops("Vinayak ", "Bhilawadi"));
	}

}
