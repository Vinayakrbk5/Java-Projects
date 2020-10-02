package MultipleInheriatance;

public class ClassD extends ClassC implements ClassB  {

	public void city()
	{
		System.out.println("This is Bangalore City");
	}
	public void display()
	{
		System.out.println("This is display method");
	}
	public static void main(String[] args) {
		ClassD clsD=new ClassD();
		clsD.display();
		clsD.name();
		clsD.city();
		
		System.out.println(clsD.a);
	}
}
