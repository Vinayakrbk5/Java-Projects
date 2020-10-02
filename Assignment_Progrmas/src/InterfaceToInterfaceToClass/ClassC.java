package InterfaceToInterfaceToClass;

public class ClassC implements InterfaceA,InterfaceB {
public void display()
{
	System.out.println("This is Class C");
}
public static void main(String[] args) {
	ClassC obj=new ClassC();
	obj.display();
}
}
