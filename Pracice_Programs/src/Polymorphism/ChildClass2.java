package Polymorphism;

public class ChildClass2  extends ChildClass1{
	double y;
	ChildClass2(String x)
	{
		System.out.println("Constructor in childclass2 is "+x);
	}
	
	public void display()
	 {
		 System.out.println("My name in child class2  is :"+name);
	 }
	
	public void yname()
	{
		System.out.println("Childclass2 has "+y+" rupees");
	}

}
