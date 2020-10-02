package OverloadingAndOverridingInSameClass;

public class Maths  extends Operation
{
	public void add()
	{
		System.out.println("Hello World");
	}
	public void add(int a)
	{
		System.out.println("Value of a is :"+a);
	}

}
