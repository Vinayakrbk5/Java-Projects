package RunTimeOrDynamicPolymorphism;

public class B extends A {
	int x=20;
	B()
	{
		System.out.println("This is Class B Constructor");
	}
	B(String name){
		System.out.println("The Nation name is :"+name);
	}
	public void display()
	{
		System.out.println("Method Written in Class B");
	}


}
