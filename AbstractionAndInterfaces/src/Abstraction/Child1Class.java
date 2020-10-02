package Abstraction;

public class Child1Class extends ParentClass {
	public void mess()
	{
		System.out.println("This is message from child1class");
	}

	@Override
	public void sum() {
		System.out.println("This is sum in child1 Class");
	}

	@Override
	public void nation() {
		System.out.println("This is India nation in child1 class");
	}

}
