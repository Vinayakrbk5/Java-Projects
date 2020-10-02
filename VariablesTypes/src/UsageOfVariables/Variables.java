package UsageOfVariables;

public class Variables {
	static int x = 100; // these two are global variables because we have used static keyword
	static int y = 200; // if we use prefix as static to any variable then it become the global or
						// static variable
	// int sum;

	Variables() { // No Argument constructor defined by the user because
		// x=25; // we have created No Argument constructor in main() method using
		// object
		// y=35;
	}

	Variables(int x, int y) // Argument constructor defined by the user
	{
		System.out.println("The sum of two numbers is1 : " + (x + y));
	}

	public static void add(int x, int y) { // Method to add two numbers
		System.out.println("The sum of two numbers is2 : " + (x + y));
	}

	public static void main(String[] args) {
		Variables obj = new Variables(); // No Argument constructor is created using object or instance obj
		Variables obj1 = new Variables(55, 60); // Argument Constructor is created using object or instance obj1
		
		// int sum = x+y; // This is also possible only when x and y are declared as global variables
		
		int sum = 0; // because x and y are global variables any where within class can be used
		
		sum = obj1.x + obj1.y; // because x and y are global variables any where within class can be used
		
		// sum=obj.x+obj.y; // possible because they are used using object any way they
		// print the initialized value
		// sum = add(10, 20); // This is also possible only when we created add() method
		// in the class
		
		System.out.println(sum);
		add(30, 10);
		
		// System.out.println("The sum of x and y is :"+(x+y));
	}

}
