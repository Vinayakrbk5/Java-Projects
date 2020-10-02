package FunctionalInterface;

public class MathTester {
	public static void main(String[] args) {
		MathFunction mat = (a, b) -> {  // we can write just a+b also
			System.out.println("Sum of "+a+" and "+b+" is");
			return a + b;
		};
		System.out.println(mat.add(20, 40));
		System.out.println(mat.add(100, 200));
	}

}
