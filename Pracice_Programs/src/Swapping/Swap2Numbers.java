package Swapping;

public class Swap2Numbers {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int temp = 0;

		System.out.println("Swapping two numbers using 3rd variable");
		System.out.println("values of a and b  before swapping :" + a + ", " + b);

		temp = a;
		a = b;
		b = temp;

		System.out.println("Values of a and b after swapping :" + a + ", " + b);

		System.out.println("---------------------------------------------");

		System.out.println("Swapping without using 3rd variable");
		int x = 30;
		int y = 60;

		System.out.println("Values of and b before Swapping :" + x + ", " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		s
		System.out.println("Values of and b after Swapping :" + x + ", " + y);

	}

}
