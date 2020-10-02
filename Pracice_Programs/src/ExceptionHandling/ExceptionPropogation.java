package ExceptionHandling;

public class ExceptionPropogation {
	public static void main(String[] args) {
		try {
			System.out.println("inside first try block");
			try {
				System.out.println("Inside second try block");

				try {
					System.out.println("inside third try block");
					String s = null;
					s.toString();
				} catch (NumberFormatException e) {
					System.out.println("NumberFormat Exception is caught");
				}
				System.out.println("End of the third try block");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBound Exception caught");
			}
			System.out.println("End of the second try block");
		} catch (NullPointerException e) {
			System.out.println("NullPointer Exception caught");
		}

		System.out.println("End of the first try block");
	}

}
