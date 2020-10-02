package InterfaceToInterfaceToInterface;

public class ClassD  implements InterfaceC{
	public void display()
	{
		System.out.println("This is Class D");
	}
	public static void main(String[] args) {
		ClassD obj=new ClassD();
		obj.display();
	}
}
