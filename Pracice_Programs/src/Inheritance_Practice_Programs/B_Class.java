package Inheritance_Practice_Programs;

public class B_Class  extends A_Class {
	int b=20;
	{
		System.out.println(super.a);
	}
	{
		super.print_c();
	}
	{
		
	}
	public void print_c()
	{
		System.out.println("The value of b is 55");
	}
}
