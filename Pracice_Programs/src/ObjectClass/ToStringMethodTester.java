package ObjectClass;
//  this is a tester class, StringMethod class and ToStringMethodOne Class are  used here
//	where StringMethod  class is inheriting  ToStringMethodOne class using polymorphism property it will printing latest one toString() method

public class ToStringMethodTester {

	public static void main(String[] args) {
		StringMethodChild obj=new StringMethodChild();
		System.out.println(obj); // calling toString() method before initialization
								 // here we have not initialized overridden toString() method  so printing the default values
		
		obj.a=56;				 // initialization is done here
		obj.name="Vinayak";
		
		System.out.println(obj.toString()); // calling toString() method after initialization 
											// here we have overridden the toString() method to the inbuilt toString() method 
											// so printing the latest one using polymorphism property for method overriding
		
		//  System.out.println(obj);        // this will prints the same thing
	}

}
