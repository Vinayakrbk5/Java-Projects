package MethodExamples;

public class LocalVariableExample {

	public static void main(String[] args) { // variable arg is
												// local to the main method
		int a = 10; // variable a is local to the main method
		if (a == 10) {
			int b = 20; // b is local to the if block
			System.out.println("The value of b is :" + b);
		} else {
			int b = 30; // now b is local to the else block
			System.out.println("The value of b is :" + b);
		}
//    int a=20;    //  compilation error bcz 
		// it is not defined two times in the same method
		a = 30; // reinitialization is possible in the same method
		sum(45);
	}

	public static void display(String name) // name is local to the display() method only
	{
		System.out.println(" The value odf the name is : " + name);
		for (int i = 0; i < 10; i++) // i is local to for loop block
		{
			System.out.println(i);
		}
//      System.out.println(i); // not allowed to access 
		// local variable of for loop outisde the for block
	}

	public static void sum(int i) {
	System.out.println(i);
	}

}
