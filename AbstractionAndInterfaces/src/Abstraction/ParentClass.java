package Abstraction;

abstract public class ParentClass implements Child2Class,Child3Class {
	public ParentClass()
	{
		System.out.println("This is Parent Class constructor");
	}
		public void display()
	{
		System.out.println("This is Parent class method");
	}
	public  abstract void mess();

}
