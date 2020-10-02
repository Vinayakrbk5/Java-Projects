// this is the program to show that there may be two classes in the same page but it is not reccomended in java

package Inheritance_Practice_Programs;

public class TwoClasses {
	static int a, b;   /// static variables can be used in non static method
						//  but non static variables cannot be used in static methods
	public  void sum()
	{
		System.out.println("The sum is : "+(a+b));
	}
	public static void main(String[] args) {
	TwoClasses obj1=new TwoClasses();
	Student obj2=new Student();
	
	obj2.a=25;  // initialization to the innstance variables by using an object obj2 only because TwoClasses() is inherited in Student() class
	obj2.b=35;
	obj2.x=10;
	obj2.y=20;
	
	obj2.sum();     // methods are called using object obj2 only
	obj2.mul();
	}
}  
	  class Student extends TwoClasses   // inherited class TwoClasses() in the student() class
	 {
		
		int x,y;
		public void mul() {
			System.out.println("The mul is :"+(x*y));
		}
	 }
		

