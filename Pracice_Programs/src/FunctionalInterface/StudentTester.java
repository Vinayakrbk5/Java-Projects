package FunctionalInterface;

public class StudentTester {
	public static void main(String[] args) {
		Student st = new Student() {

			@Override
			public void add() {
				System.out.println("This is add method");
			}

		};
		st.add();
		Student std = () -> System.out.println("This is lamda expression");
		std.add();

		Student1 st1 = new Student1() {

			@Override
			public void sum(int a, int b) {
				System.out.println("Sum is :" + (a + b));
			}

			@Override
			public double mul(double a, int b) {
				return a * b;
			}

		};
		st1.sum(25, 67);
		System.out.println("The mul is :" + st1.mul(45.987, 268));

//		Student2 st2 = (a, b) -> (int) a + (int) b; // to get result as double value we have to typecast explicitly
//		and to get result as integer value then it will implicitly cast and it also prints non decimal number
//		and if we mention the cast then it will prints decimal values
//		System.out.println("The Operation is :" + st2.mul(10.876, 35.765));

		Student3 st3 = (x, y) -> System.out.println(x + y);
		st3.print("Vinayak ", "Bhilawadi");
		st3.print("123", "654");

		Student4<Integer> st4 = (a, b) -> a + b;
		System.out.println("The display value is :" + st4.display(20, 45));

//		Student4<Character> std4=(a,b)->a+b;
//		System.out.println("The display value is :"+st4.display('V','B'));
	}

}
