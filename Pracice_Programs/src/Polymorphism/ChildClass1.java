package Polymorphism;

public class ChildClass1 extends ParentClass{
	int x;
	ChildClass1()
	{
		this(56);
		System.out.println("Constructor in child class1");
	}
	ChildClass1(int x)
	{
		System.out.println("Value of x in ChildClass1 is "+x);
	}
	public  void display()
	 {
		 System.out.println("My name  childclass1 is :"+name);
	 }

	public void numvalue()
	{
		System.out.println(" value  of x in childclass1 constructor is :"+x);
	}
}
