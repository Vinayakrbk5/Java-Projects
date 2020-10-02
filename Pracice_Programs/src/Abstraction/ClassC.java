package Abstraction;

public class ClassC extends ClassB{
	public void display()
	{
		System.out.println("display method in Class C");
	}
	public static void main(String[] args) {
		ClassC clsC=new ClassC();
		clsC.display();
	}

}
