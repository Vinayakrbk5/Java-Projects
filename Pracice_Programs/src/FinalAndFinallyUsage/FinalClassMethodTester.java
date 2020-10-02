package FinalAndFinallyUsage;

public class FinalClassMethodTester extends FinalWithClassAndMethod {
	public void display()
	{
		System.out.println("This is display method in child class");
	}
public static void main(String[] args) {
	FinalClassMethodTester obj=new FinalClassMethodTester();
	obj.display();
}

}
